package com.jaden.pattern.decorator.passport.upgrade;

import com.jaden.pattern.decorator.passport.old.ISigninService;
import com.jaden.pattern.decorator.passport.old.ResultMsg;

public interface ISigninForThirdService extends ISigninService {
    /**
     * 手机登录
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);

    /**
     * 微信登录
     * @param id
     * @return
     */
    ResultMsg loginForWechat(String id);

    /**
     * 记住登录状态后自动登录
     * @param token
     * @return
     */
    ResultMsg loginForToken(String token);

    /**
     * 手机号登录
     * @param telephone
     * @param code
     * @return
     */
    ResultMsg loginForTelephone(String telephone, String code);

    /**
     * 注册后自动登录
     * @param username
     * @param passport
     * @return
     */
    ResultMsg loginForRegist(String username, String passport);
}
