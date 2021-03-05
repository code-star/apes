package nl.codestar.apes.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import nl.codestar.apes.core.tuple.Tuple;

import static nl.codestar.apes.json.jackson.JsonFormat.*;
import static nl.codestar.apes.json.jackson.Key.key;

public class App {

  public static class Record {
    private final String name;
    private final int age;
    private final boolean isAwesome;

    public Record(String name, int age, boolean isAwesome) {
      this.name = name;
      this.age = age;
      this.isAwesome = isAwesome;
    }

    public String getName() {
      return name;
    }

    public int getAge() {
      return age;
    }

    public boolean isAwesome() {
      return isAwesome;
    }

    @Override
    public String toString() {
      return "Record{" +
          "name='" + name + '\'' +
          ", age=" + age +
          ", isAwesome=" + isAwesome +
          '}';
    }
  }

  public static void main(String[] args) throws JsonProcessingException {

    JsonObjectFormat<Record> format = JsonObjectFormat.builder().of(
        key("name").with(STRING_FORMAT),
        key("age").with(INT_FORMAT),
        key("isAwesome").with(BOOLEAN_FORMAT)
    ).inmap(
        Record::new,
        Tuple.by(Record::getName, Record::getAge, Record::isAwesome),
        JsonObjectFormat.INVARIANT
    ).coerce();

    String json = "{ \"name\": \"Jack\", \"age\": 25, \"isAwesome\": true }";
    var jsonValue = new ObjectMapper().readTree(json);
    var jack = format.read(jsonValue);

    System.out.println(jack);
    System.out.println(format.write(jack));
  }
}
