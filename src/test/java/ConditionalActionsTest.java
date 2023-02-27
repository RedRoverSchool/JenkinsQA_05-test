import org.testng.Assert;
import org.testng.annotations.Test;

public class ConditionalActionsTest {

    @Test

    public void testMultipleOf9And7_HappyPath() {
        ///AAA

        int m = 0;

       String expectedResult = "Good Number" ;

        //act
       String actualResult = new ConditionalActions().conditionalActions(63);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test

    public void testMultipleOf9_HappyPath() {
        ///AAA

        int m = 90;

        String expectedResult = "Bad Number" ;

        //act
        String actualResult = new ConditionalActions().conditionalActions(90);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }


    @Test

    public void testMultipleOf11_HappyPath() {
        ///AAA

        int m = 11;

        String expectedResult = "Poor Number" ;

        //act
        String actualResult = new ConditionalActions().conditionalActions(11);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test

    public void testNotSatisfyWithAnyConditions_HappyPath() {
        ///AAA

        int m = -1;

        String expectedResult = "-1" ;

        //act
        String actualResult = new ConditionalActions().conditionalActions(-1);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }





}
