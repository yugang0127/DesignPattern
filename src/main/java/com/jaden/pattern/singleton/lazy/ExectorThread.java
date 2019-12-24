package com.jaden.pattern.singleton.lazy;

public class ExectorThread implements Runnable {
    public void run() {
        LazySimpleSingleton lazy = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazy);
    }
}
