package nl.codestar.apes.core.typeclass;

import nl.codestar.apes.core.function.Function1;
import nl.codestar.apes.core.hkt.Hkt;

public interface Functor<F> {
  <A, B> Hkt<F, B> map(Hkt<F, A> fa, Function1<A, B> fn);
}
