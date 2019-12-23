package com.jaden.pattern.strategy.pay.payport;

public class WechatPay extends Payment {

    public String getName() {
        return "微信支付";
    }

    public double queryBalance(String uid) {
        return 500;
    }
}
