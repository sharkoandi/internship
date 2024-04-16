public class Product {

        private int productId;
        private String name;
        private int quantity;

        public Product(int productId, String name, int quantity) {
            this.productId = productId;
            this.name = name;
            this.quantity = quantity;
        }

        public int getProductId() {
            return productId;
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void displayInformation() {
            System.out.println("Product ID: " + productId);
            System.out.println("Name: " + name);
            System.out.println("Quantity: " + quantity);
        }
    }


