public class Mmain {

    public static void main(String[] args) {

        ElectronicProduct elecProduct = new ElectronicProduct(1, "Phone", 10, 999.99);
        elecProduct.displayInformation();
        elecProduct.displayInformation();


        ClothingProduct clthProduct = new ClothingProduct(4, "T-shirt", 20, "Blue");
        clthProduct.displayInformation();
    }
}