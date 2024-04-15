package Exercise4.E2;

import java.util.Objects;

public class Product {
    private String productId;
    private String name;
    private int quantity;

    public Product(String productId, String name, int quantity) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
    }

    public Product() {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return quantity == product.quantity && Objects.equals(productId, product.productId) && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, name, quantity);
    }

    @Override
    public String toString() {
        return "Product : \n" +
                "productId : '" + productId + '\'' +
                "\n, name : '" + name + '\'' +
                "\n, quantity : " + quantity +
                '}';
    }
}
