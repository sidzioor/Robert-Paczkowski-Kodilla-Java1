package com.kodilla.good.patterns.challenges.Food2Door;

public class OrdersInformation {
    private String informationOfProducer;
    private int quantityOfProducts;
    private String products;

    public OrdersInformation(String informationOfProducer, int quantityOfProducts, String products) {
        this.informationOfProducer = informationOfProducer;
        this.quantityOfProducts = quantityOfProducts;
        this.products = products;
    }

    public String getInformationOfProducer() {
        return informationOfProducer;
    }

    public int getQuantityOfProducts() {
        return quantityOfProducts;
    }

    public String getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return  "informationOfProducer='" + informationOfProducer + '\'' +
                ", quantityOfProducts=" + quantityOfProducts +
                ", products='" + products + "\n";
    }
}
