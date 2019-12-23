package com.jaden.pattern.proxy.dynamicproxy.jdkproxy;

import com.jaden.pattern.proxy.Person;

import java.lang.reflect.Method;

public class JDKProxyTest {
    public static void main(String[] args) {
        try {
//            Person obj = (Person)new JDKMeipo().getInstance(new Customer());
//            obj.findLove();
            Object obj = new JDKMeipo().getInstance(new Customer());
            Method method = obj.getClass().getMethod("findLove", null);
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
