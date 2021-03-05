package nl.codestar.apes.core.canbuild;

import nl.codestar.apes.core.function.Function1;
import nl.codestar.apes.core.function.Function4;
import nl.codestar.apes.core.hkt.Hkt;
import nl.codestar.apes.core.tuple.Cons;
import nl.codestar.apes.core.typeclass.Functor;
import nl.codestar.apes.core.typeclass.Contravariant;
import nl.codestar.apes.core.typeclass.Invariant;

public class Builder4<Mu, A, B, C, D> {

  private final CanBuild<Mu> canBuild;
  private final Builder3<Mu, A, B, C> previous;
  private final Hkt<Mu, D> current;

  public Builder4(CanBuild<Mu> canBuild, Builder3<Mu, A, B, C> previous, Hkt<Mu, D> current) {
    this.canBuild = canBuild;
    this.previous = previous;
    this.current = current;
  }

  public Builder3<Mu, A, B, C> getPrevious() {
    return previous;
  }

  public Hkt<Mu, D> getCurrent() {
    return current;
  }

  Hkt<Mu, Cons<Cons<Cons<A, B>, C>, D>> combined() {
    return canBuild.combine(previous.combined(), current);
  }

  public <E> Builder5<Mu, A, B, C, D, E> and(Hkt<Mu, E> mue) {
    return new Builder5<>(canBuild, this, mue);
  }

  public <E> Builder5<Mu, A, B, C, D, E> and(Builder1<Mu, E> that) {
    return and(that.getCurrent());
  }

  public <E, F> Builder6<Mu, A, B, C, D, E, F> and(Builder2<Mu, E, F> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <E, F, G> Builder7<Mu, A, B, C, D, E, F, G> and(Builder3<Mu, E, F, G> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <E, F, G, H> Builder8<Mu, A, B, C, D, E, F, G, H> and(Builder4<Mu, E, F, G, H> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <E, F, G, H, I> Builder9<Mu, A, B, C, D, E, F, G, H, I> and(Builder5<Mu, E, F, G, H, I> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <E, F, G, H, I, J> Builder10<Mu, A, B, C, D, E, F, G, H, I, J> and(Builder6<Mu, E, F, G, H, I, J> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <E, F, G, H, I, J, K> Builder11<Mu, A, B, C, D, E, F, G, H, I, J, K> and(Builder7<Mu, E, F, G, H, I, J, K> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <E, F, G, H, I, J, K, L> Builder12<Mu, A, B, C, D, E, F, G, H, I, J, K, L> and(Builder8<Mu, E, F, G, H, I, J, K, L> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <E, F, G, H, I, J, K, L, M> Builder13<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M> and(Builder9<Mu, E, F, G, H, I, J, K, L, M> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <E, F, G, H, I, J, K, L, M, N> Builder14<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N> and(Builder10<Mu, E, F, G, H, I, J, K, L, M, N> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <E, F, G, H, I, J, K, L, M, N, O> Builder15<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> and(Builder11<Mu, E, F, G, H, I, J, K, L, M, N, O> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <E, F, G, H, I, J, K, L, M, N, O, P> Builder16<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> and(Builder12<Mu, E, F, G, H, I, J, K, L, M, N, O, P> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <E, F, G, H, I, J, K, L, M, N, O, P, Q> Builder17<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> and(Builder13<Mu, E, F, G, H, I, J, K, L, M, N, O, P, Q> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <E, F, G, H, I, J, K, L, M, N, O, P, Q, R> Builder18<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> and(Builder14<Mu, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> Builder19<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> and(Builder15<Mu, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> Builder20<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> and(Builder16<Mu, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> Builder21<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> and(Builder17<Mu, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> Builder22<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> and(Builder18<Mu, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> Builder23<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> and(Builder19<Mu, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> Builder24<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> and(Builder20<Mu, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> Builder25<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> and(Builder21<Mu, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> Builder26<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> and(Builder22<Mu, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <Result> Hkt<Mu, Result> map(Function4<A, B, C, D, Result> fn, Functor<Mu> functor) {
    return functor.map(combined(), fn::applyCons);
  }

  public <Result> Hkt<Mu, Result> contramap(Function1<Result, Cons<Cons<Cons<A, B>, C>, D>> fn, Contravariant<Mu> contravariant) {
    return contravariant.contramap(combined(), fn);
  }

  public <Result> Hkt<Mu, Result> inmap(Function4<A, B, C, D, Result> fn, Function1<Result, Cons<Cons<Cons<A, B>, C>, D>> gn, Invariant<Mu> invariant) {
    return invariant.inmap(combined(), fn::applyCons, gn);
  }

}