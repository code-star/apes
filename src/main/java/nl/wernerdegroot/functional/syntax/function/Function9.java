package nl.wernerdegroot.functional.syntax.function;

import nl.wernerdegroot.functional.syntax.tuple.Cons;

@FunctionalInterface
public interface Function9<A, B, C, D, E, F, G, H, I, Result> {

  Result apply(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth);

  default Function8<A, B, C, D, E, F, G, H, Result> withLast(I ninth) {
    return (first, second, third, fourth, fifth, sixth, seventh, eight) -> apply(first, second, third, fourth, fifth, sixth, seventh, eight, ninth);
  }

  default Result applyCons(Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I> c) {
    return withLast(c.getSecond()).applyCons(c.getFirst());
  }

}