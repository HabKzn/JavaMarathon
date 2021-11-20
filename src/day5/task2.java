//        Создать класс Мотоцикл (англ. Motorbike ), с полями “Год выпуска”, “Цвет”,
//        “Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
//        использовать). Придерживаться принципов инкапсуляции и использовать ключевое
//        слово this . Геттером получить год выпуска, цвет, модель, вывести значения в
//        консоль.
package day5;

public class task2 {
    public static void main(String[] args) {
        Motorbike bike1 = new Motorbike(1965, "Red", "BMW");
        System.out.println("Год выпуска: " + bike1.getYear());
        System.out.println("Цвет: " + bike1.getColor());
        System.out.println("Модель: " + bike1.getModel());
    }


    static class Motorbike {
        private int year;
        private String color;
        private String model;

        Motorbike(int year, String color, String model) {
            this.year = year;
            this.color = color;
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public String getColor() {
            return color;
        }

        public String getModel() {
            return model;
        }
    }
}
