package com.yunfy.learning.patterns.template;

/**
 * @author yunfy
 * @create 2019-03-26 21:07
 **/
public class LoginModel {
    /**
     * 通用的登录人员的编号，可能是用户编号，也可能是工作人员编号
     */
    private String loginId;

    /**
     * 登录密码
     */
    private String pwd;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
