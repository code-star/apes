package nl.codestar.apes.core.generator;

import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;

public class Constants {
  public static Path BASE_PATH = new Path("nl", "codestar", "apes", "core");
  public static Path FUNCTION_PACKAGE_PATH = BASE_PATH.with("function");
  public static Path CAN_BUILD_PACKAGE_PATH = BASE_PATH.with("canbuild");
  public static Path TUPLE_PACKAGE_PATH = BASE_PATH.with("tuple");
  public static String FUNCTIONAL_INTERFACE = "@FunctionalInterface";
  public static String LINE_FEED = "\n";
  public static String WHITELINE = "\n\n";
  public static String INDENT = "  ";
  public static String RETURN_TYPE = "Result";
  public static String VOID_TYPE = "void";
  public static final String MU_TYPE = "Mu";

  public static String indent(int times) {
    return IntStream.range(0, times).mapToObj(whatever -> INDENT).collect(joining());
  }
}
