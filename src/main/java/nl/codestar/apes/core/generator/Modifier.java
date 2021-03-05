package nl.codestar.apes.core.generator;

public enum Modifier {
  DEFAULT("default"),
  PUBLIC("public"),
  STATIC("static"),
  PRIVATE("private"),
  FINAL("final");

  private final String generated;

  Modifier(String generated) {
    this.generated = generated;
  }

  public String generate() {
    return generated;
  }
}
