package nl.codestar.apes.core.function;

import nl.codestar.apes.core.tuple.Cons;

@FunctionalInterface
public interface Function12<A, B, C, D, E, F, G, H, I, J, K, L, Result> {

  Result apply(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh, L twelfth);

  default Function11<A, B, C, D, E, F, G, H, I, J, K, Result> withLast(L twelfth) {
    return (first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh) -> apply(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth);
  }

  default Result applyCons(Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L> c) {
    return withLast(c.getSecond()).applyCons(c.getFirst());
  }

}