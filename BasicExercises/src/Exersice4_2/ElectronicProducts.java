package Exersice4_2;

public class ElectronicProducts extends Product{


    public String powerSource;

    public ElectronicProducts(int productId, String productName, int quantity, String powerSource) {
        super(productId, productName, quantity);
        this.powerSource = powerSource;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }
}
