//          task1
//        Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего
//        дня.
//        В классе Самолет создать статический метод compareAirplanes , который в
//        качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
//        сообщение в консоль о том, какой из самолетов длиннее.

package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public int getFuel() {
        return fuel;
    }

    Airplane(String producer, int year, int length, int weight, int fuel) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }

    void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + getFuel());
    }

    void fillUp(int liters) {
        this.fuel += liters;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public static void compareAirplane(Airplane airplane1, Airplane airplane2) {
        if (airplane1.length > airplane2.length) System.out.println("Первый самолет длиннее");
        if (airplane1.length < airplane2.length) System.out.println("Второй самолет длиннее");
        if (airplane1.length == airplane2.length) System.out.println("Самолеты одинаковые по длинне");
    }

}
