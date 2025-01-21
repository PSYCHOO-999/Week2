public class day03_problem4 {

    static class Product {
        private static double discount = 10.0; // Shared discount percentage for all products
        private static int productCounter = 0; // Counter to generate unique product IDs

        private final int productID; // Unique identifier for each product
        private String productName;
        private double price;
        private int quantity;

        // Constructor
        public Product(String productName, double price, int quantity) {
            this.productID = ++productCounter; // Assign unique ID using counter
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        // Static method to update discount percentage
        public static void updateDiscount(double newDiscount) {
            discount = newDiscount;
        }

        // Static method to display the current discount
        public static void displayDiscount() {
            System.out.println("Current Discount: " + discount + "%");
        }

        // Method to calculate and display the price after discount
        public void displayPriceAfterDiscount() {
            if (this instanceof Product) { // Using 'instanceof' to validate object type
                double totalPrice = price * quantity;
                double discountedPrice = totalPrice - (totalPrice * discount / 100);
                System.out.println("Product ID: " + productID);
                System.out.println("Product Name: " + productName);
                System.out.println("Quantity: " + quantity);
                System.out.println("Original Price: $" + totalPrice);
                System.out.println("Price After " + discount + "% Discount: $" + discountedPrice);
            } else {
                System.out.println("Invalid product object.");
            }
        }
    }

    public static void main(String[] args) {
        // Creating Product objects
        Product product1 = new Product("Laptop", 1000.0, 2);
        Product product2 = new Product("Smartphone", 700.0, 3);

        System.out.println("--- Discount Details ---");
        Product.displayDiscount();

        System.out.println("\n--- Product Details with Discount ---");
        product1.displayPriceAfterDiscount();
        product2.displayPriceAfterDiscount();

        // Updating discount percentage
        double newDiscount = 15.0;
        Product.updateDiscount(newDiscount);

        System.out.println("\n--- Updated Discount Details ---");
        Product.displayDiscount();

        System.out.println("\n--- Product Details with Updated Discount ---");
        product1.displayPriceAfterDiscount();
        product2.displayPriceAfterDiscount();
    }
}
