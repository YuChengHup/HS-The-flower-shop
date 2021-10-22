package com.hs.entity;

import java.io.Serializable;

/**
 * (Photo)实体类
 *
 * @author makejava
 * @since 2021-10-22 20:54:50
 */
public class Photo implements Serializable {
    private static final long serialVersionUID = 639108154124251042L;
    /**
    * 图片编号
    */
    private Integer phoId;
    /**
    * 图片路径
    */
    private String phoUrl;
    /**
    * 商品编号
    */
    private Integer comId;
    /**
    * 是否是默认，0否1是
    */
    private Object phoDefault;
    /**
    * 备用
    */
    private String bySp1;
    /**
    * 备用
    */
    private String bySp2;


    public Integer getPhoId() {
        return phoId;
    }

    public void setPhoId(Integer phoId) {
        this.phoId = phoId;
    }

    public String getPhoUrl() {
        return phoUrl;
    }

    public void setPhoUrl(String phoUrl) {
        this.phoUrl = phoUrl;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public Object getPhoDefault() {
        return phoDefault;
    }

    public void setPhoDefault(Object phoDefault) {
        this.phoDefault = phoDefault;
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