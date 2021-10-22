package com.hs.entity;

import java.io.Serializable;

/**
 * (Location)实体类
 *
 * @author makejava
 * @since 2021-10-22 20:54:50
 */
public class Location implements Serializable {
    private static final long serialVersionUID = 433289416237192486L;
    /**
    * 地址编号
    */
    private Integer locId;
    /**
    * 具体地址
    */
    private String locAddress;
    /**
    * 收件人
    */
    private String locName;
    /**
    * 电话
    */
    private String locTel;
    /**
    * 用户编号
    */
    private Integer conId;
    /**
    * 是否是默认地址，0否1是
    */
    private Object locDefault;
    /**
    * 备用
    */
    private String bySp1;
    /**
    * 备用
    */
    private String bySp2;


    public Integer getLocId() {
        return locId;
    }

    public void setLocId(Integer locId) {
        this.locId = locId;
    }

    public String getLocAddress() {
        return locAddress;
    }

    public void setLocAddress(String locAddress) {
        this.locAddress = locAddress;
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    public String getLocTel() {
        return locTel;
    }

    public void setLocTel(String locTel) {
        this.locTel = locTel;
    }

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }

    public Object getLocDefault() {
        return locDefault;
    }

    public void setLocDefault(Object locDefault) {
        this.locDefault = locDefault;
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