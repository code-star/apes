package nl.wernerdegroot.functional.syntax.function;

import nl.wernerdegroot.functional.syntax.tuple.Cons;

@FunctionalInterface
public interface Function13<A, B, C, D, E, F, G, H, I, J, K, L, M, Result> {

  Result apply(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh, L twelfth, M thirteenth);

  default Function12<A, B, C, D, E, F, G, H, I, J, K, L, Result> withLast(M thirteenth) {
    return (first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth) -> apply(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth);
  }

  default Result applyCons(Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M> c) {
    return withLast(c.getSecond()).applyCons(c.getFirst());
  }

}