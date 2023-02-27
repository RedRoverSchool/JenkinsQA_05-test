import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class OddIndicesTest {

    @Test
    public void testOddIndices_HappyPath() {
        ///AAA
        int[] array = new int[]{-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};
        //act
        int[] actualResult = new OddIndices().oddIndices(array);
        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }
    @Test
    public void testOddIndicesWithArrayOfTwo_HappyPath() {
        ///AAA
        int[] array = new int[]{-45, 590};
        int[] expectedResult = {590};
        //act
        int[] actualResult = new OddIndices().oddIndices(array);
        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }
    @Test
    public void testOddIndicesEmpty_Negative() {
        ///AAA
        int[] array = new int[]{};
        int[] expectedResult = {};
        //act
        int[] actualResult = new OddIndices().oddIndices(array);
        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testOddIndicesNull_Negative() {
        ///AAA
        int[] array = null;
        int[] expectedResult = {};
        //act
        int[] actualResult = new OddIndices().oddIndices(null);
        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}



