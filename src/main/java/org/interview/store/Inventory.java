package org.interview.store;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Inventory {
    private List<Product> products = new ArrayList<>();


    public void addProduct(Product product) {
        // Add product to the list
    }

    public void updateProductQuantity(int productId, int change) {
        // Implement logic to find product by ID and update its quantity
    }

    public void checkLowStock(int threshold) {
        // Implement logic to display products with quantity below the threshold
    }

    public void processSale(int productId, int quantitySold) {
        // Implement logic to decrease quantity based on sale, if sufficient stock
    }

    public void reorderProduct(int productId, int threshold, int reorderAmount) {
        // Implement logic to reorder if quantity is below the threshold
    }

    public double calculateTotalInventoryValue() {
        // Calculate and return the total value of all products in inventory
        return 0.0;
    }

    private Optional<Product> findProductById(int id) {
        // Implement logic to find and return product by ID
        return Optional.empty();
    }
}
