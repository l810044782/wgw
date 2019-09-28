package com.wgw.biz.controller;

import com.wgw.biz.entity.WgwProductCategory;
import com.wgw.biz.service.WgwProductCategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (WgwProductCategory)表控制层
 *
 * @author makejava
 * @since 2019-09-27 16:13:02
 */
@RestController
@RequestMapping("wgwProductCategory")
public class WgwProductCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private WgwProductCategoryService wgwProductCategoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WgwProductCategory selectOne(Integer id) {
        return this.wgwProductCategoryService.queryById(id);
    }

}