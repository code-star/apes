package nl.codestar.apes.core.function;

import nl.codestar.apes.core.canbuild.CanBuild;
import nl.codestar.apes.core.hkt.Hkt;
import nl.codestar.apes.core.tuple.Cons;
import nl.codestar.apes.core.typeclass.Contravariant;
import nl.codestar.apes.core.typeclass.Semigroup;

public class Function1Parameter<A, Result> implements Hkt<Function1Parameter.Mu<Result>, A> {

  class Function1Contravariant<Result> implements Contravariant<Mu<Result>> {
    @Override
    public <A, B> Function1Parameter<B, Result> contramap(Hkt<Mu<Result>, A> fa, Function1<B, A> fn) {
      Function1<A, Result> myFunction = coerce(fa);
      return of(x -> myFunction.apply(fn.apply(x)));
    }
  }

  class Function1ParameterCanBuild<Result> implements CanBuild<Mu<Result>> {

    private final Semigroup<Result> resultSemigroup;

    public Function1ParameterCanBuild(Semigroup<Result> resultSemigroup) {
      this.resultSemigroup = resultSemigroup;
    }

    @Override
    public <A, B> Function1Parameter<Cons<A, B>, Result> combine(Hkt<Mu<Result>, A> left, Hkt<Mu<Result>, B> right) {
      Function1<A, Result> l = coerce(left);
      Function1<B, Result> r = coerce(right);
      return of(cons -> {
        var resultLeft = l.apply(cons.getFirst());
        var resultRight = r.apply(cons.getSecond());
        return resultSemigroup.compose(resultLeft, resultRight);
      });
    }
  }

  public static class Mu<A> {}

  private final Function1<A, Result> instance;

  public Function1Parameter(Function1<A, Result> instance) {
    this.instance = instance;
  }

  public static <A, Result> Function1Parameter<A, Result> of(Function1<A, Result> value) {
    return new Function1Parameter<>(value);
  }

  public static <A, Result> Function1<A, Result> coerce(Hkt<Mu<Result>, A> hkt) {
    Function1Parameter<A, Result> coerced = hkt.coerce();
    return coerced.instance;
  }
}
