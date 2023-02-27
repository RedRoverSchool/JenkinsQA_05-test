import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SumArrayTest {

    @Test

    public void testStartSumArray_HappyPath() {
        ///AAA
//        int[] array = new int[]{0, 1, 2, 3, 4, 5};
        int expectedResult = 15;
        //act
        int actualResult = new SumArray().sumArray(new int[]{0, 1, 2, 3, 4, 5});
        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test

    public void testStartNegSumArray_HappyPath() {
        ///AAA
//        int[] array = new int[]{-7, -3};
        int expectedResult = -10;
        //act
        int actualResult = new SumArray().sumArray(new int[]{-7, -3});
        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test

    public void testStartSumArray_Negative() {
        ///AAA
        int[] array = null;
        int expectedResult = 0;
        //act
        int actualResult = new SumArray().sumArray(array);
        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
