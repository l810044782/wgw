package com.wgw.biz.controller;

import com.wgw.biz.entity.WgwProduct;
import com.wgw.biz.service.WgwProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (WgwProduct)表控制层
 *
 * @author makejava
 * @since 2019-09-27 16:12:55
 */
@RestController
@RequestMapping("wgwProduct")
public class WgwProductController {
    /**
     * 服务对象
     */
    @Resource
    private WgwProductService wgwProductService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WgwProduct selectOne(Integer id) {
        return this.wgwProductService.queryById(id);
    }

}