package com.jaden.pattern.decorator.battercake.v1;

public class BatterCakeTest {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getMsg() + ",价格" + batterCake.getPrice());
        BatterCakeWithEgg batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getMsg() + ",价格" + batterCakeWithEgg.getPrice());
        BatterCakeWithEggAndSausage batterCakeWithEggAndSausage = new BatterCakeWithEggAndSausage();
        System.out.println(batterCakeWithEggAndSausage.getMsg() + ",价格" + batterCakeWithEggAndSausage.getPrice());
    }
}
