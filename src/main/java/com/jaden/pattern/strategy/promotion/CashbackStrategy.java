package com.jaden.pattern.strategy.promotion;

public class CashbackStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("返现促销，返回金额到支付宝账号");
    }
}
