package nl.wernerdegroot.functional.syntax.generator;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.joining;

public class Generic {
  private final String type;
  private final List<String> generics;

  public Generic(String type, List<String> generics) {
    this.type = type;
    this.generics = generics;
  }

  public Generic(String type) {
    this(type, emptyList());
  }

  public static Generic of(String type) {
    return new Generic(type);
  }

  public Generic withGenerics(List<String> generics) {
    return new Generic(type, generics);
  }

  public Generic withGenerics(String... generics) {
    return withGenerics(asList(generics));
  }

  public String generate() {
    return type + "<" + String.join(", ", generics) + ">";
  }
}
