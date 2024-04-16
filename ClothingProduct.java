public class ClothingProduct extends Product {

        private String color;

        public ClothingProduct(int productId, String name, int quantity, String color) {
            super(productId, name, quantity);
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        @Override
        public void displayInformation() {
            super.displayInformation();
            System.out.println("Color: " + color);
        }

}
