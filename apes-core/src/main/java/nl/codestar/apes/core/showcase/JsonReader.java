package nl.codestar.apes.core.showcase;

import com.fasterxml.jackson.databind.JsonNode;
import nl.codestar.apes.core.canbuild.Builder;
import nl.codestar.apes.core.canbuild.CanBuild;
import nl.codestar.apes.core.function.Function1;
import nl.codestar.apes.core.hkt.Hkt;
import nl.codestar.apes.core.tuple.Cons;
import nl.codestar.apes.core.typeclass.Functor;

@FunctionalInterface
public interface JsonReader<A> extends Hkt<JsonReader.Mu, A> {

  JsonReader<String> STRING_READER = JsonNode::asText;
  JsonReader<Integer> INT_READER = JsonNode::asInt;
  JsonReader<Boolean> BOOLEAN_READER = JsonNode::asBoolean;

  interface Mu {}

  CanBuild<Mu> CAN_BUILD = new CanBuild<>() {
    @Override
    public <A, B> JsonReader<Cons<A, B>> combine(Hkt<Mu, A> leftHkt, Hkt<Mu, B> rightHkt) {
      JsonReader<A> left = leftHkt.coerce();
      JsonReader<B> right = rightHkt.coerce();
      return json -> new Cons<>(left.read(json), right.read(json));
    }
  };

  Functor<Mu> FUNCTOR = new Functor<>() {
    @Override
    public <A, B> JsonReader<B> map(Hkt<Mu, A> jsonReaderHkt, Function1<A, B> fn) {
      JsonReader<A> jsonReader = jsonReaderHkt.coerce();
      return json -> fn.apply(jsonReader.read(json));
    }
  };

  static Builder<Mu> builder() {
    return Builder.of(CAN_BUILD);
  }

  A read(JsonNode json);
}
