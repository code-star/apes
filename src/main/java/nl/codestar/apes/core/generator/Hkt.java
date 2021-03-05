package nl.codestar.apes.core.generator;

import static nl.codestar.apes.core.generator.Constants.BASE_PATH;

public class Hkt {
  public static Path HKT_PACKAGE_PATH = BASE_PATH.with("hkt");
  public static final String HKT_CLASS_NAME = "Hkt";
  public static Path HKT_PATH = HKT_PACKAGE_PATH.with(HKT_CLASS_NAME);

  public static String generate(String mu, String type) {
    return Type.of(mu, type).generate();
  }

  public static class Type {
    private final String mu;
    private final String type;

    public Type(String mu, String type) {
      this.mu = mu;
      this.type = type;
    }

    public static Type of(String mu, String type) {
      return new Type(mu, type);
    }

    public String generate() {
      return Generic.of(HKT_CLASS_NAME).withGenerics(mu, type).generate();
    }
  }
}
