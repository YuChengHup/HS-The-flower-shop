package com.hs.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Statistic)实体类
 *
 * @author makejava
 * @since 2021-10-22 20:54:50
 */
public class Statistic implements Serializable {
    private static final long serialVersionUID = 874040599853137476L;
    /**
    * 统计编号
    */
    private Integer staId;
    /**
    * 统计日期
    */
    private Date staDate;
    /**
    * 统计商品
    */
    private Integer comId;
    /**
    * 销售额
    */
    private Integer staNum;
    /**
    * 总进价
    */
    private Object staPurchPrice;
    /**
    * 总售价
    */
    private Object staPrice;
    /**
    * 备用
    */
    private String bySp1;
    /**
    * 备用
    */
    private String bySp2;


    public Integer getStaId() {
        return staId;
    }

    public void setStaId(Integer staId) {
        this.staId = staId;
    }

    public Date getStaDate() {
        return staDate;
    }

    public void setStaDate(Date staDate) {
        this.staDate = staDate;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public Integer getStaNum() {
        return staNum;
    }

    public void setStaNum(Integer staNum) {
        this.staNum = staNum;
    }

    public Object getStaPurchPrice() {
        return staPurchPrice;
    }

    public void setStaPurchPrice(Object staPurchPrice) {
        this.staPurchPrice = staPurchPrice;
    }

    public Object getStaPrice() {
        return staPrice;
    }

    public void setStaPrice(Object staPrice) {
        this.staPrice = staPrice;
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