package day2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество этажей дома");
        int floor = sc.nextInt();
        if (floor>0 && floor<5 ) System.out.println("Малоэтажный дом");
        else if (floor>4 && floor<9) System.out.println("Среднеэтажный дом");
        else if (floor>8) System.out.println("Многоэтажный дом");
        else if (floor<1) System.out.println("Ошибка ввода");
    }
}
