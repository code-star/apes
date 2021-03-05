package nl.codestar.apes.core.typeclass;

public interface Semigroup<A> {

  A compose(A left, A right);

}
