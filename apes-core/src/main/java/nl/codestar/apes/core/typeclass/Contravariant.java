package nl.codestar.apes.core.typeclass;

import nl.codestar.apes.core.function.Function1;
import nl.codestar.apes.core.hkt.Hkt;

public interface Contravariant<F> {
  <A, B> Hkt<F, B> contramap(Hkt<F, A> fa, Function1<B, A> fn);
}
