public class ReverseArray {

    public int[] reverseArray(int[] array){

        int[] array1 = new int[array.length];//{2, 7, 3, 10} → {10, 0,0,0}

        for (int i = 0; i < array.length; i++) {

            array1[i] = array[array.length - 1 - i]; // 10 номер послед индекса
        }
        return array1;
    }

}
