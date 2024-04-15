package Inheritance_Polymorphism;

public class TestShapes {

    public static void main(String[] args) {
        Circle c = new Circle(2.3);
        Rectangle r = new Rectangle(5.3, 4.6);
        Triangle t = new Triangle(8, 4.1);

        //Circle methods
        c.calculateArea();
        c.calculatePerimeter();

        //Rectangle methods
        r.calculateArea();
        r.calculatePerimeter();

        //Triangle methods
        t.calculateArea();
        t.calculatePerimeter();
    }
}
