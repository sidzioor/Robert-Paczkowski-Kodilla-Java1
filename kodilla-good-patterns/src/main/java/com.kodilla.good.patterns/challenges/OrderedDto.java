package com.kodilla.good.patterns.challenges;

public class OrderedDto {
    private Product product;
    private boolean isOrdered;

    public OrderedDto(Product product, boolean isOrdered) {
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
