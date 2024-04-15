package Exercise1_2;

public class Test {

    public static void main(String[] args) {

            Circle circle = new Circle(5);
            System.out.println(circle.calculatePerimeter());
            System.out.println(circle.calculateArea());

            Triangle triangle = new Triangle(2,3,4);
            System.out.println(triangle.calculatePerimeter());
            System.out.println(triangle.calculateArea());

            Rectangle rectangle = new Rectangle(5,6);
            System.out.println(rectangle.calculatePerimeter());
            System.out.println(rectangle.calculateArea());
    }
}
