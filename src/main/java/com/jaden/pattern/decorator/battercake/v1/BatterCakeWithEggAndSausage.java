package com.jaden.pattern.decorator.battercake.v1;

public class BatterCakeWithEggAndSausage extends BatterCakeWithEgg {
    @Override
    protected String getMsg() {
        return super.getMsg() + "加一个香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
