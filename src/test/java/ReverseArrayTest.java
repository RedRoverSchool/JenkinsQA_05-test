import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseArrayTest {

    @Test
    public void testReverseArray_HappyPath() {
        int[] array = new int[]{2, 7, 3, 10};
        int[] expectedResult = new int[]{10, 3, 7, 2};
        int[] actualResult = new ReverseArray().reverseArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testReverseArray_Negative() {
        int[] array = new int[]{};
        int[] expectedResult = new int[]{};
        int[] actualResult = new ReverseArray().reverseArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
