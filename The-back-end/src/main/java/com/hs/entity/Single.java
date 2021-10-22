package com.hs.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Single)实体类
 *
 * @author makejava
 * @since 2021-10-22 20:54:50
 */
public class Single implements Serializable {
    private static final long serialVersionUID = 971143442094529320L;
    /**
    * 单个订单编号
    */
    private Integer sinId;
    /**
    * 所属大订单
    */
    private Integer ordId;
    /**
    * 商品
    */
    private Integer comId;
    /**
    * 购买数量
    */
    private Integer sinNum;
    /**
    * 总价格
    */
    private Object sinPrice;
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


    public Integer getSinId() {
        return sinId;
    }

    public void setSinId(Integer sinId) {
        this.sinId = sinId;
    }

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public Integer getSinNum() {
        return sinNum;
    }

    public void setSinNum(Integer sinNum) {
        this.sinNum = sinNum;
    }

    public Object getSinPrice() {
        return sinPrice;
    }

    public void setSinPrice(Object sinPrice) {
        this.sinPrice = sinPrice;
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