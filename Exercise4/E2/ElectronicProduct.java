package Exercise4.E2;

import java.util.List;

public class ElectronicProduct extends Product{
    private List<String> components;

    public ElectronicProduct(String productId, String name, int quantity, List<String> components) {
        super(productId, name, quantity);
        this.components = components;
    }

    public ElectronicProduct() {

    }

    public List<String> getComponents() {
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }
}
