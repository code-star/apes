package nl.wernerdegroot.functional.syntax.canbuild;

import nl.wernerdegroot.functional.syntax.function.Function1;
import nl.wernerdegroot.functional.syntax.function.Function10;
import nl.wernerdegroot.functional.syntax.hkt.Hkt;
import nl.wernerdegroot.functional.syntax.tuple.Cons;
import nl.wernerdegroot.functional.syntax.typeclass.Functor;
import nl.wernerdegroot.functional.syntax.typeclass.Contravariant;
import nl.wernerdegroot.functional.syntax.typeclass.Invariant;

public class Builder10<Mu, A, B, C, D, E, F, G, H, I, J> {

  private final CanBuild<Mu> canBuild;
  private final Builder9<Mu, A, B, C, D, E, F, G, H, I> previous;
  private final Hkt<Mu, J> current;

  public Builder10(CanBuild<Mu> canBuild, Builder9<Mu, A, B, C, D, E, F, G, H, I> previous, Hkt<Mu, J> current) {
    this.canBuild = canBuild;
    this.previous = previous;
    this.current = current;
  }

  public Builder9<Mu, A, B, C, D, E, F, G, H, I> getPrevious() {
    return previous;
  }

  public Hkt<Mu, J> getCurrent() {
    return current;
  }

  Hkt<Mu, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>> combined() {
    return canBuild.combine(previous.combined(), current);
  }

  public <K> Builder11<Mu, A, B, C, D, E, F, G, H, I, J, K> and(Hkt<Mu, K> muk) {
    return new Builder11<>(canBuild, this, muk);
  }

  public <K> Builder11<Mu, A, B, C, D, E, F, G, H, I, J, K> and(Builder1<Mu, K> that) {
    return and(that.getCurrent());
  }

  public <K, L> Builder12<Mu, A, B, C, D, E, F, G, H, I, J, K, L> and(Builder2<Mu, K, L> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <K, L, M> Builder13<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M> and(Builder3<Mu, K, L, M> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <K, L, M, N> Builder14<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N> and(Builder4<Mu, K, L, M, N> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <K, L, M, N, O> Builder15<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> and(Builder5<Mu, K, L, M, N, O> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <K, L, M, N, O, P> Builder16<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> and(Builder6<Mu, K, L, M, N, O, P> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <K, L, M, N, O, P, Q> Builder17<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> and(Builder7<Mu, K, L, M, N, O, P, Q> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <K, L, M, N, O, P, Q, R> Builder18<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> and(Builder8<Mu, K, L, M, N, O, P, Q, R> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <K, L, M, N, O, P, Q, R, S> Builder19<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> and(Builder9<Mu, K, L, M, N, O, P, Q, R, S> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <K, L, M, N, O, P, Q, R, S, T> Builder20<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> and(Builder10<Mu, K, L, M, N, O, P, Q, R, S, T> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <K, L, M, N, O, P, Q, R, S, T, U> Builder21<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> and(Builder11<Mu, K, L, M, N, O, P, Q, R, S, T, U> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <K, L, M, N, O, P, Q, R, S, T, U, V> Builder22<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> and(Builder12<Mu, K, L, M, N, O, P, Q, R, S, T, U, V> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <K, L, M, N, O, P, Q, R, S, T, U, V, W> Builder23<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> and(Builder13<Mu, K, L, M, N, O, P, Q, R, S, T, U, V, W> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <K, L, M, N, O, P, Q, R, S, T, U, V, W, X> Builder24<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> and(Builder14<Mu, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> Builder25<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> and(Builder15<Mu, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> Builder26<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> and(Builder16<Mu, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <Result> Hkt<Mu, Result> map(Function10<A, B, C, D, E, F, G, H, I, J, Result> fn, Functor<Mu> functor) {
    return functor.map(combined(), fn::applyCons);
  }

  public <Result> Hkt<Mu, Result> contramap(Function1<Result, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>> fn, Contravariant<Mu> contravariant) {
    return contravariant.contramap(combined(), fn);
  }

  public <Result> Hkt<Mu, Result> inmap(Function10<A, B, C, D, E, F, G, H, I, J, Result> fn, Function1<Result, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>> gn, Invariant<Mu> invariant) {
    return invariant.inmap(combined(), fn::applyCons, gn);
  }

}