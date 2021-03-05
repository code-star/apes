package nl.wernerdegroot.functional.syntax.function;

import nl.wernerdegroot.functional.syntax.tuple.Cons;

@FunctionalInterface
public interface Function17<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, Result> {

  Result apply(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh, L twelfth, M thirteenth, N fourteenth, O fifteenth, P sixteenth, Q seventeenth);

  default Function16<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Result> withLast(Q seventeenth) {
    return (first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth) -> apply(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth);
  }

  default Result applyCons(Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q> c) {
    return withLast(c.getSecond()).applyCons(c.getFirst());
  }

}