public class ElectronicProduct extends Product{

        private double price;

        public ElectronicProduct(int productId, String name, int quantity, double price) {
            super(productId, name, quantity);
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public void displayInformation() {
            super.displayInformation();
            System.out.println("Price: $" + price);
        }
    }


