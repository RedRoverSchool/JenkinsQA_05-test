public class MinMaxAve {

    public int[] minMaxAve(int[] array, int a, int b) {
//        int[] array = new int[]{1,2,3,4,5,6,7,8};

//        int sum = 0;
//        int max = array[indexStart];

//        if (indexStart <= indexEnd) {
//            for (int i = indexStart; i < indexEnd + 1; i++) {
//                if (max < array[i]) {
//                    max = array[i];
//                }
//                sum += array[i];
//            }
//            int average = sum / (indexEnd - indexStart + 1);
//
//            int min = array[indexStart];
//
//            for (int i = indexStart; i < indexEnd + 1; i++) {
//                if (min > array[i]) {
//                    min = array[i];
//                }
//            }
//            int[] array1 = {min, max, average};
//            return (array1);
//        }

        if (a >= 0 && a < array.length && b >= 0 && b < array.length) {

            if (a > b) {
                int n;
                n = a ; a = b; b = n;
            }

            int average = 0, numbers = 0, min = array[a], max = array[a];
            for (int i = a; i <= b; i++, numbers++) {
                average += array[i];

                if (array[i] < min) {
                    min = array[i];
                } else {
                    max = array[i];
                }
            }
            average = Math.round(average/numbers);

            return new int[]{min, max,average};
        }
        else{
            return new int[]{};
        }
    }
}
