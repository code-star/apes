package nl.wernerdegroot.functional.syntax.generator;

import com.fasterxml.jackson.databind.Module;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.joining;
import static nl.wernerdegroot.functional.syntax.generator.Constants.INDENT;
import static nl.wernerdegroot.functional.syntax.generator.Constants.indent;

public class Property {
  private final List<Modifier> modifiers;
  private final String type;
  private final String name;

  public Property(List<Modifier> modifiers, String type, String name) {
    this.modifiers = modifiers;
    this.type = type;
    this.name = name;
  }

  public Property(String type, String name) {
    this(emptyList(), type, name);
  }

  public static Property of(String type, String name) {
    return new Property(type, name);
  }

  public List<Modifier> getModifiers() {
    return modifiers;
  }

  public String getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  public Property withModifiers(List<Modifier> modifiers) {
    return new Property(modifiers, type, name);
  }

  public Property withModifiers(Modifier... modifiers) {
    return withModifiers(asList(modifiers));
  }

  public Parameter asParameter() {
    return Parameter.of(type, name);
  }

  public String generate() {
    return indent(1)
        + modifiers.stream().map(Modifier::generate).collect(joining(" "))
        + " "
        + type
        + " "
        + name
        + ";";
  }
}
