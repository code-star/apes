package nl.codestar.apes.core.canbuild;

import nl.codestar.apes.core.function.Function1;
import nl.codestar.apes.core.function.Function17;
import nl.codestar.apes.core.hkt.Hkt;
import nl.codestar.apes.core.tuple.Cons;
import nl.codestar.apes.core.typeclass.Functor;
import nl.codestar.apes.core.typeclass.Contravariant;
import nl.codestar.apes.core.typeclass.Invariant;

public class Builder17<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> {

  private final CanBuild<Mu> canBuild;
  private final Builder16<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> previous;
  private final Hkt<Mu, Q> current;

  public Builder17(CanBuild<Mu> canBuild, Builder16<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> previous, Hkt<Mu, Q> current) {
    this.canBuild = canBuild;
    this.previous = previous;
    this.current = current;
  }

  public Builder16<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> getPrevious() {
    return previous;
  }

  public Hkt<Mu, Q> getCurrent() {
    return current;
  }

  Hkt<Mu, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>> combined() {
    return canBuild.combine(previous.combined(), current);
  }

  public <R> Builder18<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> and(Hkt<Mu, R> mur) {
    return new Builder18<>(canBuild, this, mur);
  }

  public <R> Builder18<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> and(Builder1<Mu, R> that) {
    return and(that.getCurrent());
  }

  public <R, S> Builder19<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> and(Builder2<Mu, R, S> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <R, S, T> Builder20<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> and(Builder3<Mu, R, S, T> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <R, S, T, U> Builder21<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> and(Builder4<Mu, R, S, T, U> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <R, S, T, U, V> Builder22<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> and(Builder5<Mu, R, S, T, U, V> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <R, S, T, U, V, W> Builder23<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> and(Builder6<Mu, R, S, T, U, V, W> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <R, S, T, U, V, W, X> Builder24<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> and(Builder7<Mu, R, S, T, U, V, W, X> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <R, S, T, U, V, W, X, Y> Builder25<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> and(Builder8<Mu, R, S, T, U, V, W, X, Y> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <R, S, T, U, V, W, X, Y, Z> Builder26<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> and(Builder9<Mu, R, S, T, U, V, W, X, Y, Z> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <Result> Hkt<Mu, Result> map(Function17<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, Result> fn, Functor<Mu> functor) {
    return functor.map(combined(), fn::applyCons);
  }

  public <Result> Hkt<Mu, Result> contramap(Function1<Result, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>> fn, Contravariant<Mu> contravariant) {
    return contravariant.contramap(combined(), fn);
  }

  public <Result> Hkt<Mu, Result> inmap(Function17<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, Result> fn, Function1<Result, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>> gn, Invariant<Mu> invariant) {
    return invariant.inmap(combined(), fn::applyCons, gn);
  }

}