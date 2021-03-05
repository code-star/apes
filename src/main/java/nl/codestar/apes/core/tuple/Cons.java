package nl.codestar.apes.core.tuple;

public class Cons<A, B> {
  private final A first;
  private final B second;

  public Cons(A first, B second) {
    this.first = first;
    this.second = second;
  }

  public A getFirst() {
    return first;
  }

  public B getSecond() {
    return second;
  }
}
