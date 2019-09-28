package com.wgw.biz.controller;

import com.wgw.biz.entity.WgwOrderDetail;
import com.wgw.biz.service.WgwOrderDetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (WgwOrderDetail)表控制层
 *
 * @author makejava
 * @since 2019-09-27 16:12:47
 */
@RestController
@RequestMapping("wgwOrderDetail")
public class WgwOrderDetailController {
    /**
     * 服务对象
     */
    @Resource
    private WgwOrderDetailService wgwOrderDetailService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WgwOrderDetail selectOne(Integer id) {
        return this.wgwOrderDetailService.queryById(id);
    }

}