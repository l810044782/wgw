package com.wgw.biz.controller;

import com.wgw.biz.entity.WgwUserAddress;
import com.wgw.biz.service.WgwUserAddressService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (WgwUserAddress)表控制层
 *
 * @author makejava
 * @since 2019-09-27 16:13:49
 */
@RestController
@RequestMapping("wgwUserAddress")
public class WgwUserAddressController {
    /**
     * 服务对象
     */
    @Resource
    private WgwUserAddressService wgwUserAddressService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WgwUserAddress selectOne(Integer id) {
        return this.wgwUserAddressService.queryById(id);
    }

}