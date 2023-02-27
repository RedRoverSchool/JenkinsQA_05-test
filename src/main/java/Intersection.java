import java.util.Arrays;

public class Intersection {
//        public static void main(String[] args) {
//
//        System.out.println(Arrays.toString(findIntersection(new int[]{1, 2, 4, 5, 89},new int[]{8, 9, 4, 2})));
//    }


    public  int[] Intersection(int[] a, int[] b) {

//        array1 = new int[]{1, 2, 4, 5, 89};
//        array2 = new int[]{8, 9, 4, 2};
//        array3 = new int[] {2,4};

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j]) {
                    a[j] = -2147483648;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] == b[j]) {

                }
            }
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[j] == a[i] && a[i] != -2147483648 && b[j] != -2147483648) {
                    count++;
                    break;
                }
            }
        }
        if (count == 0) {

            return new int[]{};
        } else {
            int[] result = new int[count];
            count = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (b[j] == a[i] && a[i] != -2147483648 && b[j] != -2147483648) {
                        result[count] = a[i];
                        count++;
                        break;
                    }

                }

            }
            return result;
        }
    }
















}















