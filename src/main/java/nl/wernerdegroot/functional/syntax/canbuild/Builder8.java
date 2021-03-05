package nl.wernerdegroot.functional.syntax.canbuild;

import nl.wernerdegroot.functional.syntax.function.Function1;
import nl.wernerdegroot.functional.syntax.function.Function8;
import nl.wernerdegroot.functional.syntax.hkt.Hkt;
import nl.wernerdegroot.functional.syntax.tuple.Cons;
import nl.wernerdegroot.functional.syntax.typeclass.Functor;
import nl.wernerdegroot.functional.syntax.typeclass.Contravariant;
import nl.wernerdegroot.functional.syntax.typeclass.Invariant;

public class Builder8<Mu, A, B, C, D, E, F, G, H> {

  private final CanBuild<Mu> canBuild;
  private final Builder7<Mu, A, B, C, D, E, F, G> previous;
  private final Hkt<Mu, H> current;

  public Builder8(CanBuild<Mu> canBuild, Builder7<Mu, A, B, C, D, E, F, G> previous, Hkt<Mu, H> current) {
    this.canBuild = canBuild;
    this.previous = previous;
    this.current = current;
  }

  public Builder7<Mu, A, B, C, D, E, F, G> getPrevious() {
    return previous;
  }

  public Hkt<Mu, H> getCurrent() {
    return current;
  }

  Hkt<Mu, Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>> combined() {
    return canBuild.combine(previous.combined(), current);
  }

  public <I> Builder9<Mu, A, B, C, D, E, F, G, H, I> and(Hkt<Mu, I> mui) {
    return new Builder9<>(canBuild, this, mui);
  }

  public <I> Builder9<Mu, A, B, C, D, E, F, G, H, I> and(Builder1<Mu, I> that) {
    return and(that.getCurrent());
  }

  public <I, J> Builder10<Mu, A, B, C, D, E, F, G, H, I, J> and(Builder2<Mu, I, J> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <I, J, K> Builder11<Mu, A, B, C, D, E, F, G, H, I, J, K> and(Builder3<Mu, I, J, K> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <I, J, K, L> Builder12<Mu, A, B, C, D, E, F, G, H, I, J, K, L> and(Builder4<Mu, I, J, K, L> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <I, J, K, L, M> Builder13<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M> and(Builder5<Mu, I, J, K, L, M> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <I, J, K, L, M, N> Builder14<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N> and(Builder6<Mu, I, J, K, L, M, N> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <I, J, K, L, M, N, O> Builder15<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> and(Builder7<Mu, I, J, K, L, M, N, O> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <I, J, K, L, M, N, O, P> Builder16<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> and(Builder8<Mu, I, J, K, L, M, N, O, P> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <I, J, K, L, M, N, O, P, Q> Builder17<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> and(Builder9<Mu, I, J, K, L, M, N, O, P, Q> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <I, J, K, L, M, N, O, P, Q, R> Builder18<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> and(Builder10<Mu, I, J, K, L, M, N, O, P, Q, R> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <I, J, K, L, M, N, O, P, Q, R, S> Builder19<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> and(Builder11<Mu, I, J, K, L, M, N, O, P, Q, R, S> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <I, J, K, L, M, N, O, P, Q, R, S, T> Builder20<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> and(Builder12<Mu, I, J, K, L, M, N, O, P, Q, R, S, T> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <I, J, K, L, M, N, O, P, Q, R, S, T, U> Builder21<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> and(Builder13<Mu, I, J, K, L, M, N, O, P, Q, R, S, T, U> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <I, J, K, L, M, N, O, P, Q, R, S, T, U, V> Builder22<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> and(Builder14<Mu, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> Builder23<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> and(Builder15<Mu, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> Builder24<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> and(Builder16<Mu, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> Builder25<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> and(Builder17<Mu, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> Builder26<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> and(Builder18<Mu, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <Result> Hkt<Mu, Result> map(Function8<A, B, C, D, E, F, G, H, Result> fn, Functor<Mu> functor) {
    return functor.map(combined(), fn::applyCons);
  }

  public <Result> Hkt<Mu, Result> contramap(Function1<Result, Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>> fn, Contravariant<Mu> contravariant) {
    return contravariant.contramap(combined(), fn);
  }

  public <Result> Hkt<Mu, Result> inmap(Function8<A, B, C, D, E, F, G, H, Result> fn, Function1<Result, Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>> gn, Invariant<Mu> invariant) {
    return invariant.inmap(combined(), fn::applyCons, gn);
  }

}