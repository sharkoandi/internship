package Exercise1;

import java.util.Scanner;

public class VehicleBicycleTest {

    public static void main(String[] args) {

        Vehichle vehichle = new Vehichle();
        vehichle.applyBreaks();
        vehichle.numberOfGears();
        vehichle.displayInfo();

        Bicycle bicycle=new Bicycle();
        bicycle.applyBreaks();
        bicycle.numberOfGears();
        bicycle.displayInfo();

        Vehichle vehichle1=new Bicycle(7,true);
        vehichle1.displayInfo();
        vehichle1.numberOfGears();
        vehichle1.applyBreaks();
    }
}
