package com.jaden.pattern.decorator.battercake.v2;

import com.jaden.pattern.decorator.battercake.v1.BatterCakeWithEggAndSausage;

public class BaseBatterCake extends BatterCake {
    protected String getMsg() {
        return "煎饼";
    }

    protected int getPrice() {
        return 5;
    }
}
