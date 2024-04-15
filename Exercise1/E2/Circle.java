package Exercise1.E2;

public class Circle extends Shape{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    double calculatePerimeter() {
        return 2*Math.PI * radius;
    }
}
