import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfTwoTest {

    @Test(groups = {"Regression"})

    public void testSumOfTwo_HappyPath() {
        int sum = 12;
        int[]array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[][] expectedResult = {{3, 9}, {7, 5}};
        int[][] actualResult = new SumOfTwo().sumOfTwo(array,sum);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test(groups = {"Smoke"})
    public void testSumOfTwoThereIsNoPairThatIsEqualToTheSum_HappyPath() {
        int sum = 1;
        int[]array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[][] expectedResult = {};
        int[][] actualResult = new SumOfTwo().sumOfTwo(array,sum);

        Assert.assertEquals(actualResult,expectedResult);
    }


    @Test(groups = {"Regression"})
    public void testSumOfTwoEmptyArray_Negative() {
        int sum = 12;
        int[]array = {};
        int[][] expectedResult = {};
        int[][] actualResult = new SumOfTwo().sumOfTwo(array,sum);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
