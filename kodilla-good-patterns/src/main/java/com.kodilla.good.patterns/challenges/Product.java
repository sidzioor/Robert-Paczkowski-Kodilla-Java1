package com.kodilla.good.patterns.challenges;

public class Product {
    private String productName;
    private double productValue;

    public Product(String productName, double productValue) {
        this.productName = productName;
        this.productValue = productValue;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductValue() {
        return productValue;
    }
}
