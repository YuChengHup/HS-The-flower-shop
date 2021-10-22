package com.hs.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Consumer)实体类
 *
 * @author makejava
 * @since 2021-10-22 20:54:50
 */
public class Consumer implements Serializable {
    private static final long serialVersionUID = -63273240108979174L;
    /**
    * 用户id
    */
    private Integer conId;
    /**
    * 用户名
    */
    private String username;
    /**
    * 密码
    */
    private String passwd;
    /**
    * 用户姓名
    */
    private String conName;
    /**
    * 性别
    */
    private String conSex;
    /**
    * 电话
    */
    private String conTel;
    /**
    * 邮箱
    */
    private String conEmail;
    /**
    * 头像
    */
    private String conPhoto;
    /**
    * 帐号状态 ，是否冻结，0否
    */
    private Integer conStatus;
    /**
    * 插入时间
    */
    private Date gmtCreate;
    /**
    * 修改时间
    */
    private Date gmtModified;
    /**
    * 备用
    */
    private String bySp1;
    /**
    * 备用
    */
    private String bySp2;


    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }

    public String getConSex() {
        return conSex;
    }

    public void setConSex(String conSex) {
        this.conSex = conSex;
    }

    public String getConTel() {
        return conTel;
    }

    public void setConTel(String conTel) {
        this.conTel = conTel;
    }

    public String getConEmail() {
        return conEmail;
    }

    public void setConEmail(String conEmail) {
        this.conEmail = conEmail;
    }

    public String getConPhoto() {
        return conPhoto;
    }

    public void setConPhoto(String conPhoto) {
        this.conPhoto = conPhoto;
    }

    public Object getConStatus() {
        return conStatus;
    }

    public void setConStatus(Integer conStatus) {
        this.conStatus = conStatus;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getBySp1() {
        return bySp1;
    }

    public void setBySp1(String bySp1) {
        this.bySp1 = bySp1;
    }

    public String getBySp2() {
        return bySp2;
    }

    public void setBySp2(String bySp2) {
        this.bySp2 = bySp2;
    }

}