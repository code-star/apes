package nl.codestar.apes.core;

import nl.codestar.apes.core.function.Function2;
import nl.codestar.apes.core.hkt.OptionalHkt;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionalTests {
    @Test
    void combinesSomeStringAndSomeInteger() {
        var string = OptionalHkt.of("Powerlevel");
        var integer = OptionalHkt.of(9000);

        var expected = Optional.of("Powerlevel is over 9000");

        var toVerify = OptionalHkt.BUILDER.of(
                string,
                integer
        ).map(this::getDescription, OptionalHkt.FUNCTOR).pipe(OptionalHkt::coerce);

        assertEquals(expected, toVerify);
    }

    @Test
    void combinesSomeStringAndNoInteger() {
        var string = OptionalHkt.of("Powerlevel");
        var integer = OptionalHkt.<Integer>empty();

        var expected = Optional.empty();

        var toVerify = OptionalHkt.BUILDER.of(
                string,
                integer
        ).map(this::getDescription, OptionalHkt.FUNCTOR).pipe(OptionalHkt::coerce);

        assertEquals(expected, toVerify);
    }

    String getDescription(String quantity, Integer amount) {
        return String.format("%s is over %d", quantity, amount);
    }
}
