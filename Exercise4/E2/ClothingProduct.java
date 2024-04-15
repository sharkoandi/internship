package Exercise4.E2;

public class ClothingProduct extends Product{
    private Size size;

    public ClothingProduct(String productId, String name, int quantity, Size size) {
        super(productId, name, quantity);
        this.size = size;
    }

    public ClothingProduct() {
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
