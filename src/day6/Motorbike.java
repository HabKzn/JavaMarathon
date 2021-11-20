package day6;

class Motorbike {
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

