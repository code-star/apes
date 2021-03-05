package nl.wernerdegroot.functional.syntax.showcase;

import com.fasterxml.jackson.databind.JsonNode;

public interface JsonFormat<A> {

  JsonFormat<String> STRING_FORMAT = from(JsonReader.STRING_READER, JsonWriter.STRING_WRITER);
  JsonFormat<Integer> INT_FORMAT = from(JsonReader.INT_READER, JsonWriter.INT_WRITER);
  JsonFormat<Boolean> BOOLEAN_FORMAT = from(JsonReader.BOOLEAN_READER, JsonWriter.BOOLEAN_WRITER);

  static <A> JsonFormat<A> from(JsonReader<A> reader, JsonWriter<A> writer) {
    return new JsonFormat<>() {
      @Override
      public JsonNode write(A value) {
        return writer.write(value);
      }

      @Override
      public A read(JsonNode json) {
        return reader.read(json);
      }
    };
  }

  JsonNode write(A value);

  A read(JsonNode json);
}
