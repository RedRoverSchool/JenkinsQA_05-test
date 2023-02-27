import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {

    @Test
    public void RemoveSpaceTest1() {

        String s  = " Red Rover School ";

        String expectedResult = "Лишние пробелы удалены";

        String actualResult = new StringMethods().removeSpaces(s);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void RemoveSpaceTest2() {

        String s  = "Red Rover School";

        String expectedResult = "Пробелов не было";

        String actualResult = new StringMethods().removeSpaces(s);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void RemoveSpaceTest3() {

        String s  = "";

        String expectedResult = "Строка пустая";

        String actualResult = new StringMethods().removeSpaces(s);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void RemoveAllAsTest1() {

        String text  = " Red Rover School ";

        String expectedResult = "Red Rover School";

        String actualResult = new StringMethods().removeAllAs(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void RemoveAllAsTest2() {

        String text  = "panda ";

        String expectedResult = "pnd";

        String actualResult = new StringMethods().removeAllAs(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void RemoveAllAsTest3() {

        String text  = "taramasalata";

        String expectedResult = "trmslt";

        String actualResult = new StringMethods().removeAllAs(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void RemoveAllAllZerosTest1() {

        String text  = "3504209706040000";

        String expectedResult = "35429764";

        String actualResult = new StringMethods().removeAllZeros(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void RemoveAllAllZerosTest2() {

        String text  = "0000000111";

        String expectedResult = "111";

        String actualResult = new StringMethods().removeAllZeros(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void RemoveAllSpacesTest1() {

        String text  = " R e d Ro ve r Sc h ool ";

        String expectedResult = "RedRoverSchool";

        String actualResult = new StringMethods().removeAllSpaces(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void RemoveAllSpacesTest2() {

        String text  = "p a n d a ";

        String expectedResult = "panda";

        String actualResult = new StringMethods().removeAllSpaces(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void CountAsTest1() {

        String text  = "Abracadabra";

        String expectedResult = "5, 6";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void CountAsTest2() {

        String text  = "Homenum Revelio";

        String expectedResult = "0, 15";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void CountAsTest3() {

        String text  = "3 tarAmasAlatA";

        String expectedResult = "6, 8";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void CountJavaTest1() {

        String text  = "As of March 2022, Java 18 is the latest version, while Java 17," +
                " 11 and 8 are the current long-term support (LTS) versions." +
                " Oracle released the last zero-cost public update for the legacy version" +
                " Java 8 LTS in January 2019 for\n" +
                "commercial use, although it will otherwise still support Java 8 " +
                "with public updates for personal use indefinitely." +
                " Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 " +
                "that are still receiving security and other upgrades.";

        boolean expectedResult = true;

        boolean actualResult = new StringMethods().countJava(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void CountJavaTest2() {
        String text  = "99 little bugs in a code.\n" +
                "99 little bugs in a code.\n" +
                "Take one down, and patch it around. 235 critical bugs in the code.";

        boolean expectedResult = false;

        boolean actualResult = new StringMethods().countJava(text);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void IsSameFirstLastLetterIndexOfTest1() {
        String word  = "Abracadabra";

        boolean expectedResult = true;

        boolean actualResult = new StringMethods().isSameFirstLastLetterIndexOf(word);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void IsSameFirstLastLetterIndexOfTest2() {
        String word  = "Whippersnapper";

        boolean expectedResult = false;

        boolean actualResult = new StringMethods().isSameFirstLastLetterIndexOf(word);

        Assert.assertEquals(actualResult,expectedResult);
    }




}
