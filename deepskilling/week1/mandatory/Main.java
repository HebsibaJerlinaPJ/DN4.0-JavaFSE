public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(103, "Shoes", "Footwear"),
            new Product(101, "Laptop", "Electronics"),
            new Product(105, "Watch", "Accessories"),
            new Product(102, "Phone", "Electronics"),
            new Product(104, "Bag", "Travel")
        };

        int targetId = 104;

        // Linear Search
        Product foundLinear = SearchUtils.linearSearch(products, targetId);
        System.out.println("Linear Search Result: " + (foundLinear != null ? foundLinear : "Not Found"));

        // Sort before Binary Search
        SearchUtils.sortProductsById(products);
        Product foundBinary = SearchUtils.binarySearch(products, targetId);
        System.out.println("Binary Search Result: " + (foundBinary != null ? foundBinary : "Not Found"));
    }
}
