package Exercise1_2;

public class Circle extends Shape{

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*r;
    }
}
