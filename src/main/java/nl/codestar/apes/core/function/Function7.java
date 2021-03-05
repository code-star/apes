package nl.codestar.apes.core.function;

import nl.codestar.apes.core.tuple.Cons;

@FunctionalInterface
public interface Function7<A, B, C, D, E, F, G, Result> {

  Result apply(A first, B second, C third, D fourth, E fifth, F sixth, G seventh);

  default Function6<A, B, C, D, E, F, Result> withLast(G seventh) {
    return (first, second, third, fourth, fifth, sixth) -> apply(first, second, third, fourth, fifth, sixth, seventh);
  }

  default Result applyCons(Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G> c) {
    return withLast(c.getSecond()).applyCons(c.getFirst());
  }

}