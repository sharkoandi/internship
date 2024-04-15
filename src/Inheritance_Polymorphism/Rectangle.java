package Inheritance_Polymorphism;

public class Rectangle extends Shape{

    private double height, width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of the rectangle is: " + (this.height*this.width) + " units^2");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of the rectangle is: " + (this.width*2 + this.height*2));
    }
}
