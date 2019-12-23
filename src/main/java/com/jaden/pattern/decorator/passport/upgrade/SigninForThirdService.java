package com.jaden.pattern.decorator.passport.upgrade;

import com.jaden.pattern.decorator.passport.old.ISigninService;
import com.jaden.pattern.decorator.passport.old.ResultMsg;

public class SigninForThirdService implements ISigninForThirdService {
    private ISigninService signin;

    public SigninForThirdService(ISigninService signin) {
        this.signin = signin;
    }

    public ResultMsg loginForQQ(String id) {
        return null;
    }

    public ResultMsg loginForWechat(String id) {
        return null;
    }

    public ResultMsg loginForToken(String token) {
        return null;
    }

    public ResultMsg loginForTelephone(String telephone, String code) {
        return null;
    }

    public ResultMsg loginForRegist(String username, String passport) {
        return null;
    }

    public ResultMsg register(String username, String password) {
        return this.signin.register(username, password);
    }

    public ResultMsg login(String username, String password) {
        return this.signin.login(username, password);
    }
}
