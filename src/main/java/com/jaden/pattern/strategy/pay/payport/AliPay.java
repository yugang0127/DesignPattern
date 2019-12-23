package com.jaden.pattern.strategy.pay.payport;

import com.jaden.pattern.strategy.pay.PayState;

public class AliPay extends Payment {

    public String getName() {
        return "支付宝";
    }

    public double queryBalance(String uid) {
        return 1000;
    }
}
