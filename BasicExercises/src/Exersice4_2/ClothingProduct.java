package Exersice4_2;

public class ClothingProduct extends Product {

    public String brand;

    public ClothingProduct(int productId, String productName, int quantity, String brand) {
        super(productId, productName, quantity);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
