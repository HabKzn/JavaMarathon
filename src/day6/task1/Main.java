//        Для этого задания скопируйте классы Автомобиль и Мотоцикл из предыдущего дня
//        в пакет текущего дня.
//        В классах Автомобиль и Мотоцикл реализовать два метода:
//        info () - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
//        yearDifference () - принимает на вход число (год), и возвращает разницу между
//        переданным годом и годом выпуска транспортного средства

package day6.task1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.info();
        System.out.println(Math.abs(car1.yearDifference(2005)));

        Motorbike bike1 = new Motorbike(1965, "Blue", "Ducatti");
        bike1.info();
        System.out.println(Math.abs(bike1.yearDifference(2012)));
    }
}
