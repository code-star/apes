package nl.codestar.apes.core.function;

import nl.codestar.apes.core.tuple.Cons;

@FunctionalInterface
public interface Function10<A, B, C, D, E, F, G, H, I, J, Result> {

  Result apply(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth);

  default Function9<A, B, C, D, E, F, G, H, I, Result> withLast(J tenth) {
    return (first, second, third, fourth, fifth, sixth, seventh, eight, ninth) -> apply(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth);
  }

  default Result applyCons(Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J> c) {
    return withLast(c.getSecond()).applyCons(c.getFirst());
  }

}