package nl.codestar.apes.core.canbuild;

import nl.codestar.apes.core.hkt.Hkt;
import nl.codestar.apes.core.tuple.Cons;

public interface CanBuild<Mu> {
  <A, B> Hkt<Mu, Cons<A, B>> combine(Hkt<Mu, A> left, Hkt<Mu, B> right);
}
