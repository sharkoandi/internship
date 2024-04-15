package OO_Concepts;

import java.util.UUID;

public class ClothingProduct extends  Product{

    private char size;
    private String brand, seasonUsed;

    public ClothingProduct() {
        super();
        this.size = 'X';
        this.brand = "None";
        this.seasonUsed = "None";
    }

    public ClothingProduct(UUID uuid, String name, int quantity, char size, String brand, String seasonUsed) {
        super(uuid, name, quantity);
        this.size = size;
        this.brand = brand;
        this.seasonUsed = seasonUsed;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeasonUsed() {
        return seasonUsed;
    }

    public void setSeasonUsed(String seasonUsed) {
        this.seasonUsed = seasonUsed;
    }

    @Override
    public String toString() {
        return "ClothingProduct{" +
                "UUID: " + getUuid() + '\'' +
                "Name: " + getName() + '\'' +
                "Quantity: " + getQuantity() + '\'' +
                "size=" + size +
                ", brand='" + brand + '\'' +
                ", seasonUsed='" + seasonUsed + '\'' +
                '}';
    }

}
