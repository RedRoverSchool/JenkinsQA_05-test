import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SumArrayTest {

    @Test
    public void testStartSumArray_HappyPath() {
        int expectedResult = 15;
        int actualResult = new SumArray().sumArray(new int[]{0, 1, 2, 3, 4, 5});

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testStartNegSumArray_HappyPath() {
        int expectedResult = -10;
        int actualResult = new SumArray().sumArray(new int[]{-7, -3});

        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testStartSumArray_Negative() {
        int[] array = null;
        int expectedResult = 0;
        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
