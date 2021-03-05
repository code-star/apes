package nl.codestar.apes.core.generator;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.joining;
import static nl.codestar.apes.core.generator.Constants.*;

public class Constructor {
  private final List<Modifier> modifiers;
  private final String className;
  private final List<Property> properties;

  public Constructor(List<Modifier> modifiers, String className, List<Property> properties) {
    this.modifiers = modifiers;
    this.className = className;
    this.properties = properties;
  }

  public Constructor(String className) {
    this(emptyList(), className, emptyList());
  }

  public static Constructor forClass(String className) {
    return new Constructor(className);
  }

  public List<Modifier> getModifiers() {
    return modifiers;
  }

  public String getClassName() {
    return className;
  }

  public List<Property> getProperties() {
    return properties;
  }

  public Constructor withModifiers(List<Modifier> modifiers) {
    return new Constructor(modifiers, className, properties);
  }

  public Constructor withModifiers(Modifier... modifiers) {
    return withModifiers(asList(modifiers));
  }

  public Constructor withProperties(List<Property> properties) {
    return new Constructor(modifiers, className, properties);
  }

  public String generate() {

    String body = properties
        .stream()
        .map(p -> indent(2) + "this." + p.getName() + " = " + p.getName() + ";")
        .collect(joining(LINE_FEED));

    var sb = new StringBuilder();

    sb.append(indent(1));

    if (!modifiers.isEmpty()) {
      sb.append(modifiers.stream().map(Modifier::generate).collect(joining(" ")));
      sb.append(" ");
    }

    sb.append(className);
    sb.append("(");
    sb.append(properties.stream().map(p -> p.getType() + " " + p.getName()).collect(joining(", ")));
    sb.append(") {");
    sb.append(LINE_FEED);
    sb.append(body);
    sb.append(LINE_FEED);
    sb.append(indent(1));
    sb.append("}");

    return sb.toString();
  }
}
