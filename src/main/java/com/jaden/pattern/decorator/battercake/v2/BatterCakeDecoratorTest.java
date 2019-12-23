package com.jaden.pattern.decorator.battercake.v2;

public class BatterCakeDecoratorTest {
    public static void main(String[] args) {
        BatterCake batterCake;
        batterCake = new BaseBatterCake();
        batterCake = new EggDecorator(batterCake);
        batterCake = new EggDecorator(batterCake);
        batterCake = new SausageDecorator(batterCake);
        System.out.println(batterCake.getMsg() + ",价格" + batterCake.getPrice());

    }
}
