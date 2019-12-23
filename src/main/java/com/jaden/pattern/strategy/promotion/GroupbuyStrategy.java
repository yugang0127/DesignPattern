package com.jaden.pattern.strategy.promotion;

public class GroupbuyStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("拼团，满3人成团，全团享受团购价");
    }
}
