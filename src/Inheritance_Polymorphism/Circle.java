package Inheritance_Polymorphism;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * radius * Math.PI;

        System.out.println("The perimeter of the circle is: " + perimeter + " units");

    }

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle is: " + area + " units^2.");

    }
}
