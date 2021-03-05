package nl.wernerdegroot.functional.syntax.function;

import nl.wernerdegroot.functional.syntax.tuple.Cons;

@FunctionalInterface
public interface Function3<A, B, C, Result> {

  Result apply(A first, B second, C third);

  default Function2<A, B, Result> withLast(C third) {
    return (first, second) -> apply(first, second, third);
  }

  default Result applyCons(Cons<Cons<A, B>, C> c) {
    return withLast(c.getSecond()).applyCons(c.getFirst());
  }

}