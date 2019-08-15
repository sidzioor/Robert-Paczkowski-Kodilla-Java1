package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayDeque;

public class HealthyShop implements ProducersRealization {
    private ArrayDeque<OrdersInformation> theOrders = new ArrayDeque<>();
    public void process(OrdersInformation ordersInformation){
        theOrders.offer(ordersInformation);
        System.out.println("Chosen products: " + theOrders.peek());
    }
}
