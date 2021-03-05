package nl.wernerdegroot.functional.syntax.generator;

public class Contravariant {

  public static final String CONTRAVARIANT_CLASS_NAME = "Contravariant";
  public static final String CONTRAMAP_METHOD_NAME = "contramap";

  public static class Type {
    private final String mu;

    public Type(String mu) {
      this.mu = mu;
    }

    public static Type of(String mu) {
      return new Type(mu);
    }

    public String generate() {
      return Generic.of(CONTRAVARIANT_CLASS_NAME).withGenerics(mu).generate();
    }
  }

}
