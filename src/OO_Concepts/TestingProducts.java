package OO_Concepts;

import java.time.LocalDate;
import java.util.UUID;

public class TestingProducts {

    public static void main(String[] args) {
        //Product Object
        Product unknown_product = new Product();
        Product product = new Product(UUID.randomUUID(), "Test Product", 100);

        System.out.println(unknown_product.toString());
        System.out.println(product.toString());

        //Electronic Products
        ElectronicProduct unknown_electronic = new ElectronicProduct();
        ElectronicProduct product1 = new ElectronicProduct(UUID.randomUUID(), "Test Product", 100, "TestBrand", "1.1", LocalDate.now());

        System.out.println(unknown_product.toString());
        unknown_electronic.start();
        unknown_electronic.stop();

        System.out.println(product1.toString());
        product1.start();
        product1.stop();

        //ClothingProduct
        ClothingProduct unknown_cloth = new ClothingProduct();
        ClothingProduct product2 = new ClothingProduct(UUID.randomUUID(), "TestClothing", 50, 'M', "Test Brand", "Summer");

        System.out.println(unknown_cloth.toString());
        System.out.println(product2.toString());

    }
}
