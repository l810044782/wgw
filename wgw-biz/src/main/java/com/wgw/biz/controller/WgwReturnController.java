package com.wgw.biz.controller;

import com.wgw.biz.entity.WgwReturn;
import com.wgw.biz.service.WgwReturnService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (WgwReturn)表控制层
 *
 * @author makejava
 * @since 2019-09-27 16:13:38
 */
@RestController
@RequestMapping("wgwReturn")
public class WgwReturnController {
    /**
     * 服务对象
     */
    @Resource
    private WgwReturnService wgwReturnService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WgwReturn selectOne(Integer id) {
        return this.wgwReturnService.queryById(id);
    }

}