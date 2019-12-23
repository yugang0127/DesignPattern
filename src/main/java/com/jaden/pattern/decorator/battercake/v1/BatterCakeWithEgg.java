package com.jaden.pattern.decorator.battercake.v1;

public class BatterCakeWithEgg extends BatterCake {
    @Override
    protected String getMsg() {
        return super.getMsg() + "加一个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
