package com.jaden.pattern.decorator.passport;

import com.jaden.pattern.decorator.passport.old.SignService;
import com.jaden.pattern.decorator.passport.upgrade.ISigninForThirdService;
import com.jaden.pattern.decorator.passport.upgrade.SigninForThirdService;

public class PassportDecoratorTest {
    public static void main(String[] args) {
        ISigninForThirdService signinForThirdService = new SigninForThirdService(new SignService());
        signinForThirdService.loginForQQ("openid11111333");
    }
}
