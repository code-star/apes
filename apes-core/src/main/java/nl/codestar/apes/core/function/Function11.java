package nl.codestar.apes.core.function;

import nl.codestar.apes.core.tuple.Cons;

@FunctionalInterface
public interface Function11<A, B, C, D, E, F, G, H, I, J, K, Result> {

  Result apply(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh);

  default Function10<A, B, C, D, E, F, G, H, I, J, Result> withLast(K eleventh) {
    return (first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth) -> apply(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh);
  }

  default Result applyCons(Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K> c) {
    return withLast(c.getSecond()).applyCons(c.getFirst());
  }

}