package nl.codestar.apes.core.function;

import nl.codestar.apes.core.tuple.Cons;

@FunctionalInterface
public interface Function8<A, B, C, D, E, F, G, H, Result> {

  Result apply(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight);

  default Function7<A, B, C, D, E, F, G, Result> withLast(H eight) {
    return (first, second, third, fourth, fifth, sixth, seventh) -> apply(first, second, third, fourth, fifth, sixth, seventh, eight);
  }

  default Result applyCons(Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H> c) {
    return withLast(c.getSecond()).applyCons(c.getFirst());
  }

}