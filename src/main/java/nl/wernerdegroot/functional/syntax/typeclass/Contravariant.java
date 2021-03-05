package nl.wernerdegroot.functional.syntax.typeclass;

import nl.wernerdegroot.functional.syntax.function.Function1;
import nl.wernerdegroot.functional.syntax.hkt.Hkt;

public interface Contravariant<F> {
  <A, B> Hkt<F, B> contramap(Hkt<F, A> fa, Function1<B, A> fn);
}
