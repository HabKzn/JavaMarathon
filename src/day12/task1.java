package day12;
//          Создать список строк, добавить в него 5 марок автомобилей, вывести список в
//        консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль
//        из списка. Распечатать список.

import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        List<String> auto = new ArrayList<>();
        auto.add("Lada");
        auto.add("Audi");
        auto.add("Volkswagen");
        auto.add("Mersedes");
        auto.add("Porsche");

        for (int i = 0; i < auto.size(); i++) {
            System.out.print(auto.get(i)+" ");
        }

        auto.add(3, "BMW");
        System.out.println();

        for (int i = 0; i < auto.size(); i++) {
            System.out.print(auto.get(i)+" ");
        }
        auto.remove(0);

        System.out.println();

        for (int i = 0; i < auto.size(); i++) {
            System.out.print(auto.get(i)+" ");
        }

    }
}
