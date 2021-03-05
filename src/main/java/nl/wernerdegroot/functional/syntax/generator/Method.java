package nl.wernerdegroot.functional.syntax.generator;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.joining;
import static nl.wernerdegroot.functional.syntax.generator.Constants.*;

public class Method {
  private final List<Modifier> modifiers;
  private final List<String> generics;
  private final String returnType;
  private final String name;
  private final List<Parameter> parameters;
  private final String body;

  public Method(List<Modifier> modifiers, List<String> generics, String returnType, String name, List<Parameter> parameters, String body) {
    this.modifiers = modifiers;
    this.generics = generics;
    this.returnType = returnType;
    this.name = name;
    this.parameters = parameters;
    this.body = body;
  }

  public Method(String name) {
    this(emptyList(), emptyList(), VOID_TYPE, name, emptyList(), null);
  }

  public static Method withName(String name) {
    return new Method(name);
  }

  public Method withModifiers(List<Modifier> modifiers) {
    return new Method(modifiers, generics, returnType, name, parameters, body);
  }

  public Method withModifiers(Modifier... modifiers) {
    return withModifiers(asList(modifiers));
  }

  public Method withGenerics(List<String> generics) {
    return new Method(modifiers, generics, returnType, name, parameters, body);
  }

  public Method withGenerics(String... generics) {
    return withGenerics(asList(generics));
  }

  public Method withReturnType(String returnType) {
    return new Method(modifiers, generics, returnType, name, parameters, body);
  }

  public Method withParameters(List<Parameter> parameters) {
    return new Method(modifiers, generics, returnType, name, parameters, body);
  }

  public Method withParameters(Parameter... parameters) {
    return withParameters(asList(parameters));
  }

  public Method withBody(String body) {
    return new Method(modifiers, generics, returnType, name, parameters, body);
  }

  public List<Modifier> getModifiers() {
    return modifiers;
  }

  public List<String> getGenerics() {
    return generics;
  }

  public String getReturnType() {
    return returnType;
  }

  public String getName() {
    return name;
  }

  public List<Parameter> getParameters() {
    return parameters;
  }

  public String getBody() {
    return body;
  }

  public String generate() {
    var sb = new StringBuilder();

    sb.append(indent(1));

    if (!modifiers.isEmpty()) {
      sb.append(modifiers.stream().map(Modifier::generate).collect(joining(" ")));
      sb.append(" ");
    }

    if (!generics.isEmpty()) {
      sb.append("<");
      sb.append(generics.stream().collect(joining(", ")));
      sb.append(">");
      sb.append(" ");
    }

    sb.append(returnType);
    sb.append(" ");
    sb.append(name);
    sb.append("(");
    sb.append(parameters.stream().map(Parameter::generate).collect(joining(", ")));
    sb.append(")");

    if (body == null) {
      sb.append(";");
    } else {
      sb.append(" ");
      sb.append("{");
      sb.append(LINE_FEED);
      sb.append(indent(2));
      sb.append(body);
      sb.append(LINE_FEED);
      sb.append(indent(1));
      sb.append("}");
    }

    return sb.toString();
  }
}
