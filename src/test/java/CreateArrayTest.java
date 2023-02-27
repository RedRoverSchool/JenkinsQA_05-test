import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {

    //1.Positive test
    //1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}

    @Test
    public void testCreateArrayFromFiveIntNumbers_HappyPath() {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = new CreateArray().createIntArray(a, b, c, d, e);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test

    //2.Positive test
    //(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
    public void testCreateArrayFromFiveDoubleNumbers_HappyPath() {

        double a = 1.1;
        double b = 2.5;
        double c = 3.7;
        double d = 4.0;
        double e = 5.5;
        double[] expectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};

        double[] actualResult = new CreateArray().createDoubleArray(a, b, c, d, e);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //3.createStringArray(“It”, “was”, “an”, “apple”, “pie”)
    // -> {“It”, “was”, “an”, “apple”, “pie”}

    public void testCreateStringArray_HappyPath() {

        String a = "It";
        String b = "was";
        String c = "an";
        String d = "apple";
        String e = "pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        String[] actualResult = new CreateArray().createStringArray(a, b, c, d, e);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //4.createArrayFromText(“It was an apple pie”)
    // -> {“It”, “was”, “an”, “apple”, “pie”}

    public void testCreateArrayFromText_HappyPath() {

        String sentence = "It was an apple pie";

        String[] expectedResult = {"It","was","an","apple","pie"};

        String[] actualResult = new CreateArray().createArrayFromText(sentence);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
