package com.wgw.biz.entity;

import java.io.Serializable;

/**
 * (CouponExtend)实体类
 *
 * @author makejava
 * @since 2019-09-27 16:13:59
 */
public class CouponExtend implements Serializable {
    private static final long serialVersionUID = -63667388063969283L;
    //编号
    private Integer id;
    
    private Integer couponId;
    
    private String couponType;
    
    private String couponName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

}