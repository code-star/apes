package nl.codestar.apes.core.generator;

public class CanBuild {

  public static final String CAN_BUILD_CLASS_NAME = "CanBuild";
  public static final String COMBINE_METHOD_NAME = "combine";

  public static class Type {
    private final String hkt;

    public Type(String hkt) {
      this.hkt = hkt;
    }

    public static Type of(String hkt) {
      return new Type(hkt);
    }

    public String generate() {
      return Generic
          .of(CAN_BUILD_CLASS_NAME)
          .withGenerics(hkt)
          .generate();
    }
  }
}
