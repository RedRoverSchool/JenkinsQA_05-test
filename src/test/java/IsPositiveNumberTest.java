import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    @Test

    public void testIsPositiveNumber_HappyPath() {
        ///AAA

        int num = 555;


        boolean expectedResult = true;

        //act

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(num);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
