import java.util.HashMap;
public class InventoryManager {
    HashMap<Integer, Product> inventory = new HashMap<>();
    public void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("Product added.");
    }
    public void updateProduct(int productId, int quantity, double price) {
        if (inventory.containsKey(productId)) {
            Product p = inventory.get(productId);
            p.quantity = quantity;
            p.price = price;
            System.out.println("Product updated.");
        } else {
            System.out.println("Product ID not found.");
        }
    }
    public void deleteProduct(int productId) {
        if (inventory.remove(productId) != null) {
            System.out.println("Product deleted.");
        } else {
            System.out.println("Product ID not found.");
        }
    }
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("\nCurrent Inventory:");
            for (Product p : inventory.values()) {
                System.out.printf("ID: %d, Name: %s, Quantity: %d, Price: %.2f\n",
                        p.productId, p.productName, p.quantity, p.price);
            }
        }
    }
}
