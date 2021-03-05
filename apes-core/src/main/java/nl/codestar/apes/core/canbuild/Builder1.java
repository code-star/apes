package nl.codestar.apes.core.canbuild;

import nl.codestar.apes.core.function.Function1;
import nl.codestar.apes.core.hkt.Hkt;
import nl.codestar.apes.core.typeclass.Functor;
import nl.codestar.apes.core.typeclass.Contravariant;
import nl.codestar.apes.core.typeclass.Invariant;

public class Builder1<Mu, A> {

  private final CanBuild<Mu> canBuild;
  private final Hkt<Mu, A> current;

  public Builder1(CanBuild<Mu> canBuild, Hkt<Mu, A> current) {
    this.canBuild = canBuild;
    this.current = current;
  }

  public Hkt<Mu, A> getCurrent() {
    return current;
  }

  Hkt<Mu, A> combined() {
    return current;
  }

  public <B> Builder2<Mu, A, B> and(Hkt<Mu, B> mub) {
    return new Builder2<>(canBuild, this, mub);
  }

  public <B> Builder2<Mu, A, B> and(Builder1<Mu, B> that) {
    return and(that.getCurrent());
  }

  public <B, C> Builder3<Mu, A, B, C> and(Builder2<Mu, B, C> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D> Builder4<Mu, A, B, C, D> and(Builder3<Mu, B, C, D> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E> Builder5<Mu, A, B, C, D, E> and(Builder4<Mu, B, C, D, E> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F> Builder6<Mu, A, B, C, D, E, F> and(Builder5<Mu, B, C, D, E, F> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F, G> Builder7<Mu, A, B, C, D, E, F, G> and(Builder6<Mu, B, C, D, E, F, G> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F, G, H> Builder8<Mu, A, B, C, D, E, F, G, H> and(Builder7<Mu, B, C, D, E, F, G, H> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F, G, H, I> Builder9<Mu, A, B, C, D, E, F, G, H, I> and(Builder8<Mu, B, C, D, E, F, G, H, I> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F, G, H, I, J> Builder10<Mu, A, B, C, D, E, F, G, H, I, J> and(Builder9<Mu, B, C, D, E, F, G, H, I, J> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F, G, H, I, J, K> Builder11<Mu, A, B, C, D, E, F, G, H, I, J, K> and(Builder10<Mu, B, C, D, E, F, G, H, I, J, K> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F, G, H, I, J, K, L> Builder12<Mu, A, B, C, D, E, F, G, H, I, J, K, L> and(Builder11<Mu, B, C, D, E, F, G, H, I, J, K, L> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F, G, H, I, J, K, L, M> Builder13<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M> and(Builder12<Mu, B, C, D, E, F, G, H, I, J, K, L, M> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F, G, H, I, J, K, L, M, N> Builder14<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N> and(Builder13<Mu, B, C, D, E, F, G, H, I, J, K, L, M, N> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F, G, H, I, J, K, L, M, N, O> Builder15<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> and(Builder14<Mu, B, C, D, E, F, G, H, I, J, K, L, M, N, O> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> Builder16<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> and(Builder15<Mu, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> Builder17<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> and(Builder16<Mu, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> Builder18<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> and(Builder17<Mu, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> Builder19<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> and(Builder18<Mu, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> Builder20<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> and(Builder19<Mu, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> Builder21<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> and(Builder20<Mu, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> Builder22<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> and(Builder21<Mu, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> Builder23<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> and(Builder22<Mu, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> Builder24<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> and(Builder23<Mu, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> Builder25<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> and(Builder24<Mu, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> Builder26<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> and(Builder25<Mu, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <Result> Hkt<Mu, Result> map(Function1<A, Result> fn, Functor<Mu> functor) {
    return functor.map(combined(), fn);
  }

  public <Result> Hkt<Mu, Result> contramap(Function1<Result, A> fn, Contravariant<Mu> contravariant) {
    return contravariant.contramap(combined(), fn);
  }

  public <Result> Hkt<Mu, Result> inmap(Function1<A, Result> fn, Function1<Result, A> gn, Invariant<Mu> invariant) {
    return invariant.inmap(combined(), fn, gn);
  }

}