package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    private CaesarShiftCipher caesarShiftCipher;

    @BeforeEach
    public void initialize() {
        this.caesarShiftCipher = new CaesarShiftCipher();
    }

    @Test
    public void EmptyInputZeroShift_ReturnsEmtpyString(){

        String result = this.caesarShiftCipher.CaesarShiftCipher("", 0);

        Assertions.assertEquals("", result);
    }

    @ParameterizedTest(name = "source={0}")
    @CsvSource({ "foo", "foo bar" })
    public void ZeroShiftReturnsSource(String source){

        String result = this.caesarShiftCipher.CaesarShiftCipher(source, 0);

        Assertions.assertEquals(source, result);
    }

    @ParameterizedTest(name = "source={0}")
    @CsvSource({ "FOO", "foo?bar" })
    public void InvalidSource(String source){

        String result = this.caesarShiftCipher.CaesarShiftCipher(source, 0);

        Assertions.assertEquals("invalid", result);
    }

    @ParameterizedTest(name = "source={0}, shift={1}, expectedResult={2}")
    @CsvSource({ "aaa, 1, bbb", "aaa, 3, ddd", "aaa, 26, aaa", "xyz, 3, abc" })
    public void ShiftIsPositive(String source, int shift, String expectedResult){

        String result = this.caesarShiftCipher.CaesarShiftCipher(source, shift);

        Assertions.assertEquals(expectedResult, result);
    }


    @ParameterizedTest(name = "source={0}, shift={1}, expectedResult={2}")
    @CsvSource({ "aaa, -1, zzz", "aaa, -3, xxx", "aaa, -26, aaa", "abc, -3, xyz" })
    public void ShiftIsNegative(String source, int shift, String expectedResult){

        String result = this.caesarShiftCipher.CaesarShiftCipher(source, shift);

        Assertions.assertEquals(expectedResult, result);
    }
}
