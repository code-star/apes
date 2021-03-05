package nl.codestar.apes.core.canbuild;

import nl.codestar.apes.core.function.Function1;
import nl.codestar.apes.core.function.Function3;
import nl.codestar.apes.core.hkt.Hkt;
import nl.codestar.apes.core.tuple.Cons;
import nl.codestar.apes.core.typeclass.Functor;
import nl.codestar.apes.core.typeclass.Contravariant;
import nl.codestar.apes.core.typeclass.Invariant;

public class Builder3<Mu, A, B, C> {

  private final CanBuild<Mu> canBuild;
  private final Builder2<Mu, A, B> previous;
  private final Hkt<Mu, C> current;

  public Builder3(CanBuild<Mu> canBuild, Builder2<Mu, A, B> previous, Hkt<Mu, C> current) {
    this.canBuild = canBuild;
    this.previous = previous;
    this.current = current;
  }

  public Builder2<Mu, A, B> getPrevious() {
    return previous;
  }

  public Hkt<Mu, C> getCurrent() {
    return current;
  }

  Hkt<Mu, Cons<Cons<A, B>, C>> combined() {
    return canBuild.combine(previous.combined(), current);
  }

  public <D> Builder4<Mu, A, B, C, D> and(Hkt<Mu, D> mud) {
    return new Builder4<>(canBuild, this, mud);
  }

  public <D> Builder4<Mu, A, B, C, D> and(Builder1<Mu, D> that) {
    return and(that.getCurrent());
  }

  public <D, E> Builder5<Mu, A, B, C, D, E> and(Builder2<Mu, D, E> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F> Builder6<Mu, A, B, C, D, E, F> and(Builder3<Mu, D, E, F> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F, G> Builder7<Mu, A, B, C, D, E, F, G> and(Builder4<Mu, D, E, F, G> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F, G, H> Builder8<Mu, A, B, C, D, E, F, G, H> and(Builder5<Mu, D, E, F, G, H> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F, G, H, I> Builder9<Mu, A, B, C, D, E, F, G, H, I> and(Builder6<Mu, D, E, F, G, H, I> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F, G, H, I, J> Builder10<Mu, A, B, C, D, E, F, G, H, I, J> and(Builder7<Mu, D, E, F, G, H, I, J> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F, G, H, I, J, K> Builder11<Mu, A, B, C, D, E, F, G, H, I, J, K> and(Builder8<Mu, D, E, F, G, H, I, J, K> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F, G, H, I, J, K, L> Builder12<Mu, A, B, C, D, E, F, G, H, I, J, K, L> and(Builder9<Mu, D, E, F, G, H, I, J, K, L> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F, G, H, I, J, K, L, M> Builder13<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M> and(Builder10<Mu, D, E, F, G, H, I, J, K, L, M> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F, G, H, I, J, K, L, M, N> Builder14<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N> and(Builder11<Mu, D, E, F, G, H, I, J, K, L, M, N> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F, G, H, I, J, K, L, M, N, O> Builder15<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> and(Builder12<Mu, D, E, F, G, H, I, J, K, L, M, N, O> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F, G, H, I, J, K, L, M, N, O, P> Builder16<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> and(Builder13<Mu, D, E, F, G, H, I, J, K, L, M, N, O, P> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F, G, H, I, J, K, L, M, N, O, P, Q> Builder17<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> and(Builder14<Mu, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> Builder18<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> and(Builder15<Mu, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> Builder19<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> and(Builder16<Mu, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> Builder20<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> and(Builder17<Mu, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> Builder21<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> and(Builder18<Mu, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> Builder22<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> and(Builder19<Mu, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> Builder23<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> and(Builder20<Mu, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> Builder24<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> and(Builder21<Mu, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> Builder25<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> and(Builder22<Mu, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> Builder26<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> and(Builder23<Mu, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <Result> Hkt<Mu, Result> map(Function3<A, B, C, Result> fn, Functor<Mu> functor) {
    return functor.map(combined(), fn::applyCons);
  }

  public <Result> Hkt<Mu, Result> contramap(Function1<Result, Cons<Cons<A, B>, C>> fn, Contravariant<Mu> contravariant) {
    return contravariant.contramap(combined(), fn);
  }

  public <Result> Hkt<Mu, Result> inmap(Function3<A, B, C, Result> fn, Function1<Result, Cons<Cons<A, B>, C>> gn, Invariant<Mu> invariant) {
    return invariant.inmap(combined(), fn::applyCons, gn);
  }

}