package nl.wernerdegroot.functional.syntax.showcase;

import nl.wernerdegroot.functional.syntax.canbuild.Builder;
import nl.wernerdegroot.functional.syntax.canbuild.CanBuild;
import nl.wernerdegroot.functional.syntax.function.Function1;
import nl.wernerdegroot.functional.syntax.hkt.Hkt;
import nl.wernerdegroot.functional.syntax.tuple.Cons;
import nl.wernerdegroot.functional.syntax.typeclass.Functor;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ResultSetReader<A> extends Hkt<ResultSetReader.Mu, A> {

  @FunctionalInterface
  interface Getter<A> {
    A get(ResultSet resultSet, int columnIndex) throws SQLException;
  }

  interface Mu {}

  CanBuild<Mu> CAN_BUILD = new CanBuild<>() {
    @Override
    public <A, B> ResultSetReader<Cons<A, B>> combine(Hkt<Mu, A> leftHkt, Hkt<Mu, B> rightHkt) {
      ResultSetReader<A> left = leftHkt.coerce();
      ResultSetReader<B> right = rightHkt.coerce();
      return resultSet -> new Cons<>(left.read(resultSet), right.read(resultSet));
    }
  };

  Functor<Mu> FUNCTOR = new Functor<Mu>() {
    @Override
    public <A, B> ResultSetReader<B> map(Hkt<Mu, A> resultSetReaderHkt, Function1<A, B> fn) {
      ResultSetReader<A> resultSetReader = resultSetReaderHkt.coerce();
      return resultSet -> fn.apply(resultSetReader.read(resultSet));
    }
  };

  static Builder<Mu> builder() {
    return Builder.of(CAN_BUILD);
  }

  A read(ResultSet resultSet) throws SQLException;

  private static <A> ResultSetReader<A> of(int columnIndex, Getter<A> getter) {
    return resultSet -> getter.get(resultSet, columnIndex);
  }

  static ResultSetReader<String> string(int index) {
    return ResultSetReader.of(index, ResultSet::getString);
  }

  static ResultSetReader<Integer> integer(int index) {
    return ResultSetReader.of(index, ResultSet::getInt);
  }

  static ResultSetReader<Boolean> bool(int index) {
    return ResultSetReader.of(index, ResultSet::getBoolean);
  }
}
