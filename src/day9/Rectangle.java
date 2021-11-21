//task2
package day9;

public class Rectangle extends Figure {
    double height;
    double width;

    Rectangle(double height, double width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return 2 * height + 2 * width;
    }
}
