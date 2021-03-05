package nl.codestar.apes.core.generator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static nl.codestar.apes.core.generator.Cons.*;
import static nl.codestar.apes.core.generator.Constants.*;
import static nl.codestar.apes.core.generator.Util.append;

public class Function {

  public static String APPLY_METHOD_NAME = "apply";
  public static String WITH_LAST_METHOD_NAME = "withLast";
  public static String APPLY_CONS_METHOD_NAME = "applyCons";

  public static void main(String[] args) throws IOException {
    for (int i = 1; i <= Positional.ALL.size(); ++i) {
      var fileName = getClassName(i) + ".java";
      var writer = new BufferedWriter(new FileWriter(fileName));
      writer.write(generateFunctionN(i));
      writer.close();
    }
  }

  public static Path functionPath(int numberOfArguments) {
    return FUNCTION_PACKAGE_PATH.with(getClassName(numberOfArguments));
  }

  private static String generateFunction1() {
    int numberOfArguments = 1;
    Method applyMethod = applyMethod(numberOfArguments);
    Method applyConsMethod = applyConsMethod(numberOfArguments);
    return new Class(
        new Package(FUNCTION_PACKAGE_PATH),
        emptyList(),
        singletonList(FUNCTIONAL_INTERFACE),
        singletonList(Modifier.PUBLIC),
        Class.Type.INTERFACE,
        getClassName(numberOfArguments),
        append(
            Positional.ALL.stream().limit(numberOfArguments).map(Positional::getType).collect(toList()),
            RETURN_TYPE
        ),
        emptyList(),
        emptyList(),
        asList(applyMethod, applyConsMethod)
    ).generate();
  }

  private static String generateFunctionN(int numberOfArguments) {
    if (numberOfArguments <= 0) {
      throw new IllegalArgumentException();
    }

    if (numberOfArguments <= 1) {
      return generateFunction1();
    }

    Method applyMethod = applyMethod(numberOfArguments);
    Method withLastMethod = withLastMethod(numberOfArguments);
    Method applyConsMethod = applyConsMethod(numberOfArguments);
    return new Class(
        new Package(FUNCTION_PACKAGE_PATH),
        singletonList(new Import(CONS_PATH)),
        singletonList(FUNCTIONAL_INTERFACE),
        singletonList(Modifier.PUBLIC),
        Class.Type.INTERFACE,
        getClassName(numberOfArguments),
        append(
            Positional.ALL.stream().limit(numberOfArguments).map(Positional::getType).collect(toList()),
            RETURN_TYPE
        ),
        emptyList(),
        emptyList(),
        asList(applyMethod, withLastMethod, applyConsMethod)
    ).generate();
  }

  public static String getClassName(int numberOfArguments) {
    return "Function" + numberOfArguments;
  }

  public static String generateFunctionType(int numberOfArguments) {
    return new StringBuilder()
        .append(getClassName(numberOfArguments))
        .append("<")
        .append(Positional.ALL.stream().limit(numberOfArguments).map(Positional::getType).collect(joining(", ")))
        .append(", ")
        .append(RETURN_TYPE)
        .append(">")
        .toString();
  }

  private static Method applyMethod(int numberOfArguments) {
    return new Method(
        emptyList(),
        emptyList(),
        RETURN_TYPE,
        APPLY_METHOD_NAME,
        Positional.ALL.stream().limit(numberOfArguments).map(Positional::asParameter).collect(toList()),
        null
    );
  }

  private static Method withLastMethod(int numberOfArguments) {
    String body = new StringBuilder()
        .append("return (")
        .append(Positional.ALL.stream().limit(numberOfArguments - 1).map(Positional::getName).collect(joining(", ")))
        .append(") -> ")
        .append(APPLY_METHOD_NAME)
        .append("(")
        .append(Positional.ALL.stream().limit(numberOfArguments).map(Positional::getName).collect(joining(", ")))
        .append(");")
        .toString();

    return new Method(
        singletonList(Modifier.DEFAULT),
        emptyList(),
        generateFunctionType(numberOfArguments - 1),
        WITH_LAST_METHOD_NAME,
        singletonList(Positional.ALL.get(numberOfArguments - 1).asParameter()),
        body
    );
  }

  private static Method applyConsMethod(int numberOfArguments) {

    String CONS_PARAMETER_NAME = "c";

    String body = numberOfArguments <= 1
        ? "return " + APPLY_METHOD_NAME + "(" + Positional.ALL.get(0).getName() + ");"
        : "return " + WITH_LAST_METHOD_NAME + "(" + CONS_PARAMETER_NAME + "." + GET_SECOND_METHOD_NAME + "())." + APPLY_CONS_METHOD_NAME + "(" + CONS_PARAMETER_NAME + "." + GET_FIRST_METHOD_NAME + "());";

    List<Parameter> parameters = numberOfArguments <= 1
        ? Positional.ALL.stream().limit(numberOfArguments).map(Positional::asParameter).collect(toList())
        : singletonList(new Parameter(new Cons(numberOfArguments).generate(), CONS_PARAMETER_NAME));

    return new Method(
        singletonList(Modifier.DEFAULT),
        emptyList(),
        RETURN_TYPE,
        APPLY_CONS_METHOD_NAME,
        parameters,
        body
    );

  }

  public static class Type {
    private final int numberOfArguments;
    private final List<String> argumentTypes;
    private final String returnType;

    public Type(int numberOfArguments, List<String> argumentTypes, String returnType) {
      this.numberOfArguments = numberOfArguments;
      this.argumentTypes = argumentTypes;
      this.returnType = returnType;
    }

    public Type(int numberOfArguments) {
      this(numberOfArguments, emptyList(), RETURN_TYPE);
    }

    public static Type ofNumberOfArguments(int numberOfArguments) {
      return new Type(numberOfArguments);
    }

    public Type withArgumentTypes(List<String> argumentTypes) {
      return new Type(numberOfArguments, argumentTypes, returnType);
    }

    public Type withArgumentTypes(String... argumentTypes) {
      return withArgumentTypes(asList(argumentTypes));
    }

    public Type withPositionalArguments() {
      return withArgumentTypes(Positional.ALL.stream().limit(numberOfArguments).map(Positional::getType).collect(toList()));
    }

    public Type withReturnType(String returnType) {
      return new Type(numberOfArguments, argumentTypes, returnType);
    }

    public String generate() {
      return Generic
          .of(getClassName(numberOfArguments))
          .withGenerics(append(argumentTypes, returnType))
          .generate();
    }
  }
}
