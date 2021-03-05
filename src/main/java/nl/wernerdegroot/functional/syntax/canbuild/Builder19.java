package nl.wernerdegroot.functional.syntax.canbuild;

import nl.wernerdegroot.functional.syntax.function.Function1;
import nl.wernerdegroot.functional.syntax.function.Function19;
import nl.wernerdegroot.functional.syntax.hkt.Hkt;
import nl.wernerdegroot.functional.syntax.tuple.Cons;
import nl.wernerdegroot.functional.syntax.typeclass.Functor;
import nl.wernerdegroot.functional.syntax.typeclass.Contravariant;
import nl.wernerdegroot.functional.syntax.typeclass.Invariant;

public class Builder19<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> {

  private final CanBuild<Mu> canBuild;
  private final Builder18<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> previous;
  private final Hkt<Mu, S> current;

  public Builder19(CanBuild<Mu> canBuild, Builder18<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> previous, Hkt<Mu, S> current) {
    this.canBuild = canBuild;
    this.previous = previous;
    this.current = current;
  }

  public Builder18<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> getPrevious() {
    return previous;
  }

  public Hkt<Mu, S> getCurrent() {
    return current;
  }

  Hkt<Mu, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S>> combined() {
    return canBuild.combine(previous.combined(), current);
  }

  public <T> Builder20<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> and(Hkt<Mu, T> mut) {
    return new Builder20<>(canBuild, this, mut);
  }

  public <T> Builder20<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> and(Builder1<Mu, T> that) {
    return and(that.getCurrent());
  }

  public <T, U> Builder21<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> and(Builder2<Mu, T, U> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <T, U, V> Builder22<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> and(Builder3<Mu, T, U, V> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <T, U, V, W> Builder23<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> and(Builder4<Mu, T, U, V, W> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <T, U, V, W, X> Builder24<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> and(Builder5<Mu, T, U, V, W, X> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <T, U, V, W, X, Y> Builder25<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> and(Builder6<Mu, T, U, V, W, X, Y> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <T, U, V, W, X, Y, Z> Builder26<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> and(Builder7<Mu, T, U, V, W, X, Y, Z> that) {
    return and(that.getPrevious()).and(that.getCurrent());
  }

  public <Result> Hkt<Mu, Result> map(Function19<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, Result> fn, Functor<Mu> functor) {
    return functor.map(combined(), fn::applyCons);
  }

  public <Result> Hkt<Mu, Result> contramap(Function1<Result, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S>> fn, Contravariant<Mu> contravariant) {
    return contravariant.contramap(combined(), fn);
  }

  public <Result> Hkt<Mu, Result> inmap(Function19<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, Result> fn, Function1<Result, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S>> gn, Invariant<Mu> invariant) {
    return invariant.inmap(combined(), fn::applyCons, gn);
  }

}