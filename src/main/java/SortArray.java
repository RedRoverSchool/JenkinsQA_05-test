import java.util.Arrays;

public class SortArray {

    public int[] sortArray(int[] array) {

        // {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}

        if (array.length > 0) {

            for (int j = 0; ; ) {

                while (true) {
                    int temp;
                    int count = 0;
                    for (int i = 0; i < array.length - 1; i++) {
                        if (array[i] > array[i + 1]) {
                            temp = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = temp;
                            count++;
                        }
                    }

                    if (count == 0) {
                        break;
                    }
                }
                return array;
            }
        }
        return new int[]{};
    }
}
