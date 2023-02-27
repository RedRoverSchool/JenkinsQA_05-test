public class OddEven {

    public String createOddEven(int n) {

//        n = Integer.MAX_VALUE;
//        n = Integer.MIN_VALUE;

        if (n % 2 != 0) {
            return "Odd";
        }
        return "Even";
    }
}
