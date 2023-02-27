public class SumArray {

    public int sumArray(int[] array) {

//        array[] = {0, 1, 2, 3, 4, 5};

        if (array != null) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return (sum);
        }
        return 0;
    }
}
