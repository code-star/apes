package nl.codestar.apes.core.hkt;

import java.util.function.Function;

public interface Hkt<Mu, A> {
  default <T extends Hkt<Mu, A>> T coerce() {
    return (T) this;
  }

  default <B> B pipe(Function<Hkt<Mu, A>, B> transformation) {
    return transformation.apply(this);
  }
}
