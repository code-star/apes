package nl.wernerdegroot.functional.syntax.generator;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class Positional {

  public static final List<Positional> ALL = asList(
      new Positional("A", "first"),
      new Positional("B", "second"),
      new Positional("C", "third"),
      new Positional("D", "fourth"),
      new Positional("E", "fifth"),
      new Positional("F", "sixth"),
      new Positional("G", "seventh"),
      new Positional("H", "eight"),
      new Positional("I", "ninth"),
      new Positional("J", "tenth"),
      new Positional("K", "eleventh"),
      new Positional("L", "twelfth"),
      new Positional("M", "thirteenth"),
      new Positional("N", "fourteenth"),
      new Positional("O", "fifteenth"),
      new Positional("P", "sixteenth"),
      new Positional("Q", "seventeenth"),
      new Positional("R", "eighteenth"),
      new Positional("S", "nineteenth"),
      new Positional("T", "twentieth"),
      new Positional("U", "twentyFirst"),
      new Positional("V", "twentySecond"),
      new Positional("W", "twentyThird"),
      new Positional("X", "twentyFourth"),
      new Positional("Y", "twentyFifth"),
      new Positional("Z", "twentySixth")
  );

  private final String type;
  private final String name;

  public Positional(String type, String name) {
    this.type = type;
    this.name = name;
  }

  public Parameter asParameter() {
    return new Parameter(type, name);
  }

  public String getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  public static List<String> types(int numberOfTypes) {
    return Positional.ALL.stream().limit(numberOfTypes).map(Positional::getType).collect(toList());
  }

  public static List<Parameter> parameters(int numberOfParameters) {
    return Positional.ALL.stream().limit(numberOfParameters).map(Positional::asParameter).collect(toList());
  }

  public static List<String> names(int numberOfNames) {
    return Positional.ALL.stream().limit(numberOfNames).map(Positional::getName).collect(toList());
  }

  public static String name(int index) {
    return Positional.ALL.get(index).getName();
  }
}
