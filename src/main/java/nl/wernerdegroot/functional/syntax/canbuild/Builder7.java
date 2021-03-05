package nl.wernerdegroot.functional.syntax.canbuild;

import nl.wernerdegroot.functional.syntax.function.Function1;
import nl.wernerdegroot.functional.syntax.function.Function7;
import nl.wernerdegroot.functional.syntax.hkt.Hkt;
import nl.wernerdegroot.functional.syntax.tuple.Cons;
import nl.wernerdegroot.functional.syntax.typeclass.Functor;
import nl.wernerdegroot.functional.syntax.typeclass.Contravariant;
import nl.wernerdegroot.functional.syntax.typeclass.Invariant;

public class Builder7<Mu, A, B, C, D, E, F, G> {

  private final CanBuild<Mu> canBuild;
  private final Builder6<Mu, A, B, C, D, E, F> previous;
  private final Hkt<Mu, G> current;

  public Builder7(CanBuild<Mu> canBuild, Builder6<Mu, A, B, C, D, E, F> previous, Hkt<Mu, G> current) {
    this.canBuild = canBuild;
    this.previous = previous;
    this.current = current;
  }

  public Builder6<Mu, A, B, C, D, E, F> getPrevious() {
    return previous;
  }

  public Hkt<Mu, G> getCurrent() {
    return current;
  }

  Hkt<Mu, Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>> combined() {
    return canBuild.combine(previous.combined(), current);
  }

  public <H> Builder8<Mu, A, B, C, D, E, F, G, H> and(Hkt<Mu, H> muh) {
    return new Builder8<>(canBuild, this, muh);
  }

  public <H> Builder8<Mu, A, B, C, D, E, F, G, H> and(Builder1<Mu, H> that) {
    return and(that.getCurrent());
  }

  public <H, I> Builder9<Mu, A, B, C, D, E, F, G, H, I> and(Builder2<Mu, H, I> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <H, I, J> Builder10<Mu, A, B, C, D, E, F, G, H, I, J> and(Builder3<Mu, H, I, J> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <H, I, J, K> Builder11<Mu, A, B, C, D, E, F, G, H, I, J, K> and(Builder4<Mu, H, I, J, K> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <H, I, J, K, L> Builder12<Mu, A, B, C, D, E, F, G, H, I, J, K, L> and(Builder5<Mu, H, I, J, K, L> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <H, I, J, K, L, M> Builder13<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M> and(Builder6<Mu, H, I, J, K, L, M> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <H, I, J, K, L, M, N> Builder14<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N> and(Builder7<Mu, H, I, J, K, L, M, N> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <H, I, J, K, L, M, N, O> Builder15<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> and(Builder8<Mu, H, I, J, K, L, M, N, O> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <H, I, J, K, L, M, N, O, P> Builder16<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> and(Builder9<Mu, H, I, J, K, L, M, N, O, P> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <H, I, J, K, L, M, N, O, P, Q> Builder17<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> and(Builder10<Mu, H, I, J, K, L, M, N, O, P, Q> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <H, I, J, K, L, M, N, O, P, Q, R> Builder18<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> and(Builder11<Mu, H, I, J, K, L, M, N, O, P, Q, R> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <H, I, J, K, L, M, N, O, P, Q, R, S> Builder19<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> and(Builder12<Mu, H, I, J, K, L, M, N, O, P, Q, R, S> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <H, I, J, K, L, M, N, O, P, Q, R, S, T> Builder20<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> and(Builder13<Mu, H, I, J, K, L, M, N, O, P, Q, R, S, T> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <H, I, J, K, L, M, N, O, P, Q, R, S, T, U> Builder21<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> and(Builder14<Mu, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> Builder22<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> and(Builder15<Mu, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> Builder23<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> and(Builder16<Mu, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> Builder24<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> and(Builder17<Mu, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> Builder25<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> and(Builder18<Mu, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> Builder26<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> and(Builder19<Mu, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <Result> Hkt<Mu, Result> map(Function7<A, B, C, D, E, F, G, Result> fn, Functor<Mu> functor) {
    return functor.map(combined(), fn::applyCons);
  }

  public <Result> Hkt<Mu, Result> contramap(Function1<Result, Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>> fn, Contravariant<Mu> contravariant) {
    return contravariant.contramap(combined(), fn);
  }

  public <Result> Hkt<Mu, Result> inmap(Function7<A, B, C, D, E, F, G, Result> fn, Function1<Result, Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>> gn, Invariant<Mu> invariant) {
    return invariant.inmap(combined(), fn::applyCons, gn);
  }

}