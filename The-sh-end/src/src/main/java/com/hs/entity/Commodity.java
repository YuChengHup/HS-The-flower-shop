package com.hs.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Commodity)实体类
 *
 * @author makejava
 * @since 2021-10-22 20:54:50
 */
public class Commodity implements Serializable {
    private static final long serialVersionUID = 841668848273355742L;
    /**
    * 商品编号
    */
    private Integer comId;
    /**
    * 商品名
    */
    private String comName;
    /**
    * 进价
    */
    private Object comPurchPrice;
    /**
    * 售价
    */
    private Object comPrice;
    /**
    * 库存
    */
    private Integer comNum;
    /**
    * 描述
    */
    private String comDescription;
    /**
    * 销量
    */
    private Integer comVolume;
    /**
    * 种类
    */
    private Integer sorId;
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


    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public Object getComPurchPrice() {
        return comPurchPrice;
    }

    public void setComPurchPrice(Object comPurchPrice) {
        this.comPurchPrice = comPurchPrice;
    }

    public Object getComPrice() {
        return comPrice;
    }

    public void setComPrice(Object comPrice) {
        this.comPrice = comPrice;
    }

    public Integer getComNum() {
        return comNum;
    }

    public void setComNum(Integer comNum) {
        this.comNum = comNum;
    }

    public String getComDescription() {
        return comDescription;
    }

    public void setComDescription(String comDescription) {
        this.comDescription = comDescription;
    }

    public Integer getComVolume() {
        return comVolume;
    }

    public void setComVolume(Integer comVolume) {
        this.comVolume = comVolume;
    }

    public Integer getSorId() {
        return sorId;
    }

    public void setSorId(Integer sorId) {
        this.sorId = sorId;
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