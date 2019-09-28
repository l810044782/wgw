package com.wgw.biz.service.impl;

import com.wgw.biz.entity.WgwProduct;
import com.wgw.biz.dao.WgwProductDao;
import com.wgw.biz.service.WgwProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (WgwProduct)表服务实现类
 *
 * @author makejava
 * @since 2019-09-27 16:12:55
 */
@Service("wgwProductService")
public class WgwProductServiceImpl implements WgwProductService {
    @Resource
    private WgwProductDao wgwProductDao;

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    @Override
    public WgwProduct queryById(Integer id) {
        return this.wgwProductDao.queryById();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WgwProduct> queryAllByLimit(int offset, int limit) {
        return this.wgwProductDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param wgwProduct 实例对象
     * @return 实例对象
     */
    @Override
    public WgwProduct insert(WgwProduct wgwProduct) {
        this.wgwProductDao.insert(wgwProduct);
        return wgwProduct;
    }

    /**
     * 修改数据
     *
     * @param wgwProduct 实例对象
     * @return 实例对象
     */
    @Override
    public WgwProduct update(WgwProduct wgwProduct) {
        this.wgwProductDao.update(wgwProduct);
        return this.queryById(wgwProduct.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.wgwProductDao.deleteById() > 0;
    }
}