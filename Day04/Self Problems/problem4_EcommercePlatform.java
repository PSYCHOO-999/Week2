import java.util.ArrayList;

// Product Class
class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return name + " (Price: $" + price + ", Quantity: " + quantity + ")";
    }
}

// Order Class
class Order {
    private int orderId;
    private ArrayList<Product> products;
    private static int orderCounter = 1;

    // Constructor
    public Order() {
        this.orderId = orderCounter++;
        this.products = new ArrayList<>();
    }

    // Add Product to Order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Display Order Details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        if (products.isEmpty()) {
            System.out.println("No products in this order.");
        } else {
            System.out.println("Products:");
            double total = 0;
            for (Product product : products) {
                System.out.println(" - " + product);
                total += product.getTotalPrice();
            }
            System.out.println("Total Order Price: $" + total);
        }
    }
}

// Customer Class
class Customer {
    private String name;
    private ArrayList<Order> orders;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Place an Order
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed a new order (Order ID: " + (orders.size()) + ").");
    }

    // View Order History
    public void viewOrderHistory() {
        System.out.println("Order History for " + name + ":");
        if (orders.isEmpty()) {
            System.out.println("No orders placed.");
        } else {
            for (Order order : orders) {
                order.displayOrderDetails();
            }
        }
    }

    public String getName() {
        return name;
    }
}

// E-commerce Platform Class
class EcommercePlatform {
    private String name;
    private ArrayList<Customer> customers;

    // Constructor
    public EcommercePlatform(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Register a Customer
    public void registerCustomer(Customer customer) {
        customers.add(customer);
        System.out.println(customer.getName() + " has registered on " + name + ".");
    }

    // Display Platform Details
    public void displayPlatformDetails() {
        System.out.println("E-commerce Platform: " + name);
        System.out.println("Registered Customers:");
        if (customers.isEmpty()) {
            System.out.println("No customers registered.");
        } else {
            for (Customer customer : customers) {
                System.out.println(" - " + customer.getName());
            }
        }
    }
}

// Main Class
public class problem4_EcommercePlatform {
    public static void main(String[] args) {
        // Create E-commerce Platform
        EcommercePlatform platform = new EcommercePlatform("ShopEase");

        // Create Customers
        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        // Register Customers
        platform.registerCustomer(alice);
        platform.registerCustomer(bob);

        // Create Products
        Product phone = new Product("Smartphone", 699.99, 1);
        Product laptop = new Product("Laptop", 999.99, 1);
        Product headphones = new Product("Headphones", 49.99, 2);

        // Alice places an order
        Order aliceOrder1 = new Order();
        aliceOrder1.addProduct(phone);
        aliceOrder1.addProduct(headphones);
        alice.placeOrder(aliceOrder1);

        // Bob places an order
        Order bobOrder1 = new Order();
        bobOrder1.addProduct(laptop);
        bob.placeOrder(bobOrder1);

        // Alice places another order
        Order aliceOrder2 = new Order();
        aliceOrder2.addProduct(headphones);
        alice.placeOrder(aliceOrder2);

        // Display Platform Details
        platform.displayPlatformDetails();

        // View Customer Order History
        alice.viewOrderHistory();
        bob.viewOrderHistory();
    }
}
