package com.jaden.pattern.strategy.pay;

import com.jaden.pattern.strategy.pay.payport.PayStrategy;

public class PayStrategyTest {
    public static void main(String[] args) {
        Order order = new Order("2018", "20180830", 600);
        System.out.println(order.pay(PayStrategy.JD_PAY));
    }
}
