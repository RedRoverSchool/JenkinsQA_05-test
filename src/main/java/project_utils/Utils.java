package project_utils;

import java.util.Arrays;

public class Utils {


    /*/
    Универсальный метод для построения последовательности,
    которая начинается с числа start, заканчивается числом end (оба включительно)
     */

    public static String genericMethodForConstructingSequence(int start, int end, int step) {
        if (step < 0) {
            step = step * -1;
        }
        if (start < end && (end - start) > step && step > 0) {              // Возрастающая
            int a = 0;
            for (int i = start; i <= end; i++) {                 // Находим шаг
                if (i % step == 0) {
                    a = i;
                    break;
                }
            }
            String sequence = "";
            for (int i = a; i <= end; i += step) {               // Выводим числа
                sequence = sequence + (i + " ");

            }
            return sequence;

        } else if (start > end && (start - end) > step && step > 0) {       // Убывающая
            int a = 0;
            for (int i = start; i >= end; i--) {    // Находим шаг
                if (i % step == 0) {
                    a = i;
                    break;
                }
            }
            String sequence = "";

            for (int i = a; i >= end; i -= step) {               // Выводим числа
                sequence = sequence + (i + " ");
            }
            return sequence;

        } else {
            return ("Ощибка!");
        }
    }


    /*/
    Написать метод, который создает и печатает массив четных положительных чисел,
    значения которых не больше k. Заполняем значения и печатаем с помощью цикла for.
     Длина массива - l.

     */

    public static String printArrayOfEvenNum(int l, int k) {

        int[] evenArray = new int[l];
        if (l > 0) {
            for (int i = 0; i < l;) {
                int number = (int) (Math.random() * (k) + 0);
                if (number % 2 == 0) {
                    evenArray[i] = number;
                    i++;
                }
            }
            return (Arrays.toString(evenArray));
        }

        return null;
    }

    public void printAverageOfArray(int[]array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("среднее значение всех элементов массива - " + sum / array.length);
    }


    public static int[] sortArray(int[] array) { /// метод пузырька Филина

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
















