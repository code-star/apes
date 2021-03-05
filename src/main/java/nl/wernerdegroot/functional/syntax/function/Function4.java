package nl.wernerdegroot.functional.syntax.function;

import nl.wernerdegroot.functional.syntax.tuple.Cons;

@FunctionalInterface
public interface Function4<A, B, C, D, Result> {

  Result apply(A first, B second, C third, D fourth);

  default Function3<A, B, C, Result> withLast(D fourth) {
    return (first, second, third) -> apply(first, second, third, fourth);
  }

  default Result applyCons(Cons<Cons<Cons<A, B>, C>, D> c) {
    return withLast(c.getSecond()).applyCons(c.getFirst());
  }

}