class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0; // Class variable

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total products whenever a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName + ", Price: $" + price);
    }

    // Class method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

class Lv01_Problem01_ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200.50);
        Product product2 = new Product("Smartphone", 699.99);

        product1.displayProductDetails();
        product2.displayProductDetails();

        Product.displayTotalProducts(); // Class method
    }
}
