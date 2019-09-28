package com.wgw.biz.dao;

import com.wgw.biz.entity.CouponExtend;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (CouponExtend)表数据库访问层
 *
 * @author makejava
 * @since 2019-09-27 16:13:59
 */
public interface CouponExtendDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CouponExtend queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CouponExtend> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param couponExtend 实例对象
     * @return 对象列表
     */
    List<CouponExtend> queryAll(CouponExtend couponExtend);

    /**
     * 新增数据
     *
     * @param couponExtend 实例对象
     * @return 影响行数
     */
    int insert(CouponExtend couponExtend);

    /**
     * 修改数据
     *
     * @param couponExtend 实例对象
     * @return 影响行数
     */
    int update(CouponExtend couponExtend);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}