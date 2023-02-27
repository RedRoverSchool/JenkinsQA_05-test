import org.testng.Assert;
import org.testng.annotations.Test;

public class PeakElementTest {

    @Test

 public void testPeakElement_HappyPath() {
//        ///AAA

      int[] array = new int[]{3, 2, 7, 5, 1, 9, 23, 1};

      int[] expectedResult = new int[]{3, 7, 23};

////        //act
     int[] actualResult = new PeakElement().peakElement(new int[]{3, 2, 7, 5, 1, 9, 23, 1});

////        //Assert
      Assert.assertEquals(actualResult, expectedResult);


   }

    @Test

    public void testPeakElementSomeNegative_HappyPath() {
//        ///AAA

        int[] array = new int[]{3, 2, -7, 5, 1, 9, 1, 23};

        int[] expectedResult = new int[]{3,5,9,23};

////        //act
        int[] actualResult = new PeakElement().peakElement(array);

////        //Assert
        Assert.assertEquals(actualResult, expectedResult);


    }

    @Test

    public void testPeakElementEmpty_Negative() {
//        ///AAA

        int[] array = new int[]{};

        int[] expectedResult = new int[]{};

////        //act
        int[] actualResult = new PeakElement().peakElement(new int[]{});

////        //Assert
        Assert.assertEquals(actualResult, expectedResult);


    }

}
