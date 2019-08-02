package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SlippersOrderRepository implements OrderRepository{
    public boolean createOrder(Product product, LocalDateTime dateAndTimeOfOrder){
        return true;
    }
}
