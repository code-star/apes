package nl.codestar.apes.core.generator;

public class Invariant {

  public static final String INVARIANT_CLASS_NAME = "Invariant";
  public static final String INMAP_METHOD_NAME = "inmap";

  public static class Type {
    private final String mu;

    public Type(String mu) {
      this.mu = mu;
    }

    public static Type of(String mu) {
      return new Type(mu);
    }

    public String generate() {
      return Generic.of(INVARIANT_CLASS_NAME).withGenerics(mu).generate();
    }
  }
}
