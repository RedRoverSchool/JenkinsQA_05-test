import project_utils.Utils;

public class KthLargest {

    public static int kthLargest (int[] array, int k) {

        if (k < array.length && k != 0) {

            return Utils.sortArray(array)[array.length -1 + 1 - k];
        } else {
            return 0;
        }
    }
}
