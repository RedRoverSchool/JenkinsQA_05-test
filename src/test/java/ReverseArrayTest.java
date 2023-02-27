import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseArrayTest {

    @Test

    public void testReverseArray_HappyPath() {
//        ///AAA

        int[] array = new int[]{2, 7, 3, 10};

        int[] expectedResult = new int[]{10, 3, 7, 2};

////        //act
        int[] actualResult = new ReverseArray().reverseArray(array);

////        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test

    public void testReverseArray_Negative() {
//        ///AAA

        int[] array = new int[]{};

        int[] expectedResult = new int[]{};

////        //act
        int[] actualResult = new ReverseArray().reverseArray(array);

////        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

}
