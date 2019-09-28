package com.wgw.biz.service.impl;

import com.wgw.biz.entity.CouponExtend;
import com.wgw.biz.dao.CouponExtendDao;
import com.wgw.biz.service.CouponExtendService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CouponExtend)表服务实现类
 *
 * @author makejava
 * @since 2019-09-27 16:13:59
 */
@Service("couponExtendService")
public class CouponExtendServiceImpl implements CouponExtendService {
    @Resource
    private CouponExtendDao couponExtendDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CouponExtend queryById(Integer id) {
        return this.couponExtendDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CouponExtend> queryAllByLimit(int offset, int limit) {
        return this.couponExtendDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param couponExtend 实例对象
     * @return 实例对象
     */
    @Override
    public CouponExtend insert(CouponExtend couponExtend) {
        this.couponExtendDao.insert(couponExtend);
        return couponExtend;
    }

    /**
     * 修改数据
     *
     * @param couponExtend 实例对象
     * @return 实例对象
     */
    @Override
    public CouponExtend update(CouponExtend couponExtend) {
        this.couponExtendDao.update(couponExtend);
        return this.queryById(couponExtend.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.couponExtendDao.deleteById(id) > 0;
    }
}