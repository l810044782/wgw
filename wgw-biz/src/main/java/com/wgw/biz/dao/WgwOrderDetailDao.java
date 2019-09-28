package com.wgw.biz.dao;

import com.wgw.biz.entity.WgwOrderDetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (WgwOrderDetail)表数据库访问层
 *
 * @author makejava
 * @since 2019-09-27 16:12:47
 */
public interface WgwOrderDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WgwOrderDetail queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WgwOrderDetail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param wgwOrderDetail 实例对象
     * @return 对象列表
     */
    List<WgwOrderDetail> queryAll(WgwOrderDetail wgwOrderDetail);

    /**
     * 新增数据
     *
     * @param wgwOrderDetail 实例对象
     * @return 影响行数
     */
    int insert(WgwOrderDetail wgwOrderDetail);

    /**
     * 修改数据
     *
     * @param wgwOrderDetail 实例对象
     * @return 影响行数
     */
    int update(WgwOrderDetail wgwOrderDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}