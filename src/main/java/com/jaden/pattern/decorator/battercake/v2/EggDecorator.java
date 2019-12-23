package com.jaden.pattern.decorator.battercake.v2;

public class EggDecorator extends BatterCakeDecorator {

    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    protected void doSomething() {

    }

    protected String getMsg() {
        return super.getMsg() + "加一个鸡蛋";
    }

    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
