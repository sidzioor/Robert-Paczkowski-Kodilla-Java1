package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.LinkedList;
import java.util.List;

public class GlutenFreeShop implements ProducersRealization{
    private List<OrdersInformation> ordersList = new LinkedList<>();
    public void process(OrdersInformation ordersInformation){
        ordersList.add(ordersInformation);
        System.out.println("We add your order.");
    }
}
