package nl.wernerdegroot.functional.syntax.generator;

public class Functor {
  public static final String MAP_METHOD_NAME = "map";
  public static final String FUNCTOR_CLASS_NAME = "Functor";

  public static class Type {
    private final String mu;

    public Type(String mu) {
      this.mu = mu;
    }

    public static Type of(String mu) {
      return new Type(mu);
    }

    public String generate() {
      return Generic.of(FUNCTOR_CLASS_NAME).withGenerics(mu).generate();
    }
  }
}
