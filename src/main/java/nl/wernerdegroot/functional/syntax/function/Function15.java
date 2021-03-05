package nl.wernerdegroot.functional.syntax.function;

import nl.wernerdegroot.functional.syntax.tuple.Cons;

@FunctionalInterface
public interface Function15<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, Result> {

  Result apply(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh, L twelfth, M thirteenth, N fourteenth, O fifteenth);

  default Function14<A, B, C, D, E, F, G, H, I, J, K, L, M, N, Result> withLast(O fifteenth) {
    return (first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth) -> apply(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth);
  }

  default Result applyCons(Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O> c) {
    return withLast(c.getSecond()).applyCons(c.getFirst());
  }

}