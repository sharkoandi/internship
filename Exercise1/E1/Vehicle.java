package Exercise1.E1;

import java.util.Objects;

public abstract class Vehicle {
    private String identificationNumber;
    private int numberOfGears;

    public Vehicle() {
    }

    public Vehicle(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    abstract void start();
    abstract void applyBrakes();

    void displayInfo(){
        System.out.println(toString());
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return numberOfGears == vehicle.numberOfGears && Objects.equals(identificationNumber, vehicle.identificationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificationNumber, numberOfGears);
    }

    @Override
    public String toString() {
        return "[Vehicle: " +
                "\n identificationNumber: '" + identificationNumber + '\'' +
                "\n numberOfGears: '" + numberOfGears + '\'' +
                ']';
    }
}
