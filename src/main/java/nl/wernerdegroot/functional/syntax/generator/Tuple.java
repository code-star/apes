package nl.wernerdegroot.functional.syntax.generator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static nl.wernerdegroot.functional.syntax.generator.Cons.CONS_CLASS_NAME;
import static nl.wernerdegroot.functional.syntax.generator.Constants.TUPLE_PACKAGE_PATH;
import static nl.wernerdegroot.functional.syntax.generator.Function.APPLY_METHOD_NAME;
import static nl.wernerdegroot.functional.syntax.generator.Function.functionPath;
import static nl.wernerdegroot.functional.syntax.generator.Modifier.PUBLIC;
import static nl.wernerdegroot.functional.syntax.generator.Modifier.STATIC;

public class Tuple {

  public static void main(String[] args) throws IOException {
    var fileName = "Tuple.java";
    var writer = new BufferedWriter(new FileWriter(fileName));
    writer.write(generateTuple());
    writer.close();
  }

  public static String OF_METHOD_NAME = "of";

  public static String generateTuple() {
    return new Class(
        new Package(TUPLE_PACKAGE_PATH),
        singletonList(new Import(functionPath(1))),
        emptyList(),
        singletonList(PUBLIC),
        Class.Type.CLASS,
        "Tuple",
        emptyList(),
        emptyList(),
        emptyList(),
        Stream.concat(
            IntStream.range(2, Positional.ALL.size()).mapToObj(Tuple::ofMethod),
            IntStream.range(2, Positional.ALL.size()).mapToObj(Tuple::byMethod)
        ).collect(toList())
    ).generate();
  }

  private static Method ofMethod(int numberOfParameters) {

    if (numberOfParameters <= 1) {
      throw new IllegalArgumentException();
    }

    var init = Positional.ALL.stream().map(Positional::getName).limit(numberOfParameters - 1).collect(toList());
    String firstParameter = init.size() <= 1
        ? init.get(0)
        : OF_METHOD_NAME + "(" + init.stream().collect(joining(", ")) + ")";
    var secondParameter = Positional.ALL.get(numberOfParameters - 1).getName();
    String body = "return new " + CONS_CLASS_NAME + "<>(" + firstParameter + ", " + secondParameter + ");";

    return new Method(
        asList(PUBLIC, STATIC),
        Positional.ALL.stream().limit(numberOfParameters).map(Positional::getType).collect(toList()),
        new Cons(numberOfParameters).generate(),
        OF_METHOD_NAME,
        Positional.ALL.stream().limit(numberOfParameters).map(Positional::asParameter).collect(toList()),
        body
    );
  }

  public static Method byMethod(int numberOfParameters) {
    String INPUT_TYPE = "Input";
    String INPUT_NAME = "i";

    var parameters = Positional.ALL
        .stream()
        .limit(numberOfParameters)
        .map(p -> {
          var type = functionType(INPUT_TYPE, p.getType());
          var name = p.getName();
          return new Parameter(type, name);
        })
        .collect(toList());

    String body = new StringBuilder()
        .append("return")
        .append(" ")
        .append(INPUT_NAME)
        .append(" -> ")
        .append(OF_METHOD_NAME)
        .append("(")
        .append(parameters.stream().map(p -> p.getName() + "." + APPLY_METHOD_NAME + "(" + INPUT_NAME + ")").collect(joining(", ")))
        .append(")")
        .append(";")
        .toString();

    return new Method(
        asList(PUBLIC, STATIC),
        Stream.concat(
            Stream.of(INPUT_TYPE),
            Positional.ALL.stream().limit(numberOfParameters).map(Positional::getType)
        ).collect(toList()),
        functionType(INPUT_TYPE, new Cons(numberOfParameters).generate()),
        "by",
        parameters,
        body
    );
  }

  private static String functionType(String input, String output) {
    return Function.getClassName(1) + "<" + input + ", " + output + ">";
  }
}
