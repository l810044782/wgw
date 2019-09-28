package com.wgw.biz.controller;

import com.wgw.biz.entity.Coupon;
import com.wgw.biz.service.CouponService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Coupon)表控制层
 *
 * @author makejava
 * @since 2019-09-27 16:14:07
 */
@RestController
@RequestMapping("coupon")
public class CouponController {
    /**
     * 服务对象
     */
    @Resource
    private CouponService couponService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Coupon selectOne(Integer id) {
        return this.couponService.queryById(id);
    }

}