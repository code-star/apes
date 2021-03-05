package nl.codestar.apes.core.generator;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Util {

  public static <T> List<T> append(List<T> ts, T t) {
    return Stream.concat(
        ts.stream(),
        Stream.of(t)
    ).collect(toList());
  }

  public static <T> List<T> concat(List<T> left, List<T> right) {
    return Stream.concat(
        left.stream(),
        right.stream()
    ).collect(toList());
  }
}
