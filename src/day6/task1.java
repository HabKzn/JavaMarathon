//        Для этого задания скопируйте классы Автомобиль и Мотоцикл из предыдущего дня
//        в пакет текущего дня.
//        В классах Автомобиль и Мотоцикл реализовать два метода:
//        info () - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
//        yearDifference () - принимает на вход число (год), и возвращает разницу между
//        переданным годом и годом выпуска транспортного средства

package day6;

public class task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.info();
        System.out.println(Math.abs(car1.yearDifference(2005)));

        Motorbike bike1 = new Motorbike(1965, "Blue", "Ducatti");
        bike1.info();
        System.out.println(Math.abs(bike1.yearDifference(2012)));
    }

    public static class Car {
        private int year;
        private String color;
        private String model;

        public void setYear(int year) {
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getModel() {
            return model;
        }

        public void info() {
            System.out.println("Это автомобиль");

        }

        public int yearDifference(int year) {
            return this.year - year;
        }
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

        public void info() {
            System.out.println("Это мотоцикл");

        }
        public int yearDifference(int year){
            return this.year-year;
        }
    }


}
