import org.testng.Assert;
import org.testng.annotations.Test;

public class KthLargestTest {

    @Test

    public void testPositiveNumEqual_HappyPath() {

        int[] a = {4, 3, 7, 13, 12, 2, 9, 4, 12};
        int b = 3;
        int expectedResult = 12;

        int actualResult = KthLargest.kthLargest(a, b);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
