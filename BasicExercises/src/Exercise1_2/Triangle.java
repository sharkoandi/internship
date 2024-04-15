package Exercise1_2;

public class Triangle extends Shape{

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double p=calculatePerimeter();
        double product = p * (p-a) * (p-b)* (p-c);
        return Math.sqrt(product) ;
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }
}
