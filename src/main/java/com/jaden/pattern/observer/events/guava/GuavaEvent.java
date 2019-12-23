package com.jaden.pattern.observer.events.guava;

public class GuavaEvent {
    //@Subscribe
    public void subscribe(String str) {
        System.out.println("执行subscribe方法，传入的参数是：" + str);
    }
}
