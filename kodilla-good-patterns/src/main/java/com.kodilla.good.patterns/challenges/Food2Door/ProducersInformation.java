package com.kodilla.good.patterns.challenges.Food2Door;

public class ProducersInformation {
    private String informationOfProducer;
    private String product;

    public ProducersInformation(String informationOfProducer, String product) {
        this.informationOfProducer = informationOfProducer;
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public String getInformationOfProducer() {
        return informationOfProducer;
    }

}
