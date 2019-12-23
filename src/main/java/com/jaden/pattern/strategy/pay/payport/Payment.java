package com.jaden.pattern.strategy.pay.payport;

import com.jaden.pattern.strategy.pay.PayState;

public abstract  class Payment {

    // 支付类型
    public abstract String getName();

    // 查询余额
    public abstract double queryBalance(String uid);


    public PayState pay(String uid, double amount) {
        if (queryBalance(uid) < amount) {
            return new PayState(500, "支付失败", "余额不足");
        }

        return new PayState(200, "支付成功", "支付余额：" + amount);
    }
}
