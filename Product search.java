import java.util.*;

public class ProductSearch {
    private static List<String> products = Arrays.asList(
            "Laptop", "Smartphone", "Headphones", "Tablet", "Monitor", "Keyboard", "Mouse"
    );

    public static void searchProduct(String query) {
        boolean found = false;
        System.out.println("Search results for: " + query);
        for (String product : products) {
            if (product.toLowerCase().contains(query.toLowerCase())) {
                System.out.println("- " + product);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products found matching: " + query);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String query = scanner.nextLine();
        searchProduct(query);
    }
}
