package Exercise1.E1;

public class Demo {
    public static void main(String[] args) {

        Bicycle bicycle =  new Bicycle();
        Vehicle vehicle = bicycle;

        bicycle.displayInfo();
    }
}
