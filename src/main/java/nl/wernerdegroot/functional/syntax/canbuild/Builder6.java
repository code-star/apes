package nl.wernerdegroot.functional.syntax.canbuild;

import nl.wernerdegroot.functional.syntax.function.Function1;
import nl.wernerdegroot.functional.syntax.function.Function6;
import nl.wernerdegroot.functional.syntax.hkt.Hkt;
import nl.wernerdegroot.functional.syntax.tuple.Cons;
import nl.wernerdegroot.functional.syntax.typeclass.Functor;
import nl.wernerdegroot.functional.syntax.typeclass.Contravariant;
import nl.wernerdegroot.functional.syntax.typeclass.Invariant;

public class Builder6<Mu, A, B, C, D, E, F> {

  private final CanBuild<Mu> canBuild;
  private final Builder5<Mu, A, B, C, D, E> previous;
  private final Hkt<Mu, F> current;

  public Builder6(CanBuild<Mu> canBuild, Builder5<Mu, A, B, C, D, E> previous, Hkt<Mu, F> current) {
    this.canBuild = canBuild;
    this.previous = previous;
    this.current = current;
  }

  public Builder5<Mu, A, B, C, D, E> getPrevious() {
    return previous;
  }

  public Hkt<Mu, F> getCurrent() {
    return current;
  }

  Hkt<Mu, Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>> combined() {
    return canBuild.combine(previous.combined(), current);
  }

  public <G> Builder7<Mu, A, B, C, D, E, F, G> and(Hkt<Mu, G> mug) {
    return new Builder7<>(canBuild, this, mug);
  }

  public <G> Builder7<Mu, A, B, C, D, E, F, G> and(Builder1<Mu, G> that) {
    return and(that.getCurrent());
  }

  public <G, H> Builder8<Mu, A, B, C, D, E, F, G, H> and(Builder2<Mu, G, H> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <G, H, I> Builder9<Mu, A, B, C, D, E, F, G, H, I> and(Builder3<Mu, G, H, I> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <G, H, I, J> Builder10<Mu, A, B, C, D, E, F, G, H, I, J> and(Builder4<Mu, G, H, I, J> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <G, H, I, J, K> Builder11<Mu, A, B, C, D, E, F, G, H, I, J, K> and(Builder5<Mu, G, H, I, J, K> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <G, H, I, J, K, L> Builder12<Mu, A, B, C, D, E, F, G, H, I, J, K, L> and(Builder6<Mu, G, H, I, J, K, L> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <G, H, I, J, K, L, M> Builder13<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M> and(Builder7<Mu, G, H, I, J, K, L, M> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <G, H, I, J, K, L, M, N> Builder14<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N> and(Builder8<Mu, G, H, I, J, K, L, M, N> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <G, H, I, J, K, L, M, N, O> Builder15<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> and(Builder9<Mu, G, H, I, J, K, L, M, N, O> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <G, H, I, J, K, L, M, N, O, P> Builder16<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> and(Builder10<Mu, G, H, I, J, K, L, M, N, O, P> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <G, H, I, J, K, L, M, N, O, P, Q> Builder17<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> and(Builder11<Mu, G, H, I, J, K, L, M, N, O, P, Q> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <G, H, I, J, K, L, M, N, O, P, Q, R> Builder18<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> and(Builder12<Mu, G, H, I, J, K, L, M, N, O, P, Q, R> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <G, H, I, J, K, L, M, N, O, P, Q, R, S> Builder19<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> and(Builder13<Mu, G, H, I, J, K, L, M, N, O, P, Q, R, S> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <G, H, I, J, K, L, M, N, O, P, Q, R, S, T> Builder20<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> and(Builder14<Mu, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> Builder21<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> and(Builder15<Mu, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> Builder22<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> and(Builder16<Mu, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> Builder23<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> and(Builder17<Mu, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> Builder24<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> and(Builder18<Mu, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> Builder25<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> and(Builder19<Mu, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> Builder26<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> and(Builder20<Mu, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <Result> Hkt<Mu, Result> map(Function6<A, B, C, D, E, F, Result> fn, Functor<Mu> functor) {
    return functor.map(combined(), fn::applyCons);
  }

  public <Result> Hkt<Mu, Result> contramap(Function1<Result, Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>> fn, Contravariant<Mu> contravariant) {
    return contravariant.contramap(combined(), fn);
  }

  public <Result> Hkt<Mu, Result> inmap(Function6<A, B, C, D, E, F, Result> fn, Function1<Result, Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>> gn, Invariant<Mu> invariant) {
    return invariant.inmap(combined(), fn::applyCons, gn);
  }

}