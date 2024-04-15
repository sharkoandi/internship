package Exercise1.E1;

public class Bicycle extends Vehicle {

    public Bicycle(){

    }

    public Bicycle(String identificationNumber) {
        super(identificationNumber);
    }

    public void ringBell(){
        System.out.println("Ring ring!");
    }

    @Override
    void start() {
        System.out.println("Riding the bicycle ...");
    }

    @Override
    void applyBrakes() {
        System.out.println("Applying brakes on the bicycle ...");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "[Bicycle: " +
                "\n identificationNumber: '" + getIdentificationNumber() + '\'' +
                "\n numberOfGears: '" + getNumberOfGears() + '\'' +
                ']';
    }
}
