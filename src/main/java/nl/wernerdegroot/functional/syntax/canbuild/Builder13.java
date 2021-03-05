package nl.wernerdegroot.functional.syntax.canbuild;

import nl.wernerdegroot.functional.syntax.function.Function1;
import nl.wernerdegroot.functional.syntax.function.Function13;
import nl.wernerdegroot.functional.syntax.hkt.Hkt;
import nl.wernerdegroot.functional.syntax.tuple.Cons;
import nl.wernerdegroot.functional.syntax.typeclass.Functor;
import nl.wernerdegroot.functional.syntax.typeclass.Contravariant;
import nl.wernerdegroot.functional.syntax.typeclass.Invariant;

public class Builder13<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M> {

  private final CanBuild<Mu> canBuild;
  private final Builder12<Mu, A, B, C, D, E, F, G, H, I, J, K, L> previous;
  private final Hkt<Mu, M> current;

  public Builder13(CanBuild<Mu> canBuild, Builder12<Mu, A, B, C, D, E, F, G, H, I, J, K, L> previous, Hkt<Mu, M> current) {
    this.canBuild = canBuild;
    this.previous = previous;
    this.current = current;
  }

  public Builder12<Mu, A, B, C, D, E, F, G, H, I, J, K, L> getPrevious() {
    return previous;
  }

  public Hkt<Mu, M> getCurrent() {
    return current;
  }

  Hkt<Mu, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>> combined() {
    return canBuild.combine(previous.combined(), current);
  }

  public <N> Builder14<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N> and(Hkt<Mu, N> mun) {
    return new Builder14<>(canBuild, this, mun);
  }

  public <N> Builder14<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N> and(Builder1<Mu, N> that) {
    return and(that.getCurrent());
  }

  public <N, O> Builder15<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> and(Builder2<Mu, N, O> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <N, O, P> Builder16<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> and(Builder3<Mu, N, O, P> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <N, O, P, Q> Builder17<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> and(Builder4<Mu, N, O, P, Q> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <N, O, P, Q, R> Builder18<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> and(Builder5<Mu, N, O, P, Q, R> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <N, O, P, Q, R, S> Builder19<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> and(Builder6<Mu, N, O, P, Q, R, S> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <N, O, P, Q, R, S, T> Builder20<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> and(Builder7<Mu, N, O, P, Q, R, S, T> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <N, O, P, Q, R, S, T, U> Builder21<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> and(Builder8<Mu, N, O, P, Q, R, S, T, U> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <N, O, P, Q, R, S, T, U, V> Builder22<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> and(Builder9<Mu, N, O, P, Q, R, S, T, U, V> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <N, O, P, Q, R, S, T, U, V, W> Builder23<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> and(Builder10<Mu, N, O, P, Q, R, S, T, U, V, W> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <N, O, P, Q, R, S, T, U, V, W, X> Builder24<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> and(Builder11<Mu, N, O, P, Q, R, S, T, U, V, W, X> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <N, O, P, Q, R, S, T, U, V, W, X, Y> Builder25<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> and(Builder12<Mu, N, O, P, Q, R, S, T, U, V, W, X, Y> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <N, O, P, Q, R, S, T, U, V, W, X, Y, Z> Builder26<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> and(Builder13<Mu, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <Result> Hkt<Mu, Result> map(Function13<A, B, C, D, E, F, G, H, I, J, K, L, M, Result> fn, Functor<Mu> functor) {
    return functor.map(combined(), fn::applyCons);
  }

  public <Result> Hkt<Mu, Result> contramap(Function1<Result, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>> fn, Contravariant<Mu> contravariant) {
    return contravariant.contramap(combined(), fn);
  }

  public <Result> Hkt<Mu, Result> inmap(Function13<A, B, C, D, E, F, G, H, I, J, K, L, M, Result> fn, Function1<Result, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>> gn, Invariant<Mu> invariant) {
    return invariant.inmap(combined(), fn::applyCons, gn);
  }

}