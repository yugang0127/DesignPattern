package com.jaden.pattern.decorator.battercake.v2;

public class SausageDecorator extends BatterCakeDecorator {

    public SausageDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    protected void doSomething() {

    }

    protected String getMsg() {
        return super.getMsg() + "加一个香肠";
    }

    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
