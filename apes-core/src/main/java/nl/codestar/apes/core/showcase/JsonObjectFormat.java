package nl.codestar.apes.core.showcase;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import nl.codestar.apes.core.canbuild.Builder;
import nl.codestar.apes.core.canbuild.CanBuild;
import nl.codestar.apes.core.function.Function1;
import nl.codestar.apes.core.hkt.Hkt;
import nl.codestar.apes.core.tuple.Cons;
import nl.codestar.apes.core.typeclass.Invariant;

public interface JsonObjectFormat<A> extends Hkt<JsonObjectFormat.Mu, A> {

  // Create a `JsonObjectFormat` from a reader and a writer.
  static <A> JsonObjectFormat<A> from(JsonReader<A> reader, JsonObjectWriter<A> writer) {
    return new JsonObjectFormat<>() {
      @Override
      public void write(ObjectNode objectNode, A value) {
        writer.write(objectNode, value);
      }

      @Override
      public A read(JsonNode json) {
        return reader.read(json);
      }
    };
  }

  interface Mu {
  }

  CanBuild<Mu> CAN_BUILD = new CanBuild<Mu>() {
    @Override
    public <A, B> JsonObjectFormat<Cons<A, B>> combine(Hkt<Mu, A> leftHkt, Hkt<Mu, B> rightHkt) {
      JsonObjectFormat<A> left = leftHkt.coerce();
      JsonReader<A> leftReader = left::read;
      JsonObjectWriter<A> leftWriter = left::write;

      JsonObjectFormat<B> right = rightHkt.coerce();
      JsonReader<B> rightReader = right::read;
      JsonObjectWriter<B> rightWriter = right::write;
      JsonReader<Cons<A, B>> reader = JsonReader.CAN_BUILD.combine(leftReader, rightReader).coerce();
      JsonObjectWriter<Cons<A, B>> writer = JsonObjectWriter.CAN_BUILD.combine(leftWriter, rightWriter).coerce();
      return from(reader, writer);
    }
  };

  Invariant<Mu> INVARIANT = new Invariant<Mu>() {
    @Override
    public <A, B> JsonObjectFormat<B> inmap(Hkt<Mu, A> jsonObjectFormatHkt, Function1<A, B> fn, Function1<B, A> gn) {
      JsonObjectFormat<A> jsonObjectFormat = jsonObjectFormatHkt.coerce();
      JsonReader<A> reader = jsonObjectFormat::read;
      JsonObjectWriter<A> writer = jsonObjectFormat::write;
      return from(
          JsonReader.FUNCTOR.map(reader, fn).coerce(),
          JsonObjectWriter.CONTRAVARIANT.contramap(writer, gn).coerce()
      );
    }
  };

  static Builder<Mu> builder() {
    return Builder.of(CAN_BUILD);
  }

  default JsonObjectWriter<A> asObjectWriter() {
    return this::write;
  }

  default JsonWriter<A> asWriter() {
    return asObjectWriter().asWriter();
  }

  default JsonReader<A> asReader() {
    return this::read;
  }

  default JsonFormat<A> asFormat() {
    return JsonFormat.from(asReader(), asWriter());
  }

  void write(ObjectNode objectNode, A value);

  default JsonNode write(A value) {
    return asWriter().write(value);
  }

  A read(JsonNode json);
}
