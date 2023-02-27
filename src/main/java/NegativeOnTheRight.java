public class NegativeOnTheRight {

    public int[] negativeOnTheRight (int[] inputArray) {

        int length = inputArray.length;
        int[] outputArray = new int[length];

        for (int i = 0, j = length -1, k = 0; i < length; i++) {
            if (inputArray[i] >= 0) {
                outputArray[k] = inputArray[i];
                k++;
            } else {
               outputArray[j] = inputArray[i];
                j--;
            }
        }
        return outputArray;
    }
}
