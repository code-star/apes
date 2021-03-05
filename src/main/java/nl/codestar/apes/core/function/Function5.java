package nl.codestar.apes.core.function;

import nl.codestar.apes.core.tuple.Cons;

@FunctionalInterface
public interface Function5<A, B, C, D, E, Result> {

  Result apply(A first, B second, C third, D fourth, E fifth);

  default Function4<A, B, C, D, Result> withLast(E fifth) {
    return (first, second, third, fourth) -> apply(first, second, third, fourth, fifth);
  }

  default Result applyCons(Cons<Cons<Cons<Cons<A, B>, C>, D>, E> c) {
    return withLast(c.getSecond()).applyCons(c.getFirst());
  }

}