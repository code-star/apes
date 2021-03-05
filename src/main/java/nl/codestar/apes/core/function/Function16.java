package nl.codestar.apes.core.function;

import nl.codestar.apes.core.tuple.Cons;

@FunctionalInterface
public interface Function16<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Result> {

  Result apply(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh, L twelfth, M thirteenth, N fourteenth, O fifteenth, P sixteenth);

  default Function15<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, Result> withLast(P sixteenth) {
    return (first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth) -> apply(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth);
  }

  default Result applyCons(Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P> c) {
    return withLast(c.getSecond()).applyCons(c.getFirst());
  }

}