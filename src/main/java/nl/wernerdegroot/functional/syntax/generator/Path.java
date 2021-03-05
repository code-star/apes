package nl.wernerdegroot.functional.syntax.generator;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.joining;
import static nl.wernerdegroot.functional.syntax.generator.Util.concat;

public class Path {
  private final List<String> components;

  public Path(List<String> components) {
    this.components = components;
  }

  public Path(String... components) {
    this(asList(components));
  }

  public Path with(String... components) {
    return new Path(concat(this.components, asList(components)));
  }

  public List<String> getComponents() {
    return components;
  }

  public String generate() {
    return components.stream().collect(joining("."));
  }
}
