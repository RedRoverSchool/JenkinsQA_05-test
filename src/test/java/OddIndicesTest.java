import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class OddIndicesTest {

    @Test
    public void testOddIndices_HappyPath() {
        int[] array = new int[]{-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};
        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testOddIndicesWithArrayOfTwo_HappyPath() {
        int[] array = new int[]{-45, 590};
        int[] expectedResult = {590};
        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testOddIndicesEmpty_Negative() {
        int[] array = new int[]{};
        int[] expectedResult = {};
        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testOddIndicesNull_Negative() {
        int[] expectedResult = {};
        int[] actualResult = new OddIndices().oddIndices(null);

        Assert.assertEquals(actualResult,expectedResult);
    }
}



