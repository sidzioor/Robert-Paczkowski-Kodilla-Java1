package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Product product = new Product("Kubot Slippers", 20.00);
        Customer customer = new Customer("Jhon", "Smith", "Gdansk", "Street",
                23, 24);

        return new OrderRequest(product, customer, LocalDateTime.now());
    }
}
