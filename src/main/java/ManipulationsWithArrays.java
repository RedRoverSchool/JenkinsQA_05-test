public class ManipulationsWithArrays {

    /*/
      5. Написать метод multiplуArrayByNumber(), который принимает на вход массив целых чисел и число int number. Метод возвращает массив тех же
    чисел, умноженных на number
    Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
     */
    public int[] multiplyArrayByNumber(int[] array, int number) {

        if(array == null) {
            return new int[0];
        }

        int[] arrayOfProducts = new int[array.length];

        if (number == 0) {
            return arrayOfProducts;
        }
        if (array.length == 0) {
            return new int[0];
        }


        for (int i = 0; i < array.length ; i++) {
            int product = array[i] * number;
            if(product / number == array[i]) {
                arrayOfProducts[i] = product;
            } else {
                return new int[0];
            }
        }
        return arrayOfProducts;
    }

    /*/
     6. Написать метод toDoubleArray(), который принимает на вход массив целых чисел,
    и возвращает массив типа double[] из тех же чисел
    a. Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}
     */

    public double[] toDoubleArray (int[] array) {

        double[] arrayDouble = new double [array.length];

        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                arrayDouble[i] = array[i];
            }
        } else {
            return new double[0];

        }
        return arrayDouble;
    }

    /*/
    7. Написать метод toIntArray(), который принимает на вход массив типа
       double[], и возвращает массив типа int[] из тех же чисел
       Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}
     */

    public int[] toIntArray(double[] array) {

        int[] arrayInt = new int[array.length];

        if(array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                arrayInt[i] = (int) array[i];
            }
        } else {

            return new int[0];
        }
        return arrayInt;
    }

    /*/
    8. Написать метод toStringArray(), который принимает на вход массив целых
       чисел, и возвращает массив типа String[] из тех же чисел (желательно не
       использовать метод .toString(), нужно переводить вручную)
       Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}
     */
    public String[] toStringArray(int[] array) {

        String[] arrayString = new String[array.length];

        if (array.length == 0) {
            return new String[0];
        }
        for (int i = 0; i < array.length; i++) {
            arrayString[i] = "" + array[i];
        }

        return arrayString;
    }
    /*/
     12.В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(),
     который принимает на вход массив целых чисел и число number.
     Метод возвращает значение true, если все элементы массива больше number, иначе возвращает false
     */
    public boolean areValuesGreaterThanNumber(int[] array, int number) {

        if (array.length == 0) {
            return false;
        }
        int countOfBiggerElements = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                countOfBiggerElements ++;
            }
        }
        return countOfBiggerElements == array.length;
    }






}
