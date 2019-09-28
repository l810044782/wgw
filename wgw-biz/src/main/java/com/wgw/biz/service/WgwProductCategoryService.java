package com.wgw.biz.service;

import com.wgw.biz.entity.WgwProductCategory;
import java.util.List;

/**
 * (WgwProductCategory)表服务接口
 *
 * @author makejava
 * @since 2019-09-27 16:13:02
 */
public interface WgwProductCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WgwProductCategory queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WgwProductCategory> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param wgwProductCategory 实例对象
     * @return 实例对象
     */
    WgwProductCategory insert(WgwProductCategory wgwProductCategory);

    /**
     * 修改数据
     *
     * @param wgwProductCategory 实例对象
     * @return 实例对象
     */
    WgwProductCategory update(WgwProductCategory wgwProductCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}