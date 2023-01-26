package com.techelevator.view;

import java.util.Map;

// will need a log class and exception log class
//    public enum ProductName {
//        potato_crisps, stackers, grain_waves,
//    }

public class Product {

    private String productName;

    private String type;

    private double price;

    private String productLocation; // or a list?!? ProductLocation could be enum like ProductName
    private int quantity;

    private Map<String, Double> products;

    public Product(String productLocation, String productName, double price, String type) {

        this.productLocation = productLocation;
        this.productName = productName;
        this.price = price;
        this.type = type;
        quantity = 5;
    }

    // a display() method to list all items
    // a sales_report() method

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductLocation() {
        return productLocation;
    }

    public void setProductLocation(String productLocation) {
        this.productLocation = productLocation;
    }

    public Map<String, Double> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Double> products) {
        this.products = products;
    }

    public String getQuantity() {
        if (quantity <= 0) {
            return "SOLD OUT";
        } else {
            return Integer.toString(quantity);
        }

    }

    public boolean setQuantity(int quantity) {
        if (quantity <= 5 && quantity >= 0) {
            this.quantity = quantity;
            return true;
        } else {
            return false;
        }

    }

    public void sound() {
        switch (this.getType()) {
            case ("Chip"):
                System.out.println("Crunch Crunch, Yum!");
                break;
            case ("Candy"):
                System.out.println("Munch Munch, Yum!");
                break;
            case ("Drink"):
                System.out.println("Glug Glug, Yum!");
                break;
            case ("Gum"):
                System.out.println("Chew Chew, Yum!");
                break;
        }

    }
}
