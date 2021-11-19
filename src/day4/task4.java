//        Создать новый массив размера 100 и заполнить его случайными числами из
//        диапазона от 0 до 10000.
//        Найти максимум среди сумм трех соседних элементов. Для найденной тройки с
//        максимальной суммой выведите значение суммы и индекс первого элемента тройки.

package day4;

public class task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);

        }

        int maxSumOfThree = 0;
        int indexOfFirst = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int currentSum = array[i] + array[i + 1] + array[i + 2];
            if (currentSum > maxSumOfThree) {
                maxSumOfThree = currentSum;
                indexOfFirst = i;
            }

        }
        System.out.println();
        System.out.println("Максимальное значение суммы трех элементов: " + maxSumOfThree);
        System.out.println("Индекс первого элемента максимальной тройки: " + indexOfFirst);
    }
}
