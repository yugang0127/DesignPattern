package com.jaden.pattern.strategy.promotion;

public class EmptyStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("无优惠活动");
    }
}
