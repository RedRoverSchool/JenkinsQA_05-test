import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    @Test

    public void testStartNegOddNumber_HappyPath() {
        ///AAA
        int n = -345;
        String expectedResult = "Odd";

        //act
        String actualResult = new OddEven().createOddEven(n);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test
    public void testStartNullEvenNumber_HappyPath() {
        ///AAA
        int n = 0;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().createOddEven(n);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testStartEvenNumber_HappyPath() {
        ///AAA
        int n = 222222;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().createOddEven(n);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test

    public void testStartOddNumber_PositivePath() {
        ///AAA
        int n = Integer.MAX_VALUE;
        String expectedResult = "Odd";

        //act
        String actualResult = new OddEven().createOddEven(n);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
    @Test

    public void testStartEvenNumber1_HappyPath() {
        ///AAA
        int n = Integer.MIN_VALUE -1;
        String expectedResult = "Odd";

        //act
        String actualResult = new OddEven().createOddEven(n);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }










}
