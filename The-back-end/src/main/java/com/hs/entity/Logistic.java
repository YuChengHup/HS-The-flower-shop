package com.hs.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Logistic)实体类
 *
 * @author makejava
 * @since 2021-10-22 20:54:50
 */
public class Logistic implements Serializable {
    private static final long serialVersionUID = -32337517947431653L;
    /**
    * 编号，uuid生活曾
    */
    private String logId;
    /**
    * 订单编号
    */
    private Integer ordId;
    /**
    * 物流状态
    */
    private String logStatus;
    /**
    * 发货日期
    */
    private Date logCreate;
    /**
    * 预计到货日期
    */
    private Date logEstimate;
    /**
    * 备用
    */
    private String bySp1;
    /**
    * 备用
    */
    private String bySp2;


    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public String getLogStatus() {
        return logStatus;
    }

    public void setLogStatus(String logStatus) {
        this.logStatus = logStatus;
    }

    public Date getLogCreate() {
        return logCreate;
    }

    public void setLogCreate(Date logCreate) {
        this.logCreate = logCreate;
    }

    public Date getLogEstimate() {
        return logEstimate;
    }

    public void setLogEstimate(Date logEstimate) {
        this.logEstimate = logEstimate;
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