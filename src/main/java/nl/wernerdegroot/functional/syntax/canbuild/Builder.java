package nl.wernerdegroot.functional.syntax.canbuild;

import nl.wernerdegroot.functional.syntax.hkt.Hkt;

public class Builder<Mu> {

  private final CanBuild<Mu> canBuild;

  public Builder(CanBuild<Mu> canBuild) {
    this.canBuild = canBuild;
  }

  public static <Mu> Builder<Mu> of(CanBuild<Mu> canBuild) {
    return new Builder<>(canBuild);
  }

  public <A> Builder1<Mu, A> of(Hkt<Mu, A> first) {
    return new Builder1<>(canBuild, first);
  }

  public <A, B> Builder2<Mu, A, B> of(Hkt<Mu, A> first, Hkt<Mu, B> second) {
    return of(first).and(second);
  }

  public <A, B, C> Builder3<Mu, A, B, C> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third) {
    return of(first, second).and(third);
  }

  public <A, B, C, D> Builder4<Mu, A, B, C, D> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth) {
    return of(first, second, third).and(fourth);
  }

  public <A, B, C, D, E> Builder5<Mu, A, B, C, D, E> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth) {
    return of(first, second, third, fourth).and(fifth);
  }

  public <A, B, C, D, E, F> Builder6<Mu, A, B, C, D, E, F> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth) {
    return of(first, second, third, fourth, fifth).and(sixth);
  }

  public <A, B, C, D, E, F, G> Builder7<Mu, A, B, C, D, E, F, G> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth, Hkt<Mu, G> seventh) {
    return of(first, second, third, fourth, fifth, sixth).and(seventh);
  }

  public <A, B, C, D, E, F, G, H> Builder8<Mu, A, B, C, D, E, F, G, H> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth, Hkt<Mu, G> seventh, Hkt<Mu, H> eight) {
    return of(first, second, third, fourth, fifth, sixth, seventh).and(eight);
  }

  public <A, B, C, D, E, F, G, H, I> Builder9<Mu, A, B, C, D, E, F, G, H, I> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth, Hkt<Mu, G> seventh, Hkt<Mu, H> eight, Hkt<Mu, I> ninth) {
    return of(first, second, third, fourth, fifth, sixth, seventh, eight).and(ninth);
  }

  public <A, B, C, D, E, F, G, H, I, J> Builder10<Mu, A, B, C, D, E, F, G, H, I, J> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth, Hkt<Mu, G> seventh, Hkt<Mu, H> eight, Hkt<Mu, I> ninth, Hkt<Mu, J> tenth) {
    return of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth).and(tenth);
  }

  public <A, B, C, D, E, F, G, H, I, J, K> Builder11<Mu, A, B, C, D, E, F, G, H, I, J, K> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth, Hkt<Mu, G> seventh, Hkt<Mu, H> eight, Hkt<Mu, I> ninth, Hkt<Mu, J> tenth, Hkt<Mu, K> eleventh) {
    return of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth).and(eleventh);
  }

  public <A, B, C, D, E, F, G, H, I, J, K, L> Builder12<Mu, A, B, C, D, E, F, G, H, I, J, K, L> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth, Hkt<Mu, G> seventh, Hkt<Mu, H> eight, Hkt<Mu, I> ninth, Hkt<Mu, J> tenth, Hkt<Mu, K> eleventh, Hkt<Mu, L> twelfth) {
    return of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh).and(twelfth);
  }

  public <A, B, C, D, E, F, G, H, I, J, K, L, M> Builder13<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth, Hkt<Mu, G> seventh, Hkt<Mu, H> eight, Hkt<Mu, I> ninth, Hkt<Mu, J> tenth, Hkt<Mu, K> eleventh, Hkt<Mu, L> twelfth, Hkt<Mu, M> thirteenth) {
    return of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth).and(thirteenth);
  }

  public <A, B, C, D, E, F, G, H, I, J, K, L, M, N> Builder14<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth, Hkt<Mu, G> seventh, Hkt<Mu, H> eight, Hkt<Mu, I> ninth, Hkt<Mu, J> tenth, Hkt<Mu, K> eleventh, Hkt<Mu, L> twelfth, Hkt<Mu, M> thirteenth, Hkt<Mu, N> fourteenth) {
    return of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth).and(fourteenth);
  }

  public <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> Builder15<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth, Hkt<Mu, G> seventh, Hkt<Mu, H> eight, Hkt<Mu, I> ninth, Hkt<Mu, J> tenth, Hkt<Mu, K> eleventh, Hkt<Mu, L> twelfth, Hkt<Mu, M> thirteenth, Hkt<Mu, N> fourteenth, Hkt<Mu, O> fifteenth) {
    return of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth).and(fifteenth);
  }

  public <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> Builder16<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth, Hkt<Mu, G> seventh, Hkt<Mu, H> eight, Hkt<Mu, I> ninth, Hkt<Mu, J> tenth, Hkt<Mu, K> eleventh, Hkt<Mu, L> twelfth, Hkt<Mu, M> thirteenth, Hkt<Mu, N> fourteenth, Hkt<Mu, O> fifteenth, Hkt<Mu, P> sixteenth) {
    return of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth).and(sixteenth);
  }

  public <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> Builder17<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth, Hkt<Mu, G> seventh, Hkt<Mu, H> eight, Hkt<Mu, I> ninth, Hkt<Mu, J> tenth, Hkt<Mu, K> eleventh, Hkt<Mu, L> twelfth, Hkt<Mu, M> thirteenth, Hkt<Mu, N> fourteenth, Hkt<Mu, O> fifteenth, Hkt<Mu, P> sixteenth, Hkt<Mu, Q> seventeenth) {
    return of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth).and(seventeenth);
  }

  public <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> Builder18<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth, Hkt<Mu, G> seventh, Hkt<Mu, H> eight, Hkt<Mu, I> ninth, Hkt<Mu, J> tenth, Hkt<Mu, K> eleventh, Hkt<Mu, L> twelfth, Hkt<Mu, M> thirteenth, Hkt<Mu, N> fourteenth, Hkt<Mu, O> fifteenth, Hkt<Mu, P> sixteenth, Hkt<Mu, Q> seventeenth, Hkt<Mu, R> eighteenth) {
    return of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth).and(eighteenth);
  }

  public <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> Builder19<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth, Hkt<Mu, G> seventh, Hkt<Mu, H> eight, Hkt<Mu, I> ninth, Hkt<Mu, J> tenth, Hkt<Mu, K> eleventh, Hkt<Mu, L> twelfth, Hkt<Mu, M> thirteenth, Hkt<Mu, N> fourteenth, Hkt<Mu, O> fifteenth, Hkt<Mu, P> sixteenth, Hkt<Mu, Q> seventeenth, Hkt<Mu, R> eighteenth, Hkt<Mu, S> nineteenth) {
    return of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth).and(nineteenth);
  }

  public <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> Builder20<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth, Hkt<Mu, G> seventh, Hkt<Mu, H> eight, Hkt<Mu, I> ninth, Hkt<Mu, J> tenth, Hkt<Mu, K> eleventh, Hkt<Mu, L> twelfth, Hkt<Mu, M> thirteenth, Hkt<Mu, N> fourteenth, Hkt<Mu, O> fifteenth, Hkt<Mu, P> sixteenth, Hkt<Mu, Q> seventeenth, Hkt<Mu, R> eighteenth, Hkt<Mu, S> nineteenth, Hkt<Mu, T> twentieth) {
    return of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth).and(twentieth);
  }

  public <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> Builder21<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth, Hkt<Mu, G> seventh, Hkt<Mu, H> eight, Hkt<Mu, I> ninth, Hkt<Mu, J> tenth, Hkt<Mu, K> eleventh, Hkt<Mu, L> twelfth, Hkt<Mu, M> thirteenth, Hkt<Mu, N> fourteenth, Hkt<Mu, O> fifteenth, Hkt<Mu, P> sixteenth, Hkt<Mu, Q> seventeenth, Hkt<Mu, R> eighteenth, Hkt<Mu, S> nineteenth, Hkt<Mu, T> twentieth, Hkt<Mu, U> twentyFirst) {
    return of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth).and(twentyFirst);
  }

  public <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> Builder22<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth, Hkt<Mu, G> seventh, Hkt<Mu, H> eight, Hkt<Mu, I> ninth, Hkt<Mu, J> tenth, Hkt<Mu, K> eleventh, Hkt<Mu, L> twelfth, Hkt<Mu, M> thirteenth, Hkt<Mu, N> fourteenth, Hkt<Mu, O> fifteenth, Hkt<Mu, P> sixteenth, Hkt<Mu, Q> seventeenth, Hkt<Mu, R> eighteenth, Hkt<Mu, S> nineteenth, Hkt<Mu, T> twentieth, Hkt<Mu, U> twentyFirst, Hkt<Mu, V> twentySecond) {
    return of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth, twentyFirst).and(twentySecond);
  }

  public <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> Builder23<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth, Hkt<Mu, G> seventh, Hkt<Mu, H> eight, Hkt<Mu, I> ninth, Hkt<Mu, J> tenth, Hkt<Mu, K> eleventh, Hkt<Mu, L> twelfth, Hkt<Mu, M> thirteenth, Hkt<Mu, N> fourteenth, Hkt<Mu, O> fifteenth, Hkt<Mu, P> sixteenth, Hkt<Mu, Q> seventeenth, Hkt<Mu, R> eighteenth, Hkt<Mu, S> nineteenth, Hkt<Mu, T> twentieth, Hkt<Mu, U> twentyFirst, Hkt<Mu, V> twentySecond, Hkt<Mu, W> twentyThird) {
    return of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth, twentyFirst, twentySecond).and(twentyThird);
  }

  public <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> Builder24<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth, Hkt<Mu, G> seventh, Hkt<Mu, H> eight, Hkt<Mu, I> ninth, Hkt<Mu, J> tenth, Hkt<Mu, K> eleventh, Hkt<Mu, L> twelfth, Hkt<Mu, M> thirteenth, Hkt<Mu, N> fourteenth, Hkt<Mu, O> fifteenth, Hkt<Mu, P> sixteenth, Hkt<Mu, Q> seventeenth, Hkt<Mu, R> eighteenth, Hkt<Mu, S> nineteenth, Hkt<Mu, T> twentieth, Hkt<Mu, U> twentyFirst, Hkt<Mu, V> twentySecond, Hkt<Mu, W> twentyThird, Hkt<Mu, X> twentyFourth) {
    return of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth, twentyFirst, twentySecond, twentyThird).and(twentyFourth);
  }

  public <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> Builder25<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth, Hkt<Mu, G> seventh, Hkt<Mu, H> eight, Hkt<Mu, I> ninth, Hkt<Mu, J> tenth, Hkt<Mu, K> eleventh, Hkt<Mu, L> twelfth, Hkt<Mu, M> thirteenth, Hkt<Mu, N> fourteenth, Hkt<Mu, O> fifteenth, Hkt<Mu, P> sixteenth, Hkt<Mu, Q> seventeenth, Hkt<Mu, R> eighteenth, Hkt<Mu, S> nineteenth, Hkt<Mu, T> twentieth, Hkt<Mu, U> twentyFirst, Hkt<Mu, V> twentySecond, Hkt<Mu, W> twentyThird, Hkt<Mu, X> twentyFourth, Hkt<Mu, Y> twentyFifth) {
    return of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth, twentyFirst, twentySecond, twentyThird, twentyFourth).and(twentyFifth);
  }

  public <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> Builder26<Mu, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> of(Hkt<Mu, A> first, Hkt<Mu, B> second, Hkt<Mu, C> third, Hkt<Mu, D> fourth, Hkt<Mu, E> fifth, Hkt<Mu, F> sixth, Hkt<Mu, G> seventh, Hkt<Mu, H> eight, Hkt<Mu, I> ninth, Hkt<Mu, J> tenth, Hkt<Mu, K> eleventh, Hkt<Mu, L> twelfth, Hkt<Mu, M> thirteenth, Hkt<Mu, N> fourteenth, Hkt<Mu, O> fifteenth, Hkt<Mu, P> sixteenth, Hkt<Mu, Q> seventeenth, Hkt<Mu, R> eighteenth, Hkt<Mu, S> nineteenth, Hkt<Mu, T> twentieth, Hkt<Mu, U> twentyFirst, Hkt<Mu, V> twentySecond, Hkt<Mu, W> twentyThird, Hkt<Mu, X> twentyFourth, Hkt<Mu, Y> twentyFifth, Hkt<Mu, Z> twentySixth) {
    return of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth, twentyFirst, twentySecond, twentyThird, twentyFourth, twentyFifth).and(twentySixth);
  }

}