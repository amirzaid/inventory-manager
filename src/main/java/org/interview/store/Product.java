package org.interview.store;


class Product {
    private final int id;
    private final String name;
    private final double price;
    private final int quantity;


    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }


    public void updateQuantity(int change) {
        // Implement logic to update quantity, ensuring it doesn't go below zero
    }

    public boolean isLowStock(int threshold) {
        // Implement logic to return true if quantity is below the threshold
        return false;
    }

    @Override
    public String toString() {
        // Return a string representation of the product details
        return "";
    }
}
