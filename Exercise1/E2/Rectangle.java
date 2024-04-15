package Exercise1.E2;

public class Rectangle extends Shape{

    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return width * length;
    }

    @Override
    double calculatePerimeter() {
        return 2*width + 2*length;
    }
}
