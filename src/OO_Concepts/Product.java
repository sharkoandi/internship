package OO_Concepts;

import java.util.UUID;

public class Product {

    private UUID uuid;
    private String name;
    private int quantity;

    public Product() {
        this.uuid = UUID.randomUUID();
        this.name = "Unknown";
        this.quantity = 0;
    }

    public Product(UUID uuid, String name, int quantity) {
        this.uuid = uuid;
        this.name = name;
        this.quantity = quantity;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

}
