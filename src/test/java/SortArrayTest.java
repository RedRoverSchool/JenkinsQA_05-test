import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {

    @Test

    public void testSortArray_HappyPath() {
//        ///AAA

        int[] expectedResult = new int[]{2, 3, 4, 4, 5, 7, 9, 12, 12};

////        //act
        int[] actualResult = new SortArray().sortArray(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12});

////        //Assert
        Assert.assertEquals(actualResult, expectedResult);


    }

    @Test

    public void testSortArray_Negative() {
//        ///AAA

        int[] expectedResult = new int[]{};

////        //act
        int[] actualResult = new SortArray().sortArray(new int[]{});

////        //Assert
        Assert.assertEquals(actualResult, expectedResult);


    }
}
