package nl.wernerdegroot.functional.syntax.function;

import nl.wernerdegroot.functional.syntax.tuple.Cons;

@FunctionalInterface
public interface Function21<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, Result> {

  Result apply(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh, L twelfth, M thirteenth, N fourteenth, O fifteenth, P sixteenth, Q seventeenth, R eighteenth, S nineteenth, T twentieth, U twentyFirst);

  default Function20<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, Result> withLast(U twentyFirst) {
    return (first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth) -> apply(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth, twentyFirst);
  }

  default Result applyCons(Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S>, T>, U> c) {
    return withLast(c.getSecond()).applyCons(c.getFirst());
  }

}