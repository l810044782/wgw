package com.wgw.biz.controller;

import com.wgw.biz.entity.Brand;
import com.wgw.biz.service.BrandService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Brand)表控制层
 *
 * @author makejava
 * @since 2019-09-27 16:14:14
 */
@RestController
@RequestMapping("brand")
public class BrandController {
    /**
     * 服务对象
     */
    @Resource
    private BrandService brandService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Brand selectOne(Integer id) {
        return this.brandService.queryById(id);
    }

}