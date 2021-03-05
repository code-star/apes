package nl.wernerdegroot.functional.syntax.generator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.Collections.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static nl.wernerdegroot.functional.syntax.generator.CanBuild.CAN_BUILD_CLASS_NAME;
import static nl.wernerdegroot.functional.syntax.generator.CanBuild.COMBINE_METHOD_NAME;
import static nl.wernerdegroot.functional.syntax.generator.Cons.CONS_PATH;
import static nl.wernerdegroot.functional.syntax.generator.Constants.*;
import static nl.wernerdegroot.functional.syntax.generator.Function.APPLY_CONS_METHOD_NAME;
import static nl.wernerdegroot.functional.syntax.generator.Function.functionPath;
import static nl.wernerdegroot.functional.syntax.generator.Hkt.HKT_CLASS_NAME;
import static nl.wernerdegroot.functional.syntax.generator.Hkt.HKT_PATH;
import static nl.wernerdegroot.functional.syntax.generator.Modifier.PUBLIC;
import static nl.wernerdegroot.functional.syntax.generator.Typeclass.*;

public class BuilderN {

  public static final String CAN_BUILD_TYPE = CAN_BUILD_CLASS_NAME + "<" + MU_TYPE + ">";
  public static final String CAN_BUILD_NAME = "canBuild";
  public static final String PREVIOUS_NAME = "previous";
  public static final String GET_PREVIOUS_METHOD_NAME = "getPrevious";
  public static final String CURRENT_NAME = "current";
  public static final String GET_CURRENT_METHOD_NAME = "getCurrent";
  public static final String COMBINED_METHOD_NAME = "combined";
  public static final String AND_METHOD_NAME = "and";
  public static final String MAP_METHOD_NAME = "map";
  public static final String CONTRAMAP_METHOD_NAME = "contramap";
  public static final String INMAP_METHOD_NAME = "inmap";

  public static void main(String[] args) throws IOException {
    for (int i = 1; i <= Positional.ALL.size(); ++i) {
      var fileName = getClassName(i) + ".java";
      var writer = new BufferedWriter(new FileWriter(fileName));
      writer.write(generate(i));
      writer.close();
    }
  }

  public static String getClassName(int numberOfParameters) {
    return "Builder" + numberOfParameters;
  }

  private static String getBuilderType(int numberOfElements) {
    return Type.of(MU_TYPE).withNumberOfElements(numberOfElements).generate();
  }

  private static String getBuilderType(List<String> elementTypes) {
    return Type.of(MU_TYPE).withElementTypes(elementTypes).generate();
  }

  private static String getHktType(int parameterIndex) {
    return new StringBuilder()
        .append(HKT_CLASS_NAME)
        .append("<")
        .append(MU_TYPE)
        .append(", ")
        .append(Positional.ALL.get(parameterIndex - 1).getType())
        .append(">")
        .toString();
  }

  private static String generate(int numberOfParameters) {

    List<Path> imports = new ArrayList<>();
    imports.add(functionPath(1));
    if (numberOfParameters >= 2) {
      imports.add(functionPath(numberOfParameters));
    }
    imports.add(HKT_PATH);
    if (numberOfParameters >= 2) {
      imports.add(CONS_PATH);
    }
    imports.add(FUNCTOR_PATH);
    imports.add(CONTRAVARIANT_PATH);
    imports.add(INVARIANT_PATH);

    List<Property> properties = new ArrayList<>();
    properties.add(new Property(asList(Modifier.PRIVATE, Modifier.FINAL), CAN_BUILD_TYPE, CAN_BUILD_NAME));
    if (numberOfParameters >= 2) {
      properties.add(new Property(asList(Modifier.PRIVATE, Modifier.FINAL), getBuilderType(numberOfParameters - 1), PREVIOUS_NAME));
    }
    properties.add(new Property(asList(Modifier.PRIVATE, Modifier.FINAL), getHktType(numberOfParameters), CURRENT_NAME));

    List<Method> methods = new ArrayList<>();
    if (numberOfParameters >= 2) {
      methods.add(getPreviousMethod(numberOfParameters));
    }
    methods.add(getCurrentMethod(numberOfParameters));
    methods.add(combinedMethod(numberOfParameters));
    if (numberOfParameters < Positional.ALL.size()) {
      methods.add(andHktMethod(numberOfParameters));
    }
    for (int i = 1; i + numberOfParameters <= Positional.ALL.size(); ++i) {
      methods.add(andBuilderMethod(numberOfParameters, i));
    }
    methods.add(mapMethod(numberOfParameters));
    methods.add(contramapMethod(numberOfParameters));
    methods.add(inmapMethod(numberOfParameters));

    return new Class(
        new Package(CAN_BUILD_PACKAGE_PATH),
        imports.stream().map(Import::new).collect(toList()),
        emptyList(),
        singletonList(PUBLIC),
        Class.Type.CLASS,
        getClassName(numberOfParameters),
        Stream.concat(
            Stream.of(MU_TYPE),
            Positional.ALL.stream().limit(numberOfParameters).map(Positional::getType)
        ).collect(toList()),
        properties,
        singletonList(new Constructor(singletonList(PUBLIC), getClassName(numberOfParameters), properties)),
        methods
    ).generate();
  }

  private static Method getPreviousMethod(int numberOfElements) {
    return new Method(GET_PREVIOUS_METHOD_NAME)
        .withModifiers(PUBLIC)
        .withReturnType(getBuilderType(numberOfElements - 1))
        .withBody("return " + PREVIOUS_NAME + ";");
  }

  private static Method getCurrentMethod(int numberOfElements) {
    return new Method(GET_CURRENT_METHOD_NAME)
        .withModifiers(PUBLIC)
        .withReturnType(getHktType(numberOfElements))
        .withBody("return " + CURRENT_NAME + ";");
  }

  private static Method combinedMethod(int numberOfParameters) {

    String body = numberOfParameters >= 2
        ? "return " + CAN_BUILD_NAME + "." + COMBINE_METHOD_NAME + "(" + PREVIOUS_NAME + "." + COMBINED_METHOD_NAME + "(), " + CURRENT_NAME + ");"
        : "return " + CURRENT_NAME + ";";

    return new Method(
        emptyList(),
        emptyList(),
        HKT_CLASS_NAME + "<" + MU_TYPE + ", " + new Cons(numberOfParameters).generate() + ">",
        COMBINED_METHOD_NAME,
        emptyList(),
        body
    );
  }

  private static Method andHktMethod(int numberOfParameters) {

    Positional parameterPositional = Positional.ALL.get(numberOfParameters);
    String parameterType = HKT_CLASS_NAME + "<" + MU_TYPE + ", " + parameterPositional.getType() + ">";
    String parameterName = (MU_TYPE + parameterPositional.getType()).toLowerCase();
    Parameter parameter = new Parameter(parameterType, parameterName);

    return new Method(
        singletonList(PUBLIC),
        singletonList(Positional.ALL.get(numberOfParameters).getType()),
        getBuilderType(numberOfParameters + 1),
        AND_METHOD_NAME,
        singletonList(parameter),
        "return new " + getClassName(numberOfParameters + 1) + "<>(" + CAN_BUILD_NAME + ", this, " + parameter.getName() + ");"
    );
  }

  private static Method andBuilderMethod(int numberOfElements, int numberOfElementsToAdd) {
    String THAT_PARAMETER_NAME = "that";

    String body = numberOfElementsToAdd <= 1
        ? "return " + AND_METHOD_NAME + "(" + THAT_PARAMETER_NAME + "." + GET_CURRENT_METHOD_NAME + "());"
        : "return " + AND_METHOD_NAME + "(" + THAT_PARAMETER_NAME + "." + GET_PREVIOUS_METHOD_NAME + "())." + AND_METHOD_NAME + "(" + THAT_PARAMETER_NAME + "." + GET_CURRENT_METHOD_NAME + "());";

    List<Positional> positionalsToAdd = Positional.ALL.subList(numberOfElements, numberOfElements + numberOfElementsToAdd);
    return new Method(AND_METHOD_NAME)
        .withModifiers(PUBLIC)
        .withGenerics(positionalsToAdd.stream().map(Positional::getType).collect(toList()))
        .withReturnType(getBuilderType(numberOfElements + numberOfElementsToAdd))
        .withParameters(Parameter.of(getBuilderType(positionalsToAdd.stream().map(Positional::getType).collect(toList())), THAT_PARAMETER_NAME))
        .withBody(body);
  }

  private static Method mapMethod(int numberOfParameters) {
    String FUNCTION_PARAMETER_NAME = "fn";
    String FUNCTION_PARAMETER_TYPE = Function.Type.ofNumberOfArguments(numberOfParameters)
        .withPositionalArguments()
        .withReturnType(RETURN_TYPE)
        .generate();

    String FUNCTOR_PARAMETER_NAME = "functor";

    String APPLY_FUNCTION_PARAMETER = numberOfParameters >= 2
        ? FUNCTION_PARAMETER_NAME + "::" + APPLY_CONS_METHOD_NAME
        : FUNCTION_PARAMETER_NAME;

    return new Method(MAP_METHOD_NAME)
        .withModifiers(PUBLIC)
        .withGenerics(RETURN_TYPE)
        .withReturnType(Hkt.generate(MU_TYPE, RETURN_TYPE))
        .withParameters(
            new Parameter(FUNCTION_PARAMETER_TYPE, FUNCTION_PARAMETER_NAME),
            new Parameter(Functor.Type.of(MU_TYPE).generate(), FUNCTOR_PARAMETER_NAME)
        )
        .withBody("return " + FUNCTOR_PARAMETER_NAME + "." + Functor.MAP_METHOD_NAME + "(" + COMBINED_METHOD_NAME + "(), " + APPLY_FUNCTION_PARAMETER + ");");
  }

  private static Method contramapMethod(int numberOfParameters) {
    String FUNCTION_PARAMETER_NAME = "fn";
    String FUNCTION_PARAMETER_TYPE = Function.Type
        .ofNumberOfArguments(1)
        .withArgumentTypes(RETURN_TYPE)
        .withReturnType(Cons.Type.ofNumberOfElements(numberOfParameters).generate())
        .generate();

    String CONTRAVARIANT_PARAMETER_NAME = "contravariant";

    return new Method(CONTRAMAP_METHOD_NAME)
        .withModifiers(PUBLIC)
        .withGenerics(RETURN_TYPE)
        .withReturnType(Hkt.generate(MU_TYPE, RETURN_TYPE))
        .withParameters(
            new Parameter(FUNCTION_PARAMETER_TYPE, FUNCTION_PARAMETER_NAME),
            new Parameter(Contravariant.Type.of(MU_TYPE).generate(), CONTRAVARIANT_PARAMETER_NAME)
        )
        .withBody("return " + CONTRAVARIANT_PARAMETER_NAME + "." + Contravariant.CONTRAMAP_METHOD_NAME + "(" + COMBINED_METHOD_NAME + "(), " + FUNCTION_PARAMETER_NAME + ");");
  }

  private static Method inmapMethod(int numberOfParameters) {
    String MAP_FUNCTION_PARAMETER_NAME = "fn";
    String MAP_FUNCTION_PARAMETER_TYPE = Function.Type
        .ofNumberOfArguments(numberOfParameters)
        .withPositionalArguments()
        .withReturnType(RETURN_TYPE)
        .generate();

    String CONTRAMAP_FUNCTION_PARAMETER_NAME = "gn";
    String CONTRAMAP_FUNCTION_PARAMETER_TYPE = Function.Type
        .ofNumberOfArguments(1)
        .withArgumentTypes(RETURN_TYPE)
        .withReturnType(Cons.Type.ofNumberOfElements(numberOfParameters).generate())
        .generate();

    String INVARIANT_PARAMETER_NAME = "invariant";

    String APPLY_MAP_FUNCTION_PARAMETER = numberOfParameters >= 2
        ? MAP_FUNCTION_PARAMETER_NAME + "::" + APPLY_CONS_METHOD_NAME
        : MAP_FUNCTION_PARAMETER_NAME;

    return new Method(INMAP_METHOD_NAME)
        .withModifiers(PUBLIC)
        .withGenerics(RETURN_TYPE)
        .withReturnType(Hkt.generate(MU_TYPE, RETURN_TYPE))
        .withParameters(
            Parameter.of(MAP_FUNCTION_PARAMETER_TYPE, MAP_FUNCTION_PARAMETER_NAME),
            Parameter.of(CONTRAMAP_FUNCTION_PARAMETER_TYPE, CONTRAMAP_FUNCTION_PARAMETER_NAME),
            Parameter.of(Invariant.Type.of(MU_TYPE).generate(), INVARIANT_PARAMETER_NAME)
        )
        .withBody("return " + INVARIANT_PARAMETER_NAME + "." + Invariant.INMAP_METHOD_NAME + "(" + COMBINED_METHOD_NAME + "(), " + APPLY_MAP_FUNCTION_PARAMETER + ", " + CONTRAMAP_FUNCTION_PARAMETER_NAME + ");");
  }

  public static class Type {
    private final String hkt;
    private final List<String> elementTypes;

    public Type(String hkt, List<String> elementTypes) {
      this.hkt = hkt;
      this.elementTypes = elementTypes;
    }

    public Type(String hkt) {
      this(hkt, emptyList());
    }

    public static Type of(String hkt) {
      return new Type(hkt);
    }

    public Type withElementTypes(List<String> elementTypes) {
      return new Type(hkt, elementTypes);
    }

    public Type withNumberOfElements(int numberOfElements) {
      return new Type(hkt, Positional.types(numberOfElements));
    }

    public String generate() {
      return new StringBuilder()
          .append(getClassName(elementTypes.size()))
          .append("<")
          .append(hkt)
          .append(", ")
          .append(elementTypes.stream().collect(joining(", ")))
          .append(">")
          .toString();
    }
  }
}
