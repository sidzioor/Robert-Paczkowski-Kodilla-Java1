package com.kodilla.good.patterns.challenges.Food2Door;

public class OrdersRequest {
    public void orderRequest(Customer customer, OrdersInformation ordersInformation) {
        System.out.println("Information about customer: " + customer + ".\n" + "Ordered Products: " +ordersInformation);
    }
}
