package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private OrderInformation orderInformation;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final OrderInformation orderInformation,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.orderInformation = orderInformation;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderedDto process(final OrderRequest orderRequest) {
        boolean isRented = orderService.order(orderRequest.getProduct(), orderRequest.getDateAndTimeOfOrder());

        if (isRented) {
            orderInformation.inform(orderRequest.getCustomer());
            orderRepository.createOrder(orderRequest.getProduct(), orderRequest.getDateAndTimeOfOrder());
            return new OrderedDto(orderRequest.getProduct(), true);
        } else {
            return new OrderedDto(orderRequest.getProduct(), false);
        }
    }
}