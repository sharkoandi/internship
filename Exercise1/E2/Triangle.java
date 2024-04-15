package Exercise1.E2;

public class Triangle extends Shape{

    int base;
    int height;

    int aLeft;
    int bRight;

    @Override
    double calculateArea() {
        return base*height/2;
    }

    @Override
    double calculatePerimeter() {
        return aLeft+bRight+base;
    }
}
