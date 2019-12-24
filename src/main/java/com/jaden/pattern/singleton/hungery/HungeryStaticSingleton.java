package com.jaden.pattern.singleton.hungery;

public class HungeryStaticSingleton {
    private static final HungeryStaticSingleton hungeryStaticSingleton;

    static {
        hungeryStaticSingleton = new HungeryStaticSingleton();
    }


    private HungeryStaticSingleton() {}

    public static HungeryStaticSingleton getInstance() {
        return hungeryStaticSingleton;
    }
}
