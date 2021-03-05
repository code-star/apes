package nl.codestar.apes.core.function;

import nl.codestar.apes.core.canbuild.CanBuild;
import nl.codestar.apes.core.hkt.Hkt;
import nl.codestar.apes.core.tuple.Cons;
import nl.codestar.apes.core.typeclass.Functor;

@FunctionalInterface
public interface Function1<A, Result> extends Hkt<Function1.Mu<A>, Result> {

  class Mu<A> {}

  class Function1Functor<X> implements Functor<Mu<X>> {
    @Override
    public <A, B> Function1<X, B> map(Hkt<Mu<X>, A> fa, Function1<A, B> fn) {
      Function1<X, A> faHkt = fa.coerce();
      return x -> fn.apply(faHkt.apply(x));
    }
  }

  class Function1CanBuild<X> implements CanBuild<Mu<X>>{
    @Override
    public <A, B> Function1<X, Cons<A, B>> combine(Hkt<Mu<X>, A> left, Hkt<Mu<X>, B> right) {
      Function1<X, A> leftHkt = left.coerce();
      Function1<X, B> rightHkt = right.coerce();
      return x -> new Cons<>(leftHkt.apply(x), rightHkt.apply(x));
    }
  }

  static <A, Result> Function1<A, Result> of(Function1<A, Result> func) {
    return func;
  }

  static <A> Functor<Mu<A>> functor() {
    return new Function1Functor<>();
  }

  static <A> CanBuild<Mu<A>> canBuild() {
    return new Function1CanBuild<>();
  }



  Result apply(A first);

  default Result applyCons(A first) {
    return apply(first);
  }

}