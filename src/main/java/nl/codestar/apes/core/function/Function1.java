package nl.codestar.apes.core.function;

@FunctionalInterface
public interface Function1<A, Result> {

  Result apply(A first);

  default Result applyCons(A first) {
    return apply(first);
  }

}