package nl.wernerdegroot.functional.syntax.canbuild;

import nl.wernerdegroot.functional.syntax.function.Function1;
import nl.wernerdegroot.functional.syntax.function.Function18;
import nl.wernerdegroot.functional.syntax.hkt.Hkt;
import nl.wernerdegroot.functional.syntax.tuple.Cons;
import nl.wernerdegroot.functional.syntax.typeclass.Functor;
import nl.wernerdegroot.functional.syntax.typeclass.Contravariant;
import nl.wernerdegroot.functional.syntax.typeclass.Invariant;

public class Builder18<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> {

  private final CanBuild<Mu> canBuild;
  private final Builder17<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> previous;
  private final Hkt<Mu, R> current;

  public Builder18(CanBuild<Mu> canBuild, Builder17<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> previous, Hkt<Mu, R> current) {
    this.canBuild = canBuild;
    this.previous = previous;
    this.current = current;
  }

  public Builder17<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> getPrevious() {
    return previous;
  }

  public Hkt<Mu, R> getCurrent() {
    return current;
  }

  Hkt<Mu, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>> combined() {
    return canBuild.combine(previous.combined(), current);
  }

  public <S> Builder19<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> and(Hkt<Mu, S> mus) {
    return new Builder19<>(canBuild, this, mus);
  }

  public <S> Builder19<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> and(Builder1<Mu, S> that) {
    return and(that.getCurrent());
  }

  public <S, T> Builder20<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> and(Builder2<Mu, S, T> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <S, T, U> Builder21<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> and(Builder3<Mu, S, T, U> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <S, T, U, V> Builder22<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> and(Builder4<Mu, S, T, U, V> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <S, T, U, V, W> Builder23<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> and(Builder5<Mu, S, T, U, V, W> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <S, T, U, V, W, X> Builder24<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> and(Builder6<Mu, S, T, U, V, W, X> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <S, T, U, V, W, X, Y> Builder25<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> and(Builder7<Mu, S, T, U, V, W, X, Y> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <S, T, U, V, W, X, Y, Z> Builder26<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> and(Builder8<Mu, S, T, U, V, W, X, Y, Z> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <Result> Hkt<Mu, Result> map(Function18<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, Result> fn, Functor<Mu> functor) {
    return functor.map(combined(), fn::applyCons);
  }

  public <Result> Hkt<Mu, Result> contramap(Function1<Result, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>> fn, Contravariant<Mu> contravariant) {
    return contravariant.contramap(combined(), fn);
  }

  public <Result> Hkt<Mu, Result> inmap(Function18<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, Result> fn, Function1<Result, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>> gn, Invariant<Mu> invariant) {
    return invariant.inmap(combined(), fn::applyCons, gn);
  }

}