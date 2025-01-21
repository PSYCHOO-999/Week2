public class Level2_Problem5 {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CartItem("Apple", 0.99, 3));
        cart.addItem(new CartItem("Banana", 0.59, 5));
        cart.displayTotalCost();
        cart.removeItem("Apple");
        cart.displayTotalCost();
    }
}

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }
}

class ShoppingCart {
    private CartItem[] items;
    private int itemCount;

    public ShoppingCart() {
        items = new CartItem[10]; // Initial capacity of 10 items
        itemCount = 0;
    }

    public void addItem(CartItem item) {
        if (itemCount == items.length) {
            // Resize the array if it's full
            CartItem[] newItems = new CartItem[items.length * 2];
            System.arraycopy(items, 0, newItems, 0, items.length);
            items = newItems;
        }
        items[itemCount++] = item;
    }

    public void removeItem(String itemName) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getItemName().equals(itemName)) {
                // Shift items to the left to fill the gap
                for (int j = i; j < itemCount - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[--itemCount] = null; // Nullify the last item
                break;
            }
        }
    }

    public void displayTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += items[i].getTotalCost();
        }
        System.out.println("Total Cost: $" + totalCost);
    }
}
