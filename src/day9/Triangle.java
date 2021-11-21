//task2
package day9;

public class Triangle extends Figure {
    double firstSide;
    double secondSide;
    double thirdSide;

    Triangle(double firstSide, double secondSide, double thirdSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double area() {
        double p = (firstSide + secondSide + thirdSide) / 2;
        return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }

    @Override
    public double perimeter() {
        return firstSide + secondSide + thirdSide;
    }
}
