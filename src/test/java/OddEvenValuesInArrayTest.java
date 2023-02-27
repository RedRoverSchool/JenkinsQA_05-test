import org.testng.Assert;
import org.testng.annotations.Test;



public class OddEvenValuesInArrayTest {

    @Test

    public void testCountEvenNumbersInAnArray() {

        int [] array = {5, 67, 66, 45, 3, 8, 23, 40};

        Assert.assertEquals(new OddEvenValuesInArray().countEvenValuesInArray(array),3);
    }
    @Test
    public void testCountEvenNumbersWithZeroInAnArray() {

        int [] array = {5, 0, 66, 45, 3, 8, 0, 40};

        Assert.assertEquals(new OddEvenValuesInArray().countEvenValuesInArray(array),5);
    }

    @Test
    public void testCountEvenNumbersIncludingMinAndMaxIntValuesInAnArray() {

        int [] array = {5,Integer.MIN_VALUE, 66, 45, 3, 8, Integer.MAX_VALUE, 40};

        Assert.assertEquals(new OddEvenValuesInArray().countEvenValuesInArray(array),4);
    }
    @Test
    public void testCountEvenNumbersInEmptyArray_Negative() {

        int [] array = {};

        Assert.assertEquals(new OddEvenValuesInArray().countEvenValuesInArray(array),-1);
    }
    @Test
    public  void testCountOddNumbersInArray() {

        int[] array = {5, 67, 66, 45, 3, 8, 23, 40};

        Assert.assertEquals(new OddEvenValuesInArray().countOddValuesInArray(array),5 );

    }

    @Test
    public  void testCountOddNumbersWithZeroInArray() {

        int[] array = {5, 0, 66, 45, 3, 8, 0, 40};

        Assert.assertEquals(new OddEvenValuesInArray().countOddValuesInArray(array),3 );
    }

    @Test
    public  void testCountOddNumbersWithWithMinAndMaxIntValuesInArray() {

        int[] array = {5, Integer.MIN_VALUE, 66, 45, 3, 8, Integer.MAX_VALUE, 40};

        Assert.assertEquals(new OddEvenValuesInArray().countOddValuesInArray(array),4 );
    }

    @Test
    public  void testCountOddNumbersInEmptyArray_Negative() {

        int[] array = {};

        Assert.assertEquals(new OddEvenValuesInArray().countOddValuesInArray(array),-1);
    }




}






