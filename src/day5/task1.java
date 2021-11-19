//        Создать класс Автомобиль (англ. Car ), с полями “Год выпуска”, “Цвет”, “Модель”.
//        Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
//        задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
//        Созданный вами класс должен отвечать принципам инкапсуляции.

package day5;


public class task1 {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(1942);
        car1.setColor("black");
        car1.setModel("Ford");
        System.out.println("Цвет: " + car1.getColor());
        System.out.println("Год: " + car1.getYear());
        System.out.println("Модель: " + car1.getModel());
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
    }
}
