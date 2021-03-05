package nl.codestar.apes.core.canbuild;

import nl.codestar.apes.core.function.Function1;
import nl.codestar.apes.core.function.Function2;
import nl.codestar.apes.core.hkt.Hkt;
import nl.codestar.apes.core.tuple.Cons;
import nl.codestar.apes.core.typeclass.Functor;
import nl.codestar.apes.core.typeclass.Contravariant;
import nl.codestar.apes.core.typeclass.Invariant;

public class Builder2<Mu, A, B> {

  private final CanBuild<Mu> canBuild;
  private final Builder1<Mu, A> previous;
  private final Hkt<Mu, B> current;

  public Builder2(CanBuild<Mu> canBuild, Builder1<Mu, A> previous, Hkt<Mu, B> current) {
    this.canBuild = canBuild;
    this.previous = previous;
    this.current = current;
  }

  public Builder1<Mu, A> getPrevious() {
    return previous;
  }

  public Hkt<Mu, B> getCurrent() {
    return current;
  }

  Hkt<Mu, Cons<A, B>> combined() {
    return canBuild.combine(previous.combined(), current);
  }

  public <C> Builder3<Mu, A, B, C> and(Hkt<Mu, C> muc) {
    return new Builder3<>(canBuild, this, muc);
  }

  public <C> Builder3<Mu, A, B, C> and(Builder1<Mu, C> that) {
    return and(that.getCurrent());
  }

  public <C, D> Builder4<Mu, A, B, C, D> and(Builder2<Mu, C, D> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E> Builder5<Mu, A, B, C, D, E> and(Builder3<Mu, C, D, E> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F> Builder6<Mu, A, B, C, D, E, F> and(Builder4<Mu, C, D, E, F> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F, G> Builder7<Mu, A, B, C, D, E, F, G> and(Builder5<Mu, C, D, E, F, G> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F, G, H> Builder8<Mu, A, B, C, D, E, F, G, H> and(Builder6<Mu, C, D, E, F, G, H> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F, G, H, I> Builder9<Mu, A, B, C, D, E, F, G, H, I> and(Builder7<Mu, C, D, E, F, G, H, I> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F, G, H, I, J> Builder10<Mu, A, B, C, D, E, F, G, H, I, J> and(Builder8<Mu, C, D, E, F, G, H, I, J> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F, G, H, I, J, K> Builder11<Mu, A, B, C, D, E, F, G, H, I, J, K> and(Builder9<Mu, C, D, E, F, G, H, I, J, K> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F, G, H, I, J, K, L> Builder12<Mu, A, B, C, D, E, F, G, H, I, J, K, L> and(Builder10<Mu, C, D, E, F, G, H, I, J, K, L> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F, G, H, I, J, K, L, M> Builder13<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M> and(Builder11<Mu, C, D, E, F, G, H, I, J, K, L, M> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F, G, H, I, J, K, L, M, N> Builder14<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N> and(Builder12<Mu, C, D, E, F, G, H, I, J, K, L, M, N> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F, G, H, I, J, K, L, M, N, O> Builder15<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> and(Builder13<Mu, C, D, E, F, G, H, I, J, K, L, M, N, O> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F, G, H, I, J, K, L, M, N, O, P> Builder16<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> and(Builder14<Mu, C, D, E, F, G, H, I, J, K, L, M, N, O, P> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> Builder17<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> and(Builder15<Mu, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> Builder18<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> and(Builder16<Mu, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> Builder19<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> and(Builder17<Mu, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> Builder20<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> and(Builder18<Mu, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> Builder21<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> and(Builder19<Mu, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> Builder22<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> and(Builder20<Mu, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> Builder23<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> and(Builder21<Mu, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> Builder24<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> and(Builder22<Mu, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> Builder25<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> and(Builder23<Mu, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> Builder26<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> and(Builder24<Mu, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <Result> Hkt<Mu, Result> map(Function2<A, B, Result> fn, Functor<Mu> functor) {
    return functor.map(combined(), fn::applyCons);
  }

  public <Result> Hkt<Mu, Result> contramap(Function1<Result, Cons<A, B>> fn, Contravariant<Mu> contravariant) {
    return contravariant.contramap(combined(), fn);
  }

  public <Result> Hkt<Mu, Result> inmap(Function2<A, B, Result> fn, Function1<Result, Cons<A, B>> gn, Invariant<Mu> invariant) {
    return invariant.inmap(combined(), fn::applyCons, gn);
  }

}