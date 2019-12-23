package com.jaden.pattern.decorator.passport.old;

public interface ISigninService {

    /**
     * 注册
     * @param username
     * @param password
     * @return
     */
    ResultMsg register(String username, String  password);

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    ResultMsg login(String username, String  password);
}
