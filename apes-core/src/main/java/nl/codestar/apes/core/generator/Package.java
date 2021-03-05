package nl.codestar.apes.core.generator;

public class Package {
  private final Path location;

  public Package(Path location) {
    this.location = location;
  }

  public Path getLocation() {
    return location;
  }

  public String generate() {
    return "package " + location.generate() + ";";
  }
}
