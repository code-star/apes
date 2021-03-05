package nl.wernerdegroot.functional.syntax.generator;

public class Import {
  private final Path path;

  public Import(Path path) {
    this.path = path;
  }

  public Path getPath() {
    return path;
  }

  public String generate() {
    return "import " + path.generate() + ";";
  }
}
