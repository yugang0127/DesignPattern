package com.jaden.pattern.strategy.pay.payport;

public class UnionPay extends Payment {

    public String getName() {
        return "银联支付";
    }

    public double queryBalance(String uid) {
        return 888;
    }
}
