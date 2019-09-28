package com.wgw.biz.service.impl;

import com.wgw.biz.entity.WgwOrderDetail;
import com.wgw.biz.dao.WgwOrderDetailDao;
import com.wgw.biz.service.WgwOrderDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (WgwOrderDetail)表服务实现类
 *
 * @author makejava
 * @since 2019-09-27 16:12:47
 */
@Service("wgwOrderDetailService")
public class WgwOrderDetailServiceImpl implements WgwOrderDetailService {
    @Resource
    private WgwOrderDetailDao wgwOrderDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WgwOrderDetail queryById(Integer id) {
        return this.wgwOrderDetailDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WgwOrderDetail> queryAllByLimit(int offset, int limit) {
        return this.wgwOrderDetailDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param wgwOrderDetail 实例对象
     * @return 实例对象
     */
    @Override
    public WgwOrderDetail insert(WgwOrderDetail wgwOrderDetail) {
        this.wgwOrderDetailDao.insert(wgwOrderDetail);
        return wgwOrderDetail;
    }

    /**
     * 修改数据
     *
     * @param wgwOrderDetail 实例对象
     * @return 实例对象
     */
    @Override
    public WgwOrderDetail update(WgwOrderDetail wgwOrderDetail) {
        this.wgwOrderDetailDao.update(wgwOrderDetail);
        return this.queryById(wgwOrderDetail.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.wgwOrderDetailDao.deleteById(id) > 0;
    }
}