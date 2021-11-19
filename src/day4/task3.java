//          Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
//        матрицы задать m=12 , n=8 ( m - размерность по строкам, n - размерность по колонкам).
//        В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
//        строк несколько, вывести индекс последней из них.

package day4;

import org.w3c.dom.ls.LSOutput;

public class task3 {


    public static void main(String[] args) {
        int[][] array = new int[12][8];
        int maxSumOfString = 0;
        int stringOfMaxSum = 0;
        for (int i = 0; i < array.length; i++) {
            int sumOfThisString = 0;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 50);
                sumOfThisString += array[i][j];


            }
            if (maxSumOfString < sumOfThisString) {
                maxSumOfString = sumOfThisString;
                stringOfMaxSum = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            int sumOfThisString = 0;
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Максимальная сумма строки: " + maxSumOfString);
        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + stringOfMaxSum);
    }
}
