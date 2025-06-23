package org.interview.store;


public class InventoryManager {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(101, "Laptop", 999.99, 10));
        inventory.addProduct(new Product(102, "Keyboard", 29.99, 3));

        inventory.checkLowStock(5);

        inventory.processSale(101, 2);

        inventory.reorderProduct(102, 5, 10);

        double totalValue = inventory.calculateTotalInventoryValue();
        System.out.printf("Total Inventory Value: $%.2f%n", totalValue);
    }
}
