package nl.codestar.apes.core.canbuild;

import nl.codestar.apes.core.function.Function1;
import nl.codestar.apes.core.function.Function5;
import nl.codestar.apes.core.hkt.Hkt;
import nl.codestar.apes.core.tuple.Cons;
import nl.codestar.apes.core.typeclass.Functor;
import nl.codestar.apes.core.typeclass.Contravariant;
import nl.codestar.apes.core.typeclass.Invariant;

public class Builder5<Mu, A, B, C, D, E> {

  private final CanBuild<Mu> canBuild;
  private final Builder4<Mu, A, B, C, D> previous;
  private final Hkt<Mu, E> current;

  public Builder5(CanBuild<Mu> canBuild, Builder4<Mu, A, B, C, D> previous, Hkt<Mu, E> current) {
    this.canBuild = canBuild;
    this.previous = previous;
    this.current = current;
  }

  public Builder4<Mu, A, B, C, D> getPrevious() {
    return previous;
  }

  public Hkt<Mu, E> getCurrent() {
    return current;
  }

  Hkt<Mu, Cons<Cons<Cons<Cons<A, B>, C>, D>, E>> combined() {
    return canBuild.combine(previous.combined(), current);
  }

  public <F> Builder6<Mu, A, B, C, D, E, F> and(Hkt<Mu, F> muf) {
    return new Builder6<>(canBuild, this, muf);
  }

  public <F> Builder6<Mu, A, B, C, D, E, F> and(Builder1<Mu, F> that) {
    return and(that.getCurrent());
  }

  public <F, G> Builder7<Mu, A, B, C, D, E, F, G> and(Builder2<Mu, F, G> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <F, G, H> Builder8<Mu, A, B, C, D, E, F, G, H> and(Builder3<Mu, F, G, H> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <F, G, H, I> Builder9<Mu, A, B, C, D, E, F, G, H, I> and(Builder4<Mu, F, G, H, I> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <F, G, H, I, J> Builder10<Mu, A, B, C, D, E, F, G, H, I, J> and(Builder5<Mu, F, G, H, I, J> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <F, G, H, I, J, K> Builder11<Mu, A, B, C, D, E, F, G, H, I, J, K> and(Builder6<Mu, F, G, H, I, J, K> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <F, G, H, I, J, K, L> Builder12<Mu, A, B, C, D, E, F, G, H, I, J, K, L> and(Builder7<Mu, F, G, H, I, J, K, L> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <F, G, H, I, J, K, L, M> Builder13<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M> and(Builder8<Mu, F, G, H, I, J, K, L, M> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <F, G, H, I, J, K, L, M, N> Builder14<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N> and(Builder9<Mu, F, G, H, I, J, K, L, M, N> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <F, G, H, I, J, K, L, M, N, O> Builder15<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> and(Builder10<Mu, F, G, H, I, J, K, L, M, N, O> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <F, G, H, I, J, K, L, M, N, O, P> Builder16<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> and(Builder11<Mu, F, G, H, I, J, K, L, M, N, O, P> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <F, G, H, I, J, K, L, M, N, O, P, Q> Builder17<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> and(Builder12<Mu, F, G, H, I, J, K, L, M, N, O, P, Q> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <F, G, H, I, J, K, L, M, N, O, P, Q, R> Builder18<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> and(Builder13<Mu, F, G, H, I, J, K, L, M, N, O, P, Q, R> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <F, G, H, I, J, K, L, M, N, O, P, Q, R, S> Builder19<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> and(Builder14<Mu, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> Builder20<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> and(Builder15<Mu, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> Builder21<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> and(Builder16<Mu, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> Builder22<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> and(Builder17<Mu, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> Builder23<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> and(Builder18<Mu, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> Builder24<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> and(Builder19<Mu, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> Builder25<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> and(Builder20<Mu, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> Builder26<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> and(Builder21<Mu, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <Result> Hkt<Mu, Result> map(Function5<A, B, C, D, E, Result> fn, Functor<Mu> functor) {
    return functor.map(combined(), fn::applyCons);
  }

  public <Result> Hkt<Mu, Result> contramap(Function1<Result, Cons<Cons<Cons<Cons<A, B>, C>, D>, E>> fn, Contravariant<Mu> contravariant) {
    return contravariant.contramap(combined(), fn);
  }

  public <Result> Hkt<Mu, Result> inmap(Function5<A, B, C, D, E, Result> fn, Function1<Result, Cons<Cons<Cons<Cons<A, B>, C>, D>, E>> gn, Invariant<Mu> invariant) {
    return invariant.inmap(combined(), fn::applyCons, gn);
  }

}