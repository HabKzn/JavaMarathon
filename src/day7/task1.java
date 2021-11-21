//        Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего
//        дня.
//        В классе Самолет создать статический метод compareAirplanes , который в
//        качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
//        сообщение в консоль о том, какой из самолетов длиннее.
package day7;

public class task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("AN", 1985, 2900, 780, 200);
        Airplane plane2 = new Airplane("SU", 2000, 3100, 1200, 340);
        Airplane.compareAirplane(plane1, plane2);

    }
}
