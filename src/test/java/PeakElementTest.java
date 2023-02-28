import org.testng.Assert;
import org.testng.annotations.Test;

public class PeakElementTest {

    @Test
    public void testPeakElement_HappyPath() {
        int[] expectedResult = new int[]{3, 7, 23};
        int[] actualResult = new PeakElement().peakElement(new int[]{3, 2, 7, 5, 1, 9, 23, 1});

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPeakElementSomeNegative_HappyPath() {
        int[] array = new int[]{3, 2, -7, 5, 1, 9, 1, 23};
        int[] expectedResult = new int[]{3,5,9,23};
        int[] actualResult = new PeakElement().peakElement(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPeakElementEmpty_Negative() {
        int[] expectedResult = new int[]{};
        int[] actualResult = new PeakElement().peakElement(new int[]{});

        Assert.assertEquals(actualResult, expectedResult);
    }
}
