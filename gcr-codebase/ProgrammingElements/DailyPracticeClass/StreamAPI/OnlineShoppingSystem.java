package ProgrammingElements.DailyPracticeClass.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

abstract class Person {
    private int id;
    private String name;
    private String email;

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "ID=" + id + ", Name=" + name + ", Email=" + email;
    }
}


class Customer extends Person {
    private String city;
    private boolean primeMember;

    public Customer(int id, String name, String email, String city, boolean primeMember) {
        super(id, name, email);
        this.city = city;
        this.primeMember = primeMember;
    }

    public String getCity() {
        return city;
    }

    public boolean isPrimeMember() {
        return primeMember;
    }

    @Override
    public String toString() {
        return super.toString() + ", City=" + city + ", Prime=" + primeMember;
    }
}

class Seller extends Person {
    private String companyName;
    private double sellerRating;

    public Seller(int id, String name, String email, String companyName, double sellerRating) {
        super(id, name, email);
        this.companyName = companyName;
        this.sellerRating = sellerRating;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getSellerRating() {
        return sellerRating;
    }

    @Override
    public String toString() {
        return super.toString() + ", Company=" + companyName + ", Rating=" + sellerRating;
    }
}

class Product {
    private int productId;
    private String productName;
    private String category;
    private double price;
    private double rating;
    private boolean inStock;
    private Seller seller;

    public Product(int productId, String productName, String category,
                   double price, double rating, boolean inStock, Seller seller) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.rating = rating;
        this.inStock = inStock;
        this.seller = seller;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public boolean isInStock() {
        return inStock;
    }

    public Seller getSeller() {
        return seller;
    }

    @Override
    public String toString() {
        return productId + " " + productName + " " + category +
                " $" + price + " Rating=" + rating +
                " InStock=" + inStock +
                " Seller=" + seller.getName();
    }
}

public class OnlineShoppingSystem {

    public static void main(String[] args) {

        // Sellers
        ArrayList<Seller> sellers = new ArrayList<>();

        Seller s1 = new Seller(1, "Raj", "raj@gmail.com", "TechWorld", 4.8);
        Seller s2 = new Seller(2, "Amit", "amit@gmail.com", "HomeStore", 4.3);
        Seller s3 = new Seller(3, "Neha", "neha@gmail.com", "FashionHub", 4.9);

        sellers.add(s1);
        sellers.add(s2);
        sellers.add(s3);

        // Customers
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer(101, "Rohan", "rohan@gmail.com", "Delhi", true));
        customers.add(new Customer(102, "Priya", "priya@gmail.com", "Mumbai", false));
        customers.add(new Customer(103, "Karan", "karan@gmail.com", "Pune", true));
        customers.add(new Customer(104, "Anjali", "anjali@gmail.com", "Chennai", false));

        // Products
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", "Electronics", 75000, 4.8, true, s1));
        products.add(new Product(2, "Mobile", "Electronics", 25000, 4.6, true, s1));
        products.add(new Product(3, "TV", "Electronics", 55000, 4.7, false, s1));
        products.add(new Product(4, "Sofa", "Furniture", 30000, 4.4, true, s2));
        products.add(new Product(5, "Table", "Furniture", 7000, 4.2, true, s2));
        products.add(new Product(6, "Shirt", "Clothing", 1500, 4.5, false, s3));
        products.add(new Product(7, "Jeans", "Clothing", 2500, 4.9, true, s3));
        products.add(new Product(8, "Watch", "Accessories", 5000, 4.8, true, s3));


        System.out.println("1. Product Names");
        products.stream()
                .map(Product::getProductName)
                .forEach(System.out::println);

        System.out.println("\n2. Products In Stock");
        products.stream()
                .filter(Product::isInStock)
                .forEach(System.out::println);

        System.out.println("\n3. Products Costing More Than 1000");
        products.stream()
                .filter(p -> p.getPrice() > 1000)
                .forEach(System.out::println);

        System.out.println("\n4. Prime Customers");
        customers.stream()
                .filter(Customer::isPrimeMember)
                .forEach(System.out::println);

        System.out.println("\n5. Sellers Rating Above 4.5");
        sellers.stream()
                .filter(s -> s.getSellerRating() > 4.5)
                .forEach(System.out::println);

        System.out.println("\n6. Products Sorted By Price");
        products.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .forEach(System.out::println);

        System.out.println("\n7. Sellers Sorted By Rating Descending");
        sellers.stream()
                .sorted(Comparator.comparing(Seller::getSellerRating).reversed())
                .forEach(System.out::println);

        System.out.println("\n8. Unique Categories");
        products.stream()
                .map(Product::getCategory)
                .distinct()
                .forEach(System.out::println);

        System.out.println("\n9. Count In Stock");
        System.out.println(products.stream()
                .filter(Product::isInStock)
                .count());

        System.out.println("\n10. Costliest Product");
        System.out.println(products.stream()
                .max(Comparator.comparing(Product::getPrice))
                .get());

        System.out.println("\nCheapest Product");
        System.out.println(products.stream()
                .min(Comparator.comparing(Product::getPrice))
                .get());

        System.out.println("\n11. Average Price");
        System.out.println(products.stream()
                .collect(Collectors.averagingDouble(Product::getPrice)));

        System.out.println("\n12. Total Product Value");
        System.out.println(products.stream()
                .map(Product::getPrice)
                .reduce(0.0, Double::sum));

        System.out.println("\n13. All Products In Stock?");
        System.out.println(products.stream()
                .allMatch(Product::isInStock));

        System.out.println("\n14. Any Customer From Delhi?");
        System.out.println(customers.stream()
                .anyMatch(c -> c.getCity().equalsIgnoreCase("Delhi")));

        System.out.println("\n15. First Prime Customer");
        customers.stream()
                .filter(Customer::isPrimeMember)
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("\n16. Top 3 Highest Rated Products");
        products.stream()
                .sorted(Comparator.comparing(Product::getRating).reversed())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("\n17. Group Products By Category");
        Map<String, List<Product>> categoryMap =
                products.stream()
                        .collect(Collectors.groupingBy(Product::getCategory));
        System.out.println(categoryMap);

        System.out.println("\n18. Group Products By Seller");
        Map<Seller, List<Product>> sellerMap =
                products.stream()
                        .collect(Collectors.groupingBy(Product::getSeller));
        System.out.println(sellerMap);

        System.out.println("\n19. Partition Products");
        Map<Boolean, List<Product>> partition =
                products.stream()
                        .collect(Collectors.partitioningBy(Product::isInStock));
        System.out.println(partition);

        System.out.println("\n20. Map<Integer, Product>");
        Map<Integer, Product> productMap =
                products.stream()
                        .collect(Collectors.toMap(Product::getProductId, p -> p));
        System.out.println(productMap);

        System.out.println("\n21. Customer Names Separated By Commas");
        String names = customers.stream()
                .map(Customer::getName)
                .collect(Collectors.joining(", "));
        System.out.println(names);
    }
}