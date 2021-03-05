package nl.wernerdegroot.functional.syntax.canbuild;

import nl.wernerdegroot.functional.syntax.hkt.Hkt;
import nl.wernerdegroot.functional.syntax.tuple.Cons;

public interface CanBuild<Mu> {
  <A, B> Hkt<Mu, Cons<A, B>> combine(Hkt<Mu, A> left, Hkt<Mu, B> right);
}
