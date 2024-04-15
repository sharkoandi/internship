package OO_Concepts;

import java.time.LocalDate;
import java.util.UUID;

public class ElectronicProduct extends Product{

    private String brand, version;
    private LocalDate released;
    private boolean started = false;

    public ElectronicProduct() {
        super();
        this.brand = "None";
        this.version = "x";
    }

    public ElectronicProduct(UUID uuid, String name, int quantity, String brand, String version, LocalDate released) {
        super(uuid, name, quantity);
        this.brand = brand;
        this.version = version;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "ElectronicProduct{" +
                "UUID: " + getUuid() + '\'' +
                "Name: " + getName() + '\'' +
                "Quantity: " + getQuantity() + '\'' +
                "brand='" + brand + '\'' +
                ", version='" + version + '\'' +
                ", released=" + released +
                '}';
    }

    public void start(){
        if(this.getName().equals("Unknown")){
            System.out.println("Product unspecified");
            return;
        }

        if(this.started){
            System.out.println(this.getName() + " already is working");
            return;
        }

        this.started = true;
        System.out.println(this.getName() + " started.");
        System.out.println(this.getName() + " doing stuff.");
    }

    public void stop(){
        if(started){
            System.out.println(this.getName() + " preparing to close.");
            System.out.println(this.getName() + " closed.");
            this.started = false;
            return;
        }

        System.out.println("Already stopped...");

    }
}
