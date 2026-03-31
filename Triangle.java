
public class Triangle extends GeometricObject {

    public double side1;
    public double side2;
    public double side3;

    // No-arg constructor
    public Triangle() {
        side1 = side2 = side3 = 1.0;
    }

    // Constructor with sides
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Getters
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // Override abstract method: getArea
    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(
                s * (s - side1) * (s - side2) * (s - side3)
        );
    }

    // Override abstract method: getPerimeter
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1
                + ", side2 = " + side2
                + ", side3 = " + side3;
    }
}
