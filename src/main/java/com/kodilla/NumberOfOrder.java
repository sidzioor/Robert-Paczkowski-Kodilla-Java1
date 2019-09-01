package com.kodilla;

import java.util.*;
import java.lang.*;

class DuplicatedOrders {
    List<String> NonDuplicatedOrders;

    public DuplicatedOrders() {
        NonDuplicatedOrders = new ArrayList<String>();
    }

    public void findDuplicatedOrders(List<String> theOrders) {
        for (String order : theOrders) {
            if (NonDuplicatedOrders.contains(order) == false) {
                NonDuplicatedOrders.add(order);
            } else {
                System.out.println(order + " is duplicated!");
            }
        }
        System.out.println("List of not duplicated oreders: ");
        for (String showOrders : NonDuplicatedOrders) {
            System.out.println(showOrders);
        }
    }
}

class Application {
    public static void main(String[] args) {
        List<String> orders = Arrays.asList("order1", "order2", "order1", "order3", "order2");
        DuplicatedOrders duplicatedOrders = new DuplicatedOrders();
        duplicatedOrders.findDuplicatedOrders(orders);
    }
}