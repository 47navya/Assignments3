import java.util.*;

class Product {
    String name;
    double price;
    String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Price: $" + price + ", Category: " + category;
    }
}


class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.price, p2.price);
    }
}

public class ECommerce {
    public static void main(String[] args) {
        
        TreeMap<Product, String> productCatalog = new TreeMap<>(new PriceComparator());
        productCatalog.put(new Product("Laptop", 1200, "Electronics"), "Available");
        productCatalog.put(new Product("Phone", 800, "Electronics"), "Available");
        productCatalog.put(new Product("Shoes", 100, "Fashion"), "Available");

        System.out.println("Sorted Product Catalog:");
        for (Map.Entry<Product, String> entry : productCatalog.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        
        Set<String> categories = new HashSet<>();
        for (Product product : productCatalog.keySet()) {
            categories.add(product.category);
        }

        System.out.println("\nUnique Product Categories:");
        for (String category : categories) {
            System.out.println(category);
        }
    }
}

