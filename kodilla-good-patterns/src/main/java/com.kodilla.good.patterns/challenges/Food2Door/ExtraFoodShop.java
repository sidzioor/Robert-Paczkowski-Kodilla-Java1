package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements ProducersRealization {
    private List<String> listOfOrderedProducts = new ArrayList();
    public void process(OrdersInformation ordersInformation) {
            listOfOrderedProducts.add(ordersInformation.getProducts());
            System.out.println("Yours products added to order: " + listOfOrderedProducts);

    }
}
