package com.jaden.pattern.strategy.pay.payport;

public class JDPay extends Payment {

    public String getName() {
        return "京东白条";
    }

    public double queryBalance(String uid) {
        return 300;
    }
}
