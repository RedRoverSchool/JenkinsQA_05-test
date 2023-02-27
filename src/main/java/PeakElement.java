import java.util.Arrays;

public class PeakElement {

//    public static void main(String[] args) {
//
//        System.out.println(Arrays.toString(peakElement(new int[]{3, 2, 7, 5, 1, 9, 23, 1})));
//    }

    public int[] peakElement(int[] num) {

        if (num.length > 1) {
            int count = 0;
            if (num[0] > num[1]) {
                count++;
            }
            for (int i = 1; i < num.length - 1; i++) {
                if (num[i] > num[i - 1] && num[i] > num[i + 1]) {
                    count++;
                }
            }
            if (num[(num.length - 1)] > num[(num.length - 2)]) {
                count++;
            }
            int[] result = new int[count];

            count = 0;
            if (num[0] > num[1]) {
                result[0] = num[0];
                count++;
            }
            for (int i = 1; i < num.length - 1; i++) {
                if (num[i] > num[i - 1] && num[i] > num[i + 1]) {
                    result[count] = num[i];
                    count++;
                }
            }
            if (num[(num.length - 1)] > num[(num.length - 2)]) {
                result[count] = num[(num.length - 1)];
            }
            return result;

        }

        return num;
    }

}





