package nl.wernerdegroot.functional.syntax.generator;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.singletonList;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static nl.wernerdegroot.functional.syntax.generator.Class.Type.CLASS;
import static nl.wernerdegroot.functional.syntax.generator.Constants.CAN_BUILD_PACKAGE_PATH;
import static nl.wernerdegroot.functional.syntax.generator.Constants.MU_TYPE;
import static nl.wernerdegroot.functional.syntax.generator.Hkt.HKT_PATH;
import static nl.wernerdegroot.functional.syntax.generator.Modifier.*;

public class Builder {

  public static String BUILDER_CLASS_NAME = "Builder";

  public static void main(String[] args) {
    System.out.println(new Builder().generate());
  }

  public String generate() {

    List<Property> properties = singletonList(canBuildProperty());

    List<Method> methods = new ArrayList<>();
    methods.add(ofMethod());
    for (int i = 1; i <= Positional.ALL.size(); ++i) {
      methods.add(ofMethod(i));
    }

    return Class
        .withName(BUILDER_CLASS_NAME)
        .withPackage(CAN_BUILD_PACKAGE_PATH)
        .withImports(HKT_PATH)
        .withModifiers(PUBLIC)
        .withType(CLASS)
        .withGenerics(MU_TYPE)
        .withProperties(properties)
        .withConstructors(Constructor.forClass(BUILDER_CLASS_NAME).withModifiers(PUBLIC).withProperties(properties))
        .withMethods(methods)
        .generate();
  }

  private Method ofMethod() {
    return Method
        .withName("of")
        .withModifiers(PUBLIC, STATIC)
        .withGenerics(MU_TYPE)
        .withReturnType(Type.of(MU_TYPE).generate())
        .withParameters(canBuildProperty().asParameter())
        .withBody("return new " + BUILDER_CLASS_NAME + "<>(" + canBuildProperty().getName() + ");");
  }

  private Method ofMethod(int numberOfElements) {

    String OF_METHOD_NAME = "of";

    String body = numberOfElements >= 2
        ? new StringBuilder()
        .append("return ")
        .append(OF_METHOD_NAME)
        .append("(")
        .append(Positional.names(numberOfElements - 1).stream().collect(joining(", ")))
        .append(").")
        .append(BuilderN.AND_METHOD_NAME)
        .append("(")
        .append(Positional.name(numberOfElements - 1))
        .append(");")
        .toString()
        : new StringBuilder()
        .append("return new ")
        .append(BuilderN.getClassName(1))
        .append("<>(")
        .append(canBuildProperty().getName())
        .append(", ")
        .append(Positional.name(0))
        .append(");")
        .toString();

    return Method
        .withName(OF_METHOD_NAME)
        .withModifiers(PUBLIC)
        .withGenerics(Positional.types(numberOfElements))
        .withReturnType(BuilderN.Type.of(MU_TYPE).withNumberOfElements(numberOfElements).generate())
        .withParameters(Positional.parameters(numberOfElements).stream().map(p -> p.hkt(MU_TYPE)).collect(toList()))
        .withBody(body);
  }

  private Property canBuildProperty() {
    return Property.of(
        CanBuild.Type.of(MU_TYPE).generate(),
        "canBuild"
    ).withModifiers(PRIVATE, FINAL);
  }

  public static class Type {
    private final String hkt;

    public Type(String hkt) {
      this.hkt = hkt;
    }

    public static Type of(String hkt) {
      return new Type(hkt);
    }

    public String generate() {
      return Generic.of(BUILDER_CLASS_NAME).withGenerics(hkt).generate();
    }
  }
}
