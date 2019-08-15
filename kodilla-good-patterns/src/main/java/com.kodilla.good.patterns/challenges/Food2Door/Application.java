package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {
    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        Customer customer1 = new Customer("Jhon", "Rambo", "Gdańsk", "Grunwaldzka",
                32, 15);
        OrdersInformation orderForCustomer1 = new OrdersInformation("ExtraFoodShop",
                4, "Vege Burger");
        extraFoodShop.process(orderForCustomer1);
        OrdersRequest orderRequest = new OrdersRequest();
        orderRequest.orderRequest(customer1, orderForCustomer1);

        Customer customer2 = new Customer("Martha", "Smith", "New York", "Street",
                12, 31);
        HealthyShop healthyShop = new HealthyShop();
        OrdersInformation orderForCustomer2 = new OrdersInformation("HealthyShop",
                1, "Falafel with humus");
        healthyShop.process(orderForCustomer2);
        orderRequest.orderRequest(customer2, orderForCustomer2);

        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        Customer customer3 = new Customer("Andy", "Watson", "Warszawa","Kościuszki",
                21,43);
        OrdersInformation orderForCustomer3 = new OrdersInformation("GlutenFreeShop",
                3, "Gluten free pizza");
        glutenFreeShop.process(orderForCustomer3);
        orderRequest.orderRequest(customer3, orderForCustomer3);
    }
}
