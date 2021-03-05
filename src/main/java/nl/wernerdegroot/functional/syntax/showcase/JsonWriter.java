package nl.wernerdegroot.functional.syntax.showcase;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.TextNode;
import nl.wernerdegroot.functional.syntax.hkt.Hkt;

@FunctionalInterface
public interface JsonWriter<A> extends Hkt<JsonWriter.Mu, A> {

  interface Mu { }

  JsonWriter<String> STRING_WRITER = TextNode::new;
  JsonWriter<Integer> INT_WRITER = IntNode::new;
  JsonWriter<Boolean> BOOLEAN_WRITER = value -> value ? BooleanNode.TRUE : BooleanNode.FALSE;

  JsonNode write(A value);
}
