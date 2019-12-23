package com.jaden.pattern.delegate.simple;

public class DelegateTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Leader leader = new Leader();
        boss.command("登录", leader);
        boss.command("订单", leader);
    }
}
