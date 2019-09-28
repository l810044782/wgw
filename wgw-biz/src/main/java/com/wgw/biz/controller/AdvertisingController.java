package com.wgw.biz.controller;

import com.wgw.biz.entity.Advertising;
import com.wgw.biz.service.AdvertisingService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Advertising)表控制层
 *
 * @author makejava
 * @since 2019-09-27 16:14:21
 */
@RestController
@RequestMapping("advertising")
public class AdvertisingController {
    /**
     * 服务对象
     */
    @Resource
    private AdvertisingService advertisingService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Advertising selectOne(Integer id) {
        return this.advertisingService.queryById(id);
    }

}