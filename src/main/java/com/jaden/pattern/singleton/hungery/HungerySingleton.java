package com.jaden.pattern.singleton.hungery;

public class HungerySingleton {
    private static final HungerySingleton hungerySingleton = new HungerySingleton();
    private HungerySingleton() {}

    public static HungerySingleton getInstance() {
        return hungerySingleton;
    }
}
