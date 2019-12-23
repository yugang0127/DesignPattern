package com.jaden.pattern.strategy.promotion;

public class CouponStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("领取优惠券，课程价格减去优惠券面额");
    }
}
