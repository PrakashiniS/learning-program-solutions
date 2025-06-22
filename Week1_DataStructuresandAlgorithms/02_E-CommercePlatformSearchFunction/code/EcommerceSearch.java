import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
class Product {
    int productId;
    String productName;
    String category;
    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
    @Override
    public String toString() {
        return productId + " - " + productName + " - " + category;
    }
}
public class EcommerceSearch {
    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, String name) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }
    public static void displayArray(String title, Product[] array) {
        System.out.println("\n" + title);
        for (Product p : array) {
            System.out.println(p);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        Product[] products = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1));
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Category: ");
            String category = sc.nextLine();
            products[i] = new Product(id, name, category);
        }
        displayArray("Original Array (for Linear Search):", products);
        System.out.print("\nEnter product name to search: ");
        String searchName = sc.nextLine();
        Product linearResult = linearSearch(products, searchName);
        System.out.println("\nLinear Search Result: " + (linearResult != null ? linearResult : "Product not found"));
        Product[] sortedProducts = products.clone();
        Arrays.sort(sortedProducts, Comparator.comparing(p -> p.productName.toLowerCase()));
        displayArray("Sorted Array (for Binary Search):", sortedProducts);
        Product binaryResult = binarySearch(sortedProducts, searchName);
        System.out.println("Binary Search Result: " + (binaryResult != null ? binaryResult : "Product not found"));
        sc.close();
    }
}