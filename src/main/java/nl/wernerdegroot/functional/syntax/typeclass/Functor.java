package nl.wernerdegroot.functional.syntax.typeclass;

import nl.wernerdegroot.functional.syntax.function.Function1;
import nl.wernerdegroot.functional.syntax.hkt.Hkt;

public interface Functor<F> {
  <A, B> Hkt<F, B> map(Hkt<F, A> fa, Function1<A, B> fn);
}
