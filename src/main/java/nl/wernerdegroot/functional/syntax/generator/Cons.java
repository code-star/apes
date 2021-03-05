package nl.wernerdegroot.functional.syntax.generator;

import static nl.wernerdegroot.functional.syntax.generator.Constants.TUPLE_PACKAGE_PATH;

public class Cons {

  public static String CONS_CLASS_NAME = "Cons";
  public static Path CONS_PATH = TUPLE_PACKAGE_PATH.with(CONS_CLASS_NAME);
  public static String GET_FIRST_METHOD_NAME = "getFirst";
  public static String GET_SECOND_METHOD_NAME = "getSecond";

  private final int numberOfElements;

  public Cons(int numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  public int getNumberOfElements() {
    return numberOfElements;
  }

  public String generate() {

    if (numberOfElements <= 0) {
      throw new IllegalArgumentException();
    }

    String typeOfCurrent = Positional.ALL.get(numberOfElements - 1).getType();

    if (numberOfElements <= 1) {
      return typeOfCurrent;
    }

    return new StringBuilder()
        .append(CONS_CLASS_NAME)
        .append("<")
        .append(new Cons(numberOfElements - 1).generate())
        .append(", ")
        .append(typeOfCurrent)
        .append(">")
        .toString();
  }

  public static class Type {
    private final int numberOfElements;

    public Type(int numberOfElements) {
      this.numberOfElements = numberOfElements;
    }

    public static Type ofNumberOfElements(int numberOfElements) {
      return new Type(numberOfElements);
    }

    public String generate() {
      return new Cons(numberOfElements).generate();
    }
  }
}
