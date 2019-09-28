package com.wgw.biz.controller;

import com.wgw.biz.entity.MenuRole;
import com.wgw.biz.service.MenuRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MenuRole)表控制层
 *
 * @author makejava
 * @since 2019-09-27 16:07:03
 */
@RestController
@RequestMapping("menuRole")
public class MenuRoleController {
    /**
     * 服务对象
     */
    @Resource
    private MenuRoleService menuRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MenuRole selectOne(Integer id) {
        return this.menuRoleService.queryById(id);
    }

}