package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest(name = "source={0}")
    @CsvSource({ "xxggxx", "xxggxxggxx", "gg" })
    public void gHappy1_true(String source) {

        boolean result = new GHappy().gHappy(source);

        Assertions.assertTrue(result);
    }

    @ParameterizedTest(name = "source={0}")
    @CsvSource({ "xxx", "xxgxx", "xxggxxgx", "xxggxxgxx" })
    public void gHappy_false(String source) {

        boolean result = new GHappy().gHappy(source);

        Assertions.assertFalse(result);
    }
}
