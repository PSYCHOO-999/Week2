public class Level1_Problem4 {
    public static void main(String[] args) {
        Item item = new Item("A123", "Laptop", 750.00);
        item.displayItemDetails();
        int quantity = 5;
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total cost for " + quantity + " items: $" + totalCost);
    }
}

class Item {
    private String itemCode;
    private String itemName;
    private double price;

    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}