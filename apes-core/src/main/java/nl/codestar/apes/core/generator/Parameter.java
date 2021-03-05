package nl.codestar.apes.core.generator;

public class Parameter {

  private final String type;
  private final String name;

  public Parameter(String type, String name) {
    this.type = type;
    this.name = name;
  }

  public static Parameter of(String type, String name) {
    return new Parameter(type, name);
  }

  public String getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  public Parameter hkt(String mu) {
    return new Parameter(Hkt.Type.of(mu, type).generate(), name);
  }

  public String generate() {
    return type + " " + name;
  }
}
