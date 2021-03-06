package com.wgw.biz.service;

import com.wgw.biz.entity.Coupon;
import java.util.List;

/**
 * (Coupon)表服务接口
 *
 * @author makejava
 * @since 2019-09-27 16:14:07
 */
public interface CouponService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Coupon queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Coupon> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param coupon 实例对象
     * @return 实例对象
     */
    Coupon insert(Coupon coupon);

    /**
     * 修改数据
     *
     * @param coupon 实例对象
     * @return 实例对象
     */
    Coupon update(Coupon coupon);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}