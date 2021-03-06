package com.wgw.biz.dao;

import com.wgw.biz.entity.WgwProduct;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (WgwProduct)表数据库访问层
 *
 * @author makejava
 * @since 2019-09-27 16:12:55
 */
public interface WgwProductDao {


    WgwProduct queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WgwProduct> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param wgwProduct 实例对象
     * @return 对象列表
     */
    List<WgwProduct> queryAll(WgwProduct wgwProduct);

    /**
     * 新增数据
     *
     * @param wgwProduct 实例对象
     * @return 影响行数
     */
    int insert(WgwProduct wgwProduct);

    /**
     * 修改数据
     *
     * @param wgwProduct 实例对象
     * @return 影响行数
     */
    int update(WgwProduct wgwProduct);


    int deleteById(Integer id);

}