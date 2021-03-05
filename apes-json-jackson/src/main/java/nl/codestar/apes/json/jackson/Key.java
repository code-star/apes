package nl.codestar.apes.json.jackson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Key {
  public final String key;

  public Key(String key) {
    this.key = key;
  }

  public static Key key(String key) {
    return new Key(key);
  }

  public <A> JsonReader<A> readWith(JsonReader<A> reader) {
    return json -> reader.read(json.get(key));
  }

  public <A> JsonObjectWriter<A> writeWith(JsonWriter<A> writer) {
    return (objectNode, value) -> objectNode.set(key, writer.write(value));
  }

  public <A> JsonObjectFormat<A> with(JsonFormat<A> format) {
    return new JsonObjectFormat<A>() {
      @Override
      public void write(ObjectNode objectNode, A value) {
        objectNode.set(key, format.write(value));
      }

      @Override
      public A read(JsonNode json) {
        return format.read(json.get(key));
      }
    };
  }
}
