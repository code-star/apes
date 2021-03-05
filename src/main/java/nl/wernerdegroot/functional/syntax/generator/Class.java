package nl.wernerdegroot.functional.syntax.generator;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static nl.wernerdegroot.functional.syntax.generator.Class.Type.CLASS;
import static nl.wernerdegroot.functional.syntax.generator.Constants.*;

public class Class {

  public enum Type {
    INTERFACE("interface"),
    CLASS("class");

    private final String generated;

    Type(String generated) {
      this.generated = generated;
    }

    public String generate() {
      return generated;
    }
  }

  private final Package packag;
  private final List<Import> imports;
  private final List<String> annotations;
  private final List<Modifier> modifiers;
  private final Type type;
  private final String name;
  private final List<String> generics;
  private final List<Property> properties;
  private final List<Constructor> constructors;
  private final List<Method> methods;

  public Class(Package packag, List<Import> imports, List<String> annotations, List<Modifier> modifiers, Type type, String name, List<String> generics, List<Property> properties, List<Constructor> constructors, List<Method> methods) {
    this.packag = packag;
    this.imports = imports;
    this.annotations = annotations;
    this.modifiers = modifiers;
    this.type = type;
    this.name = name;
    this.generics = generics;
    this.properties = properties;
    this.constructors = constructors;
    this.methods = methods;
  }

  public Class(String name) {
    this(null, emptyList(), emptyList(), emptyList(), CLASS, name, emptyList(), emptyList(), emptyList(), emptyList());
  }

  public static Class withName(String name) {
    return new Class(name);
  }

  public Package getPackage() {
    return packag;
  }

  public List<Import> getImports() {
    return imports;
  }

  public List<String> getAnnotations() {
    return annotations;
  }

  public List<Modifier> getModifiers() {
    return modifiers;
  }

  public Type getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  public List<String> getGenerics() {
    return generics;
  }

  public List<Property> getProperties() {
    return properties;
  }

  public List<Constructor> getConstructors() {
    return constructors;
  }

  public List<Method> getMethods() {
    return methods;
  }

  public Class withPackage(Package packag) {
    return new Class(packag, imports, annotations, modifiers, type, name, generics, properties, constructors, methods);
  }

  public Class withPackage(Path path) {
    return withPackage(new Package(path));
  }

  public Class withImports(List<Import> imports) {
    return new Class(packag, imports, annotations, modifiers, type, name, generics, properties, constructors, methods);
  }

  public Class withImports(Path... imports) {
    return withImports(Stream.of(imports).map(Import::new).collect(toList()));
  }

  public Class withAnnotations(List<String> annotations) {
    return new Class(packag, imports, annotations, modifiers, type, name, generics, properties, constructors, methods);
  }

  public Class withModifiers(List<Modifier> modifiers) {
    return new Class(packag, imports, annotations, modifiers, type, name, generics, properties, constructors, methods);
  }

  public Class withModifiers(Modifier... modifiers) {
    return withModifiers(asList(modifiers));
  }

  public Class withType(Type type) {
    return new Class(packag, imports, annotations, modifiers, type, name, generics, properties, constructors, methods);
  }

  public Class withGenerics(List<String> generics) {
    return new Class(packag, imports, annotations, modifiers, type, name, generics, properties, constructors, methods);
  }

  public Class withGenerics(String... generics) {
    return withGenerics(asList(generics));
  }

  public Class withProperties(List<Property> properties) {
    return new Class(packag, imports, annotations, modifiers, type, name, generics, properties, constructors, methods);
  }

  public Class withConstructors(List<Constructor> constructors) {
    return new Class(packag, imports, annotations, modifiers, type, name, generics, properties, constructors, methods);
  }

  public Class withConstructors(Constructor... constructors) {
    return withConstructors(asList(constructors));
  }

  public Class withMethods(List<Method> methods) {
    return new Class(packag, imports, annotations, modifiers, type, name, generics, properties, constructors, methods);
  }

  public Class withMethods(Method... methods) {
    return withMethods(asList(methods));
  }

  public String generate() {
    var sb = new StringBuilder();
    sb.append(packag.generate());

    if (!imports.isEmpty()) {
      sb.append(WHITELINE);
      sb.append(imports.stream().map(Import::generate).collect(joining(LINE_FEED)));
    }

    sb.append(WHITELINE);

    if (!annotations.isEmpty()) {
      sb.append(annotations.stream().collect(joining(LINE_FEED)));
      sb.append(LINE_FEED);
    }

    if (!modifiers.isEmpty()) {
      sb.append(modifiers.stream().map(Modifier::generate).collect(joining(" ")));
      sb.append(" ");
    }

    sb.append(type.generate());
    sb.append(" ");
    sb.append(name);

    if (!generics.isEmpty()) {
      sb.append("<");
      sb.append(generics.stream().collect(joining(", ")));
      sb.append(">");
    }

    sb.append(" {");

    if (!properties.isEmpty()) {
      sb.append(WHITELINE);
      sb.append(properties.stream().map(Property::generate).collect(joining(LINE_FEED)));
    }

    if (!constructors.isEmpty()) {
      sb.append(WHITELINE);
      sb.append(constructors.stream().map(Constructor::generate).collect(joining(WHITELINE)));
    }

    if (!methods.isEmpty()) {
      sb.append(WHITELINE);
      sb.append(methods.stream().map(Method::generate).collect(joining(WHITELINE)));
    }

    sb.append(WHITELINE);
    sb.append("}");

    return sb.toString();
  }
}
