import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

    @Test

    public void testArrayOfProductsInIntRange_HappyPath() {

        int[] array = null;
        int number = 3;
        int[] expectedResult = {};

        int[] actualResult = new ManipulationsWithArrays().multiplyArrayByNumber(array,number);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test

    public void testArrayCastToDoubleArray_HappyPath() {

        int[] array = {1, 2, 3, 4, 5};
        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};

        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test

    public void testIntArrayValueIsIntegerMinAndMaxCastToDoubleArray_HappyPath() {

        int[] array = {1, Integer.MIN_VALUE, 3, 4, Integer.MAX_VALUE};
        double[] expectedResult = {1.0, -2147483648.0, 3.0, 4.0, 2147483647.0};

        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test

    public void testCastToDoubleArrayValueToIntArray_HappyPath() {

        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test

    public void testCastToDoubleArrayValueInDoubleMinAndMaxRangeSCastToIntArray_HappyPath() {

        double[] array = {1.0, -Double.MAX_VALUE, 3.5, 4.2, Double.MAX_VALUE, Double.MIN_VALUE};
        int[] expectedResult = {1, Integer.MIN_VALUE, 3, 4, Integer.MAX_VALUE, 0};

        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test

    public void testCastIntArrayValuesToStringArray_HappyPath() {

        int[] array = {1, 2, 3, 4, 5};
        String[] expectedResult = {"1","2","3", "4","5"};

        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test

    public void testEveryElementIntArrayIsBiggerThanNumber_HappyPath() {

        int[] array = {24, 17, 20, 10, 6, 9, 25, 8};
        int number = 4;
        boolean expectedResult = true;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array,number);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testEveryElementIntArrayIsSmallerThanNumber_HappyPath() {

        int[] array = {24, 17, 20, 10, 6, 9, 25, 8};
        int number = 7;
        boolean expectedResult = false;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array,number);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSmallestElementsFromArrayIsEqualToNumber_Negative() {

        int[] array = {24, 17, 20, 10, 6, 9, 25, 8};
        int number = 6;
        boolean expectedResult = false;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array,number);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testArrayIsEmpty_Negative() {

        int[] array = {};
        int number = 3;
        boolean expectedResult = false;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array,number);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
