package nl.wernerdegroot.functional.syntax.canbuild;

import nl.wernerdegroot.functional.syntax.function.Function1;
import nl.wernerdegroot.functional.syntax.function.Function11;
import nl.wernerdegroot.functional.syntax.hkt.Hkt;
import nl.wernerdegroot.functional.syntax.tuple.Cons;
import nl.wernerdegroot.functional.syntax.typeclass.Functor;
import nl.wernerdegroot.functional.syntax.typeclass.Contravariant;
import nl.wernerdegroot.functional.syntax.typeclass.Invariant;

public class Builder11<Mu, A, B, C, D, E, F, G, H, I, J, K> {

  private final CanBuild<Mu> canBuild;
  private final Builder10<Mu, A, B, C, D, E, F, G, H, I, J> previous;
  private final Hkt<Mu, K> current;

  public Builder11(CanBuild<Mu> canBuild, Builder10<Mu, A, B, C, D, E, F, G, H, I, J> previous, Hkt<Mu, K> current) {
    this.canBuild = canBuild;
    this.previous = previous;
    this.current = current;
  }

  public Builder10<Mu, A, B, C, D, E, F, G, H, I, J> getPrevious() {
    return previous;
  }

  public Hkt<Mu, K> getCurrent() {
    return current;
  }

  Hkt<Mu, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>> combined() {
    return canBuild.combine(previous.combined(), current);
  }

  public <L> Builder12<Mu, A, B, C, D, E, F, G, H, I, J, K, L> and(Hkt<Mu, L> mul) {
    return new Builder12<>(canBuild, this, mul);
  }

  public <L> Builder12<Mu, A, B, C, D, E, F, G, H, I, J, K, L> and(Builder1<Mu, L> that) {
    return and(that.getCurrent());
  }

  public <L, M> Builder13<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M> and(Builder2<Mu, L, M> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <L, M, N> Builder14<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N> and(Builder3<Mu, L, M, N> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <L, M, N, O> Builder15<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> and(Builder4<Mu, L, M, N, O> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <L, M, N, O, P> Builder16<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> and(Builder5<Mu, L, M, N, O, P> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <L, M, N, O, P, Q> Builder17<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> and(Builder6<Mu, L, M, N, O, P, Q> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <L, M, N, O, P, Q, R> Builder18<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> and(Builder7<Mu, L, M, N, O, P, Q, R> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <L, M, N, O, P, Q, R, S> Builder19<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> and(Builder8<Mu, L, M, N, O, P, Q, R, S> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <L, M, N, O, P, Q, R, S, T> Builder20<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> and(Builder9<Mu, L, M, N, O, P, Q, R, S, T> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <L, M, N, O, P, Q, R, S, T, U> Builder21<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> and(Builder10<Mu, L, M, N, O, P, Q, R, S, T, U> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <L, M, N, O, P, Q, R, S, T, U, V> Builder22<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> and(Builder11<Mu, L, M, N, O, P, Q, R, S, T, U, V> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <L, M, N, O, P, Q, R, S, T, U, V, W> Builder23<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> and(Builder12<Mu, L, M, N, O, P, Q, R, S, T, U, V, W> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <L, M, N, O, P, Q, R, S, T, U, V, W, X> Builder24<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> and(Builder13<Mu, L, M, N, O, P, Q, R, S, T, U, V, W, X> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> Builder25<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> and(Builder14<Mu, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> Builder26<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> and(Builder15<Mu, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <Result> Hkt<Mu, Result> map(Function11<A, B, C, D, E, F, G, H, I, J, K, Result> fn, Functor<Mu> functor) {
    return functor.map(combined(), fn::applyCons);
  }

  public <Result> Hkt<Mu, Result> contramap(Function1<Result, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>> fn, Contravariant<Mu> contravariant) {
    return contravariant.contramap(combined(), fn);
  }

  public <Result> Hkt<Mu, Result> inmap(Function11<A, B, C, D, E, F, G, H, I, J, K, Result> fn, Function1<Result, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>> gn, Invariant<Mu> invariant) {
    return invariant.inmap(combined(), fn::applyCons, gn);
  }

}