package Inheritance_Polymorphism;

public class TestVehicles {

    public static void main(String args[]){
        Bicycle bicycle1 = new Bicycle();
        Bicycle bicycle2 = new Bicycle(7);

        bicycle1.displayInfo();
        bicycle2.displayInfo();

        bicycle1.applyBrakes();
        bicycle2.applyBrakes();
    }

}
