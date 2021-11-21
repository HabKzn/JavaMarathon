//        task2
//        Скопируйте класс Самолет из задания дня 6.
//        Внесите изменения в класс таким образом, чтобы следующий код выводил
//        информацию о самолете, аналогично вызову метода info() .
//        Airplane airplane = new Airplane ( "Boeing" , 2000 , 150 , 10000 );
//        System. out . println (airplane);
package day8;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public int getFuel() {
        return fuel;
    }

    Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;

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
    public String toString(){
        return ("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + getFuel());
    }
}
