package com.wgw.biz.entity;

import java.io.Serializable;

/**
 * (Coupon)实体类
 *
 * @author makejava
 * @since 2019-09-27 16:14:07
 */
public class Coupon implements Serializable {
    private static final long serialVersionUID = 682472690027504044L;
    //编号
    private Integer id;
    //优惠券名称(1:全品类通用卷 2:小米手机专用卷 3:手机品类专用卷 4:新优惠券)
    private Integer name;
    //优惠券类型(1:全场赠券 2:会员赠券 3:购物赠券 4:注册赠券)
    private Integer type;
    //可使用商品(1:全场通用 2:指定分类 3:指定商品)
    private Integer cancommodity;
    //使用门槛(1:满100元可用 2:满500可用 3:满1000可用)
    private Integer usingthreshold;
    //面值(1:10元 2:50元 3:100元 4:300元)
    private Integer facevalue;
    //使用平台(1:全平台 2:移动平台)
    private Integer tryplatform;
    //开始时间
    private Object gotime;
    //截止时间
    private Object endtime;
    //状态(1:已过期 2:未过期)
    private Integer status;
    //总发行量
    private Integer sum;
    //已领取
    private Integer alreadyReceived;
    //待领取
    private Integer toReceive;
    //已使用
    private Integer haveBeenUsed;
    //未使用
    private Integer unused;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCancommodity() {
        return cancommodity;
    }

    public void setCancommodity(Integer cancommodity) {
        this.cancommodity = cancommodity;
    }

    public Integer getUsingthreshold() {
        return usingthreshold;
    }

    public void setUsingthreshold(Integer usingthreshold) {
        this.usingthreshold = usingthreshold;
    }

    public Integer getFacevalue() {
        return facevalue;
    }

    public void setFacevalue(Integer facevalue) {
        this.facevalue = facevalue;
    }

    public Integer getTryplatform() {
        return tryplatform;
    }

    public void setTryplatform(Integer tryplatform) {
        this.tryplatform = tryplatform;
    }

    public Object getGotime() {
        return gotime;
    }

    public void setGotime(Object gotime) {
        this.gotime = gotime;
    }

    public Object getEndtime() {
        return endtime;
    }

    public void setEndtime(Object endtime) {
        this.endtime = endtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getAlreadyReceived() {
        return alreadyReceived;
    }

    public void setAlreadyReceived(Integer alreadyReceived) {
        this.alreadyReceived = alreadyReceived;
    }

    public Integer getToReceive() {
        return toReceive;
    }

    public void setToReceive(Integer toReceive) {
        this.toReceive = toReceive;
    }

    public Integer getHaveBeenUsed() {
        return haveBeenUsed;
    }

    public void setHaveBeenUsed(Integer haveBeenUsed) {
        this.haveBeenUsed = haveBeenUsed;
    }

    public Integer getUnused() {
        return unused;
    }

    public void setUnused(Integer unused) {
        this.unused = unused;
    }

}