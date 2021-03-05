package nl.wernerdegroot.functional.syntax.canbuild;

import nl.wernerdegroot.functional.syntax.function.Function1;
import nl.wernerdegroot.functional.syntax.function.Function20;
import nl.wernerdegroot.functional.syntax.hkt.Hkt;
import nl.wernerdegroot.functional.syntax.tuple.Cons;
import nl.wernerdegroot.functional.syntax.typeclass.Functor;
import nl.wernerdegroot.functional.syntax.typeclass.Contravariant;
import nl.wernerdegroot.functional.syntax.typeclass.Invariant;

public class Builder20<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> {

  private final CanBuild<Mu> canBuild;
  private final Builder19<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> previous;
  private final Hkt<Mu, T> current;

  public Builder20(CanBuild<Mu> canBuild, Builder19<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> previous, Hkt<Mu, T> current) {
    this.canBuild = canBuild;
    this.previous = previous;
    this.current = current;
  }

  public Builder19<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> getPrevious() {
    return previous;
  }

  public Hkt<Mu, T> getCurrent() {
    return current;
  }

  Hkt<Mu, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S>, T>> combined() {
    return canBuild.combine(previous.combined(), current);
  }

  public <U> Builder21<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> and(Hkt<Mu, U> muu) {
    return new Builder21<>(canBuild, this, muu);
  }

  public <U> Builder21<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> and(Builder1<Mu, U> that) {
    return and(that.getCurrent());
  }

  public <U, V> Builder22<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> and(Builder2<Mu, U, V> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <U, V, W> Builder23<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> and(Builder3<Mu, U, V, W> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <U, V, W, X> Builder24<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> and(Builder4<Mu, U, V, W, X> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <U, V, W, X, Y> Builder25<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> and(Builder5<Mu, U, V, W, X, Y> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <U, V, W, X, Y, Z> Builder26<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> and(Builder6<Mu, U, V, W, X, Y, Z> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <Result> Hkt<Mu, Result> map(Function20<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, Result> fn, Functor<Mu> functor) {
    return functor.map(combined(), fn::applyCons);
  }

  public <Result> Hkt<Mu, Result> contramap(Function1<Result, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S>, T>> fn, Contravariant<Mu> contravariant) {
    return contravariant.contramap(combined(), fn);
  }

  public <Result> Hkt<Mu, Result> inmap(Function20<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, Result> fn, Function1<Result, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S>, T>> gn, Invariant<Mu> invariant) {
    return invariant.inmap(combined(), fn::applyCons, gn);
  }

}