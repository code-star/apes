package nl.wernerdegroot.functional.syntax.function;

import nl.wernerdegroot.functional.syntax.tuple.Cons;

@FunctionalInterface
public interface Function6<A, B, C, D, E, F, Result> {

  Result apply(A first, B second, C third, D fourth, E fifth, F sixth);

  default Function5<A, B, C, D, E, Result> withLast(F sixth) {
    return (first, second, third, fourth, fifth) -> apply(first, second, third, fourth, fifth, sixth);
  }

  default Result applyCons(Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F> c) {
    return withLast(c.getSecond()).applyCons(c.getFirst());
  }

}