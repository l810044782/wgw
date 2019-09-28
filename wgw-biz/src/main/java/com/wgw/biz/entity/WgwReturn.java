package com.wgw.biz.entity;

import java.io.Serializable;

/**
 * (WgwReturn)实体类
 *
 * @author makejava
 * @since 2019-09-27 16:13:38
 */
public class WgwReturn implements Serializable {
    private static final long serialVersionUID = 764900460969235161L;
    //服务单号
    private Integer id;
    //申请时间
    private Object returnTime;
    //用户名称
    private String returnName;
    //用户账号
    private Integer returnUser;
    //退款金额
    private Object returnPrice;
    //申请状态(1:待处理 2:退货中 3:已拒绝 4:已完成)
    private Integer returnType;
    //处理时间
    private Object returnOtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Object returnTime) {
        this.returnTime = returnTime;
    }

    public String getReturnName() {
        return returnName;
    }

    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    public Integer getReturnUser() {
        return returnUser;
    }

    public void setReturnUser(Integer returnUser) {
        this.returnUser = returnUser;
    }

    public Object getReturnPrice() {
        return returnPrice;
    }

    public void setReturnPrice(Object returnPrice) {
        this.returnPrice = returnPrice;
    }

    public Integer getReturnType() {
        return returnType;
    }

    public void setReturnType(Integer returnType) {
        this.returnType = returnType;
    }

    public Object getReturnOtime() {
        return returnOtime;
    }

    public void setReturnOtime(Object returnOtime) {
        this.returnOtime = returnOtime;
    }

}