package day12;
//            Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
//        Вывести список.

import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 351; i++) {
            if (i % 2 == 0 && (i <= 30 || i >= 300)) {
                list.add(i);
            }

        }
        for (int k : list) {
            System.out.print(k + " ");
        }


    }
}
