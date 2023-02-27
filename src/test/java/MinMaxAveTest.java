import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    @Test

    public void testMinMaxAveTest_HappyPath() {
        ///AAA
        int[] array = new int[]{1,2,3,4,5,6,7,8};
        int a = 2;
        int b = 6;
        int [] expectedResult = {3,7,5};

        //act
        int[] actualResult = new MinMaxAve().minMaxAve(array, a, b);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test

    public void testMinMaxAveNegativeInt_Negative() {
        ///AAA
        int[] array = new int[]{1,2,3,4,5,6,7,8};
        int a = -2;
        int b = 6;
        int [] expectedResult = {};

        //act
        int[] actualResult = new MinMaxAve().minMaxAve(array, a, b);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test

    public void testMinMaxAveArrOfTwo_HappyPath() {
        ///AAA
        int[] array = new int[]{1,-6};
        int a = 1;
        int b = 0;
        int [] expectedResult = {-6, 1, -2};

        //act
        int[] actualResult = new MinMaxAve().minMaxAve(array, a, b);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test

    public void testMinMaxAveArrOfOne_HappyPath() {
        ///AAA
        int[] array = new int[]{2};
        int a = 0;
        int b = 0;
        int [] expectedResult = {2, 2, 2};

        //act
        int[] actualResult = new MinMaxAve().minMaxAve(array, a, b);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test

    public void testMinMaxAveEquals_HappyPath() {
        ///AAA
        int[] array = new int[]{1,2,3,4,5,6,7,8};
        int a = 2;
        int b = 2;
        int [] expectedResult = {3, 3, 3};

        //act
        int[] actualResult = new MinMaxAve().minMaxAve(array, a, b);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }
    @Test

    public void testMinMaxEmptyArray_HappyPath() {
        ///AAA
        int[] array = new int[]{};
        int a = 0;
        int b = 0;
        int [] expectedResult = {};

        //act
        int[] actualResult = new MinMaxAve().minMaxAve(array, a, b);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }
}
