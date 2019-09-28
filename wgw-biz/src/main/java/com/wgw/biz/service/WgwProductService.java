package com.wgw.biz.service;

import com.wgw.biz.entity.WgwProduct;
import java.util.List;

/**
 * (WgwProduct)表服务接口
 *
 * @author makejava
 * @since 2019-09-27 16:12:55
 */
public interface WgwProductService {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    WgwProduct queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WgwProduct> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param wgwProduct 实例对象
     * @return 实例对象
     */
    WgwProduct insert(WgwProduct wgwProduct);

    /**
     * 修改数据
     *
     * @param wgwProduct 实例对象
     * @return 实例对象
     */
    WgwProduct update(WgwProduct wgwProduct);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}