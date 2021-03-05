package nl.wernerdegroot.functional.syntax.function;

import nl.wernerdegroot.functional.syntax.tuple.Cons;

@FunctionalInterface
public interface Function2<A, B, Result> {

  Result apply(A first, B second);

  default Function1<A, Result> withLast(B second) {
    return (first) -> apply(first, second);
  }

  default Result applyCons(Cons<A, B> c) {
    return withLast(c.getSecond()).applyCons(c.getFirst());
  }

}