package com.jaden.pattern.proxy.dbroute;

public class OrderService implements IOrderService {
    private OrderDao orderDao;

    public OrderService() {
        this.orderDao = new OrderDao();
    }

    public int createOrder(Order order) {
        System.out.println("OrderService调用OrderDao创建订单");
        return orderDao.insert(order);
    }
}
