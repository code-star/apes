package nl.codestar.apes.json.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import nl.codestar.apes.core.canbuild.Builder;
import nl.codestar.apes.core.canbuild.CanBuild;
import nl.codestar.apes.core.function.Function1;
import nl.codestar.apes.core.hkt.Hkt;
import nl.codestar.apes.core.tuple.Cons;
import nl.codestar.apes.core.typeclass.Contravariant;

@FunctionalInterface
public interface JsonObjectWriter<A> extends Hkt<JsonObjectWriter.Mu, A> {

  interface Mu {
  }

  CanBuild<Mu> CAN_BUILD = new CanBuild<>() {
    @Override
    public <A, B> JsonObjectWriter<Cons<A, B>> combine(Hkt<Mu, A> leftHkt, Hkt<Mu, B> rightHkt) {
      JsonObjectWriter<A> left = leftHkt.coerce();
      JsonObjectWriter<B> right = rightHkt.coerce();
      return (objectNode, value) -> {
        left.write(objectNode, value.getFirst());
        right.write(objectNode, value.getSecond());
      };
    }
  };

  Contravariant<Mu> CONTRAVARIANT = new Contravariant<>() {
    @Override
    public <A, B> JsonObjectWriter<B> contramap(Hkt<Mu, A> jsonObjectWriterHkt, Function1<B, A> fn) {
      JsonObjectWriter<A> jsonObjectWriter = jsonObjectWriterHkt.coerce();
      return (objectNode, value) -> {
        jsonObjectWriter.write(objectNode, fn.apply(value));
      };
    }
  };

  static Builder<Mu> builder() {
    return Builder.of(CAN_BUILD);
  }


  ObjectMapper OBJECT_MAPPER = new ObjectMapper();

  void write(ObjectNode objectNode, A value);

  default JsonWriter<A> asWriter() {
    return value -> {
      ObjectNode objectNode = OBJECT_MAPPER.createObjectNode();
      write(objectNode, value);
      return objectNode;
    };
  }
}
