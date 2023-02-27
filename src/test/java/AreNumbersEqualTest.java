import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    @Test

    public void testAreNumbersEqual_HappyPath() {
        ///AAA
        int expectedResult = 0;
        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(89,89);
        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test

    public void testAreNumbersEqualFirstNegative_HappyPath() {
        ///AAA
        int expectedResult = -1;
        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(-89,89);
        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test

    public void testAreNumbersEqualSecondNegative_HappyPath() {
        ///AAA
        int expectedResult = 1;
        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(89,-89);
        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test

    public void testAreNumbersEqualBothNegative_Negative() {
        ///AAA
        int expectedResult = 0;
        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(-89,-89);
        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }



















}







