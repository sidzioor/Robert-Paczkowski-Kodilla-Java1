package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean createOrder(Product product, LocalDateTime dateAndTimeOfOrder);
}
