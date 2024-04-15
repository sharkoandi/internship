package Inheritance_Polymorphism;

public class Bicycle extends Vehicle{

    private int numberOfGears = 5;

    public Bicycle() {
    }

    public Bicycle(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public void applyBrakes(){
        System.out.println("Trying to brake");

        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Fully stopped!");
    }

    @Override
    public void displayInfo(){
        System.out.println("This is a bicycle with: " + getNumberOfGears() + " gears!");
    }


}
