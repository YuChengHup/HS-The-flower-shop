package com.hs.entity;

import java.io.Serializable;

/**
 * (Token)实体类
 *
 * @author makejava
 * @since 2021-10-22 20:54:50
 */
public class Token implements Serializable {
    private static final long serialVersionUID = 863943530371932917L;
    /**
    * token,uuid生成
    */
    private String token;
    /**
    * 用户编号
    */
    private Integer conId;
    /**
    * 是否登录，0否1是
    */
    private Object isLogin;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }

    public Object getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(Object isLogin) {
        this.isLogin = isLogin;
    }

}