package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    public void mirrorEnds1() {
        String source = "abXYZba";
        String expectedResult = "ab";

        String result = new Mirror().mirrorEnds(source);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void mirrorEnds2() {
        String source = "abca";
        String expectedResult = "a";

        String result = new Mirror().mirrorEnds(source);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void mirrorEnds3() {
        String source = "aba";
        String expectedResult = "aba";

        String result = new Mirror().mirrorEnds(source);

        Assertions.assertEquals(expectedResult, result);
    }
}
