//      Создать новый массив размера 100 и заполнить его случайными числами из
//        диапазона от 0 до 10000.
//        Затем, используя циклы for each вывести:
//        - наибольший элемент массива
//        - наименьший элемент массива
//        - количество элементов массива, оканчивающихся на 0
//        - сумму элементов массива, оканчивающихся на 0
//        Использовать сортировку запрещено.

package day4;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        System.out.println(Arrays.toString(array));

        int min = array[0];
        int max = array[0];
        int quantityOfZeroAtEnd = 0;
        int sumOfZeroAtEnd = 0;

        for (int a : array) {
            if (a < min) min = a;
            if (a > max) max = a;
            if (a % 10 == 0) {
                quantityOfZeroAtEnd++;
                sumOfZeroAtEnd += a;
            }


        }
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + quantityOfZeroAtEnd);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sumOfZeroAtEnd);
    }
}
