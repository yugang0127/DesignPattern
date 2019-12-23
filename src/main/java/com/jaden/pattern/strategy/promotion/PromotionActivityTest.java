package com.jaden.pattern.strategy.promotion;

public class PromotionActivityTest {

//    public static void main(String[] args) {
//        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
//        PromotionActivity activity1212 = new PromotionActivity(new CashbackStrategy());
//        activity618.execute();
//        activity1212.execute();
//
//
//    }

//    public static void main(String[] args) {
//        PromotionActivity activity = null;
//        String promotionKey = "COUPON";
//
//        if (StringUtils.equals(promotionKey, "COUPON")) {
//            activity = new PromotionActivity(new CouponStrategy());
//        } else if (StringUtils.equals(promotionKey, "CASHBACK")) {
//            activity = new PromotionActivity(new CashbackStrategy());
//        }
//
//        activity.execute();;
//    }

    public static void main(String[] args) {
        String promotionKey = "COUPON";
        PromotionActivity promotionActivity = new PromotionActivity(
                PromotionStrategyFactory.getPromotionStrategy(promotionKey)
        );
        promotionActivity.execute();;
    }
}
