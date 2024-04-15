package Inheritance_Polymorphism;

public class Triangle extends Shape{

    private double height, width, hypotenuse;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
        calculateHypotenuse();
    }

    private void calculateHypotenuse(){
        this.hypotenuse = Math.sqrt(height*height + width*width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        calculateHypotenuse();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        calculateHypotenuse();
    }

    @Override
    public void calculateArea(){
        double area = (this.height * this.width)/2;

        System.out.println("The area of the triangle is: " + area + " units^2.");
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = height + width + hypotenuse;
        System.out.println("The perimeter of the triangle is: " + perimeter + " units.");
    }
}
