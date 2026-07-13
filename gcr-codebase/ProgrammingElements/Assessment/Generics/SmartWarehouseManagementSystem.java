package ProgrammingElements.Assessment.Generics;

import java.util.ArrayList;
import java.util.List;

// Abstract class
abstract class WarehouseItem {
    String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public abstract void display();
}

// Electronics class
class Electronics extends WarehouseItem {

    public Electronics(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Electronics: " + name);
    }
}

// Groceries class
class Groceries extends WarehouseItem {

    public Groceries(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Groceries: " + name);
    }
}

// Furniture class
class Furniture extends WarehouseItem {

    public Furniture(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Furniture: " + name);
    }
}

// Generic Storage Class
class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    // Add item
    public void addItem(T item) {
        items.add(item);
    }

    // Get all items
    public List<T> getItems() {
        return items;
    }
}

// Main class
public class SmartWarehouseManagementSystem {

    // Wildcard Method
    public static void displayItems(List<? extends WarehouseItem> items) {
        System.out.println("\nItems in Storage:");
        for (WarehouseItem item : items) {
            item.display();
        }
    }

    public static void main(String[] args) {

        // Electronics Storage
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Mobile Phone"));

        // Grocery Storage
        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Milk"));

        // Furniture Storage
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        // Display all items using wildcard method
        displayItems(electronicsStorage.getItems());
        displayItems(groceryStorage.getItems());
        displayItems(furnitureStorage.getItems());
    }
}