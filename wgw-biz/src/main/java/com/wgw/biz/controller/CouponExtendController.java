package com.wgw.biz.controller;

import com.wgw.biz.entity.CouponExtend;
import com.wgw.biz.service.CouponExtendService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (CouponExtend)表控制层
 *
 * @author makejava
 * @since 2019-09-27 16:13:59
 */
@RestController
@RequestMapping("couponExtend")
public class CouponExtendController {
    /**
     * 服务对象
     */
    @Resource
    private CouponExtendService couponExtendService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CouponExtend selectOne(Integer id) {
        return this.couponExtendService.queryById(id);
    }

}