package day9.Task2;

public class Circle extends Figure {
    private double circleRadius;

    public Circle(double circleRadius, String color) {
        super(color);
        this.circleRadius = circleRadius;
    }

    public double area() {
        return Math.PI * (circleRadius * circleRadius);
    }

    public double perimeter() {
        return Math.PI * 2.0 * circleRadius;
    }
}
