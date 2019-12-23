package com.jaden.pattern.decorator.battercake.v2;

public abstract class BatterCakeDecorator extends BatterCake {
    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    protected abstract void doSomething();

    protected String getMsg() {
        return this.batterCake.getMsg();
    }

    protected int getPrice() {
        return this.batterCake.getPrice();
    }
}
