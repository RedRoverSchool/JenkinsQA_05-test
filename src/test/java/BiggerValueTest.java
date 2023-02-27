import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    @Test
    public void testBiggerValue_HappyPath() {
        ///AAA

        int num1 = 3333;
        int num2 = 9999;
        int expectedResult = 9999;
        //act
        int actualResult = new BiggerValue().biggerValue(num1,num2);
        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testBiggerValueNegativeNumber_HappyPath() {
        ///AAA

        int num1 = 3333;
        int num2 = 9999;
        int expectedResult = 9999;
        //act
        int actualResult = new BiggerValue().biggerValue(num1,num2);
        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}


