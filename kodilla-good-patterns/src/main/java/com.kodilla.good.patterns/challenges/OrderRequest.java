package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private Product product;
    private Customer customer;
    private LocalDateTime dateAndTimeOfOrder;

    public OrderRequest(Product product, Customer customer, LocalDateTime dateAndTimeOfOrder) {
        this.product = product;
        this.customer = customer;
        this.dateAndTimeOfOrder = dateAndTimeOfOrder;
    }

    public Product getProduct() {
        return product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getDateAndTimeOfOrder() {
        return dateAndTimeOfOrder;
    }
}
