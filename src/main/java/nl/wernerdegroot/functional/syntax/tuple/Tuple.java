package nl.wernerdegroot.functional.syntax.tuple;

import nl.wernerdegroot.functional.syntax.function.Function1;

public class Tuple {

  public static <A, B> Cons<A, B> of(A first, B second) {
    return new Cons<>(first, second);
  }

  public static <A, B, C> Cons<Cons<A, B>, C> of(A first, B second, C third) {
    return new Cons<>(of(first, second), third);
  }

  public static <A, B, C, D> Cons<Cons<Cons<A, B>, C>, D> of(A first, B second, C third, D fourth) {
    return new Cons<>(of(first, second, third), fourth);
  }

  public static <A, B, C, D, E> Cons<Cons<Cons<Cons<A, B>, C>, D>, E> of(A first, B second, C third, D fourth, E fifth) {
    return new Cons<>(of(first, second, third, fourth), fifth);
  }

  public static <A, B, C, D, E, F> Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F> of(A first, B second, C third, D fourth, E fifth, F sixth) {
    return new Cons<>(of(first, second, third, fourth, fifth), sixth);
  }

  public static <A, B, C, D, E, F, G> Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G> of(A first, B second, C third, D fourth, E fifth, F sixth, G seventh) {
    return new Cons<>(of(first, second, third, fourth, fifth, sixth), seventh);
  }

  public static <A, B, C, D, E, F, G, H> Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H> of(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight) {
    return new Cons<>(of(first, second, third, fourth, fifth, sixth, seventh), eight);
  }

  public static <A, B, C, D, E, F, G, H, I> Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I> of(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth) {
    return new Cons<>(of(first, second, third, fourth, fifth, sixth, seventh, eight), ninth);
  }

  public static <A, B, C, D, E, F, G, H, I, J> Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J> of(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth) {
    return new Cons<>(of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth), tenth);
  }

  public static <A, B, C, D, E, F, G, H, I, J, K> Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K> of(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh) {
    return new Cons<>(of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth), eleventh);
  }

  public static <A, B, C, D, E, F, G, H, I, J, K, L> Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L> of(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh, L twelfth) {
    return new Cons<>(of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh), twelfth);
  }

  public static <A, B, C, D, E, F, G, H, I, J, K, L, M> Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M> of(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh, L twelfth, M thirteenth) {
    return new Cons<>(of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth), thirteenth);
  }

  public static <A, B, C, D, E, F, G, H, I, J, K, L, M, N> Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N> of(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh, L twelfth, M thirteenth, N fourteenth) {
    return new Cons<>(of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth), fourteenth);
  }

  public static <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O> of(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh, L twelfth, M thirteenth, N fourteenth, O fifteenth) {
    return new Cons<>(of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth), fifteenth);
  }

  public static <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P> of(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh, L twelfth, M thirteenth, N fourteenth, O fifteenth, P sixteenth) {
    return new Cons<>(of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth), sixteenth);
  }

  public static <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q> of(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh, L twelfth, M thirteenth, N fourteenth, O fifteenth, P sixteenth, Q seventeenth) {
    return new Cons<>(of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth), seventeenth);
  }

  public static <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R> of(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh, L twelfth, M thirteenth, N fourteenth, O fifteenth, P sixteenth, Q seventeenth, R eighteenth) {
    return new Cons<>(of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth), eighteenth);
  }

  public static <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S> of(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh, L twelfth, M thirteenth, N fourteenth, O fifteenth, P sixteenth, Q seventeenth, R eighteenth, S nineteenth) {
    return new Cons<>(of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth), nineteenth);
  }

  public static <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S>, T> of(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh, L twelfth, M thirteenth, N fourteenth, O fifteenth, P sixteenth, Q seventeenth, R eighteenth, S nineteenth, T twentieth) {
    return new Cons<>(of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth), twentieth);
  }

  public static <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S>, T>, U> of(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh, L twelfth, M thirteenth, N fourteenth, O fifteenth, P sixteenth, Q seventeenth, R eighteenth, S nineteenth, T twentieth, U twentyFirst) {
    return new Cons<>(of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth), twentyFirst);
  }

  public static <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S>, T>, U>, V> of(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh, L twelfth, M thirteenth, N fourteenth, O fifteenth, P sixteenth, Q seventeenth, R eighteenth, S nineteenth, T twentieth, U twentyFirst, V twentySecond) {
    return new Cons<>(of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth, twentyFirst), twentySecond);
  }

  public static <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S>, T>, U>, V>, W> of(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh, L twelfth, M thirteenth, N fourteenth, O fifteenth, P sixteenth, Q seventeenth, R eighteenth, S nineteenth, T twentieth, U twentyFirst, V twentySecond, W twentyThird) {
    return new Cons<>(of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth, twentyFirst, twentySecond), twentyThird);
  }

  public static <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S>, T>, U>, V>, W>, X> of(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh, L twelfth, M thirteenth, N fourteenth, O fifteenth, P sixteenth, Q seventeenth, R eighteenth, S nineteenth, T twentieth, U twentyFirst, V twentySecond, W twentyThird, X twentyFourth) {
    return new Cons<>(of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth, twentyFirst, twentySecond, twentyThird), twentyFourth);
  }

  public static <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S>, T>, U>, V>, W>, X>, Y> of(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eight, I ninth, J tenth, K eleventh, L twelfth, M thirteenth, N fourteenth, O fifteenth, P sixteenth, Q seventeenth, R eighteenth, S nineteenth, T twentieth, U twentyFirst, V twentySecond, W twentyThird, X twentyFourth, Y twentyFifth) {
    return new Cons<>(of(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth, twentyFirst, twentySecond, twentyThird, twentyFourth), twentyFifth);
  }

  public static <Input, A, B> Function1<Input, Cons<A, B>> by(Function1<Input, A> first, Function1<Input, B> second) {
    return i -> of(first.apply(i), second.apply(i));
  }

  public static <Input, A, B, C> Function1<Input, Cons<Cons<A, B>, C>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i));
  }

  public static <Input, A, B, C, D> Function1<Input, Cons<Cons<Cons<A, B>, C>, D>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i));
  }

  public static <Input, A, B, C, D, E> Function1<Input, Cons<Cons<Cons<Cons<A, B>, C>, D>, E>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i));
  }

  public static <Input, A, B, C, D, E, F> Function1<Input, Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth, Function1<Input, F> sixth) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i), sixth.apply(i));
  }

  public static <Input, A, B, C, D, E, F, G> Function1<Input, Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth, Function1<Input, F> sixth, Function1<Input, G> seventh) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i), sixth.apply(i), seventh.apply(i));
  }

  public static <Input, A, B, C, D, E, F, G, H> Function1<Input, Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth, Function1<Input, F> sixth, Function1<Input, G> seventh, Function1<Input, H> eight) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i), sixth.apply(i), seventh.apply(i), eight.apply(i));
  }

  public static <Input, A, B, C, D, E, F, G, H, I> Function1<Input, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth, Function1<Input, F> sixth, Function1<Input, G> seventh, Function1<Input, H> eight, Function1<Input, I> ninth) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i), sixth.apply(i), seventh.apply(i), eight.apply(i), ninth.apply(i));
  }

  public static <Input, A, B, C, D, E, F, G, H, I, J> Function1<Input, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth, Function1<Input, F> sixth, Function1<Input, G> seventh, Function1<Input, H> eight, Function1<Input, I> ninth, Function1<Input, J> tenth) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i), sixth.apply(i), seventh.apply(i), eight.apply(i), ninth.apply(i), tenth.apply(i));
  }

  public static <Input, A, B, C, D, E, F, G, H, I, J, K> Function1<Input, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth, Function1<Input, F> sixth, Function1<Input, G> seventh, Function1<Input, H> eight, Function1<Input, I> ninth, Function1<Input, J> tenth, Function1<Input, K> eleventh) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i), sixth.apply(i), seventh.apply(i), eight.apply(i), ninth.apply(i), tenth.apply(i), eleventh.apply(i));
  }

  public static <Input, A, B, C, D, E, F, G, H, I, J, K, L> Function1<Input, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth, Function1<Input, F> sixth, Function1<Input, G> seventh, Function1<Input, H> eight, Function1<Input, I> ninth, Function1<Input, J> tenth, Function1<Input, K> eleventh, Function1<Input, L> twelfth) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i), sixth.apply(i), seventh.apply(i), eight.apply(i), ninth.apply(i), tenth.apply(i), eleventh.apply(i), twelfth.apply(i));
  }

  public static <Input, A, B, C, D, E, F, G, H, I, J, K, L, M> Function1<Input, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth, Function1<Input, F> sixth, Function1<Input, G> seventh, Function1<Input, H> eight, Function1<Input, I> ninth, Function1<Input, J> tenth, Function1<Input, K> eleventh, Function1<Input, L> twelfth, Function1<Input, M> thirteenth) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i), sixth.apply(i), seventh.apply(i), eight.apply(i), ninth.apply(i), tenth.apply(i), eleventh.apply(i), twelfth.apply(i), thirteenth.apply(i));
  }

  public static <Input, A, B, C, D, E, F, G, H, I, J, K, L, M, N> Function1<Input, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth, Function1<Input, F> sixth, Function1<Input, G> seventh, Function1<Input, H> eight, Function1<Input, I> ninth, Function1<Input, J> tenth, Function1<Input, K> eleventh, Function1<Input, L> twelfth, Function1<Input, M> thirteenth, Function1<Input, N> fourteenth) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i), sixth.apply(i), seventh.apply(i), eight.apply(i), ninth.apply(i), tenth.apply(i), eleventh.apply(i), twelfth.apply(i), thirteenth.apply(i), fourteenth.apply(i));
  }

  public static <Input, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> Function1<Input, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth, Function1<Input, F> sixth, Function1<Input, G> seventh, Function1<Input, H> eight, Function1<Input, I> ninth, Function1<Input, J> tenth, Function1<Input, K> eleventh, Function1<Input, L> twelfth, Function1<Input, M> thirteenth, Function1<Input, N> fourteenth, Function1<Input, O> fifteenth) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i), sixth.apply(i), seventh.apply(i), eight.apply(i), ninth.apply(i), tenth.apply(i), eleventh.apply(i), twelfth.apply(i), thirteenth.apply(i), fourteenth.apply(i), fifteenth.apply(i));
  }

  public static <Input, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> Function1<Input, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth, Function1<Input, F> sixth, Function1<Input, G> seventh, Function1<Input, H> eight, Function1<Input, I> ninth, Function1<Input, J> tenth, Function1<Input, K> eleventh, Function1<Input, L> twelfth, Function1<Input, M> thirteenth, Function1<Input, N> fourteenth, Function1<Input, O> fifteenth, Function1<Input, P> sixteenth) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i), sixth.apply(i), seventh.apply(i), eight.apply(i), ninth.apply(i), tenth.apply(i), eleventh.apply(i), twelfth.apply(i), thirteenth.apply(i), fourteenth.apply(i), fifteenth.apply(i), sixteenth.apply(i));
  }

  public static <Input, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> Function1<Input, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth, Function1<Input, F> sixth, Function1<Input, G> seventh, Function1<Input, H> eight, Function1<Input, I> ninth, Function1<Input, J> tenth, Function1<Input, K> eleventh, Function1<Input, L> twelfth, Function1<Input, M> thirteenth, Function1<Input, N> fourteenth, Function1<Input, O> fifteenth, Function1<Input, P> sixteenth, Function1<Input, Q> seventeenth) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i), sixth.apply(i), seventh.apply(i), eight.apply(i), ninth.apply(i), tenth.apply(i), eleventh.apply(i), twelfth.apply(i), thirteenth.apply(i), fourteenth.apply(i), fifteenth.apply(i), sixteenth.apply(i), seventeenth.apply(i));
  }

  public static <Input, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> Function1<Input, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth, Function1<Input, F> sixth, Function1<Input, G> seventh, Function1<Input, H> eight, Function1<Input, I> ninth, Function1<Input, J> tenth, Function1<Input, K> eleventh, Function1<Input, L> twelfth, Function1<Input, M> thirteenth, Function1<Input, N> fourteenth, Function1<Input, O> fifteenth, Function1<Input, P> sixteenth, Function1<Input, Q> seventeenth, Function1<Input, R> eighteenth) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i), sixth.apply(i), seventh.apply(i), eight.apply(i), ninth.apply(i), tenth.apply(i), eleventh.apply(i), twelfth.apply(i), thirteenth.apply(i), fourteenth.apply(i), fifteenth.apply(i), sixteenth.apply(i), seventeenth.apply(i), eighteenth.apply(i));
  }

  public static <Input, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> Function1<Input, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth, Function1<Input, F> sixth, Function1<Input, G> seventh, Function1<Input, H> eight, Function1<Input, I> ninth, Function1<Input, J> tenth, Function1<Input, K> eleventh, Function1<Input, L> twelfth, Function1<Input, M> thirteenth, Function1<Input, N> fourteenth, Function1<Input, O> fifteenth, Function1<Input, P> sixteenth, Function1<Input, Q> seventeenth, Function1<Input, R> eighteenth, Function1<Input, S> nineteenth) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i), sixth.apply(i), seventh.apply(i), eight.apply(i), ninth.apply(i), tenth.apply(i), eleventh.apply(i), twelfth.apply(i), thirteenth.apply(i), fourteenth.apply(i), fifteenth.apply(i), sixteenth.apply(i), seventeenth.apply(i), eighteenth.apply(i), nineteenth.apply(i));
  }

  public static <Input, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> Function1<Input, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S>, T>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth, Function1<Input, F> sixth, Function1<Input, G> seventh, Function1<Input, H> eight, Function1<Input, I> ninth, Function1<Input, J> tenth, Function1<Input, K> eleventh, Function1<Input, L> twelfth, Function1<Input, M> thirteenth, Function1<Input, N> fourteenth, Function1<Input, O> fifteenth, Function1<Input, P> sixteenth, Function1<Input, Q> seventeenth, Function1<Input, R> eighteenth, Function1<Input, S> nineteenth, Function1<Input, T> twentieth) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i), sixth.apply(i), seventh.apply(i), eight.apply(i), ninth.apply(i), tenth.apply(i), eleventh.apply(i), twelfth.apply(i), thirteenth.apply(i), fourteenth.apply(i), fifteenth.apply(i), sixteenth.apply(i), seventeenth.apply(i), eighteenth.apply(i), nineteenth.apply(i), twentieth.apply(i));
  }

  public static <Input, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> Function1<Input, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S>, T>, U>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth, Function1<Input, F> sixth, Function1<Input, G> seventh, Function1<Input, H> eight, Function1<Input, I> ninth, Function1<Input, J> tenth, Function1<Input, K> eleventh, Function1<Input, L> twelfth, Function1<Input, M> thirteenth, Function1<Input, N> fourteenth, Function1<Input, O> fifteenth, Function1<Input, P> sixteenth, Function1<Input, Q> seventeenth, Function1<Input, R> eighteenth, Function1<Input, S> nineteenth, Function1<Input, T> twentieth, Function1<Input, U> twentyFirst) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i), sixth.apply(i), seventh.apply(i), eight.apply(i), ninth.apply(i), tenth.apply(i), eleventh.apply(i), twelfth.apply(i), thirteenth.apply(i), fourteenth.apply(i), fifteenth.apply(i), sixteenth.apply(i), seventeenth.apply(i), eighteenth.apply(i), nineteenth.apply(i), twentieth.apply(i), twentyFirst.apply(i));
  }

  public static <Input, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> Function1<Input, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S>, T>, U>, V>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth, Function1<Input, F> sixth, Function1<Input, G> seventh, Function1<Input, H> eight, Function1<Input, I> ninth, Function1<Input, J> tenth, Function1<Input, K> eleventh, Function1<Input, L> twelfth, Function1<Input, M> thirteenth, Function1<Input, N> fourteenth, Function1<Input, O> fifteenth, Function1<Input, P> sixteenth, Function1<Input, Q> seventeenth, Function1<Input, R> eighteenth, Function1<Input, S> nineteenth, Function1<Input, T> twentieth, Function1<Input, U> twentyFirst, Function1<Input, V> twentySecond) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i), sixth.apply(i), seventh.apply(i), eight.apply(i), ninth.apply(i), tenth.apply(i), eleventh.apply(i), twelfth.apply(i), thirteenth.apply(i), fourteenth.apply(i), fifteenth.apply(i), sixteenth.apply(i), seventeenth.apply(i), eighteenth.apply(i), nineteenth.apply(i), twentieth.apply(i), twentyFirst.apply(i), twentySecond.apply(i));
  }

  public static <Input, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> Function1<Input, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S>, T>, U>, V>, W>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth, Function1<Input, F> sixth, Function1<Input, G> seventh, Function1<Input, H> eight, Function1<Input, I> ninth, Function1<Input, J> tenth, Function1<Input, K> eleventh, Function1<Input, L> twelfth, Function1<Input, M> thirteenth, Function1<Input, N> fourteenth, Function1<Input, O> fifteenth, Function1<Input, P> sixteenth, Function1<Input, Q> seventeenth, Function1<Input, R> eighteenth, Function1<Input, S> nineteenth, Function1<Input, T> twentieth, Function1<Input, U> twentyFirst, Function1<Input, V> twentySecond, Function1<Input, W> twentyThird) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i), sixth.apply(i), seventh.apply(i), eight.apply(i), ninth.apply(i), tenth.apply(i), eleventh.apply(i), twelfth.apply(i), thirteenth.apply(i), fourteenth.apply(i), fifteenth.apply(i), sixteenth.apply(i), seventeenth.apply(i), eighteenth.apply(i), nineteenth.apply(i), twentieth.apply(i), twentyFirst.apply(i), twentySecond.apply(i), twentyThird.apply(i));
  }

  public static <Input, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> Function1<Input, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S>, T>, U>, V>, W>, X>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth, Function1<Input, F> sixth, Function1<Input, G> seventh, Function1<Input, H> eight, Function1<Input, I> ninth, Function1<Input, J> tenth, Function1<Input, K> eleventh, Function1<Input, L> twelfth, Function1<Input, M> thirteenth, Function1<Input, N> fourteenth, Function1<Input, O> fifteenth, Function1<Input, P> sixteenth, Function1<Input, Q> seventeenth, Function1<Input, R> eighteenth, Function1<Input, S> nineteenth, Function1<Input, T> twentieth, Function1<Input, U> twentyFirst, Function1<Input, V> twentySecond, Function1<Input, W> twentyThird, Function1<Input, X> twentyFourth) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i), sixth.apply(i), seventh.apply(i), eight.apply(i), ninth.apply(i), tenth.apply(i), eleventh.apply(i), twelfth.apply(i), thirteenth.apply(i), fourteenth.apply(i), fifteenth.apply(i), sixteenth.apply(i), seventeenth.apply(i), eighteenth.apply(i), nineteenth.apply(i), twentieth.apply(i), twentyFirst.apply(i), twentySecond.apply(i), twentyThird.apply(i), twentyFourth.apply(i));
  }

  public static <Input, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> Function1<Input, Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<Cons<A, B>, C>, D>, E>, F>, G>, H>, I>, J>, K>, L>, M>, N>, O>, P>, Q>, R>, S>, T>, U>, V>, W>, X>, Y>> by(Function1<Input, A> first, Function1<Input, B> second, Function1<Input, C> third, Function1<Input, D> fourth, Function1<Input, E> fifth, Function1<Input, F> sixth, Function1<Input, G> seventh, Function1<Input, H> eight, Function1<Input, I> ninth, Function1<Input, J> tenth, Function1<Input, K> eleventh, Function1<Input, L> twelfth, Function1<Input, M> thirteenth, Function1<Input, N> fourteenth, Function1<Input, O> fifteenth, Function1<Input, P> sixteenth, Function1<Input, Q> seventeenth, Function1<Input, R> eighteenth, Function1<Input, S> nineteenth, Function1<Input, T> twentieth, Function1<Input, U> twentyFirst, Function1<Input, V> twentySecond, Function1<Input, W> twentyThird, Function1<Input, X> twentyFourth, Function1<Input, Y> twentyFifth) {
    return i -> of(first.apply(i), second.apply(i), third.apply(i), fourth.apply(i), fifth.apply(i), sixth.apply(i), seventh.apply(i), eight.apply(i), ninth.apply(i), tenth.apply(i), eleventh.apply(i), twelfth.apply(i), thirteenth.apply(i), fourteenth.apply(i), fifteenth.apply(i), sixteenth.apply(i), seventeenth.apply(i), eighteenth.apply(i), nineteenth.apply(i), twentieth.apply(i), twentyFirst.apply(i), twentySecond.apply(i), twentyThird.apply(i), twentyFourth.apply(i), twentyFifth.apply(i));
  }

}