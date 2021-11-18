//      С клавиатуры вводится число n - размер массива. Необходимо создать массив
//        указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
//        содержимое массива в консоль, а также вывести в консоль информацию о:
//        а) Длине массива
//        б) Количестве чисел больше 8
//        в) Количестве чисел равных 1
//        г) Количестве четных чисел
//        д) Количестве нечетных чисел
//        е) Сумме всех элементов массива
//

package day4;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int moreThanEight = 0;
        int equalToOne = 0;
        int evenNumber = 0;
        int oddNumber = 0;
        int sum = 0;

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 10);
            if (array[i] > 8) moreThanEight++;
            if (array[i] == 1) equalToOne++;
            if (array[i] % 2 == 0) evenNumber++;
            if (array[i] % 2 != 0) oddNumber++;
            sum += array[i];
        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i]+" ");


        }
        System.out.println("");
        System.out.println("Длина массива: " + length);
        System.out.println("Количестве чисел больше 8: " + moreThanEight);
        System.out.println("Количестве чисел равных 1: " + equalToOne);
        System.out.println("Количестве четных чисел: " + evenNumber);
        System.out.println("Количестве нечетных чисел: " + oddNumber);
        System.out.println("Сумме всех элементов массива: " + sum);

    }
}
