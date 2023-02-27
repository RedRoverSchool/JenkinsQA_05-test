import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeOnTheRightTest {

    @Test

    public void testEmptyArray_HappyPath() {

        int[] array = {};

        int[] expectedResult = {};

        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test

    public void testNegativeOnTheRight_HappyPath() {

        int[] inputArray = {4, -3, 7, -12, 5, -2, 9, 4, 12};

        int[] expectedResult = {4, 7, 5, 9, 4, 12, -2, -12, -3};

        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(inputArray);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test

    public void testShortArray_HappyPath() {

        int[] inputArray = {1};

        int[] expectedResult = {1};

        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(inputArray);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test

    public void testNegativeOnTheRightPositiveArray_HappyPath() {

        int[] inputArray = {3, 2, 7, 5, 1, 9, 23, 1, 2};

        int[] expectedResult = {3, 2, 7, 5, 1, 9, 23, 1, 2};

        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(inputArray);

        Assert.assertEquals(actualResult,expectedResult);
    }


}
