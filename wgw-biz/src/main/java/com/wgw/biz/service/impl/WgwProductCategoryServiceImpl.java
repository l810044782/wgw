package com.wgw.biz.service.impl;

import com.wgw.biz.entity.WgwProductCategory;
import com.wgw.biz.dao.WgwProductCategoryDao;
import com.wgw.biz.service.WgwProductCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (WgwProductCategory)表服务实现类
 *
 * @author makejava
 * @since 2019-09-27 16:13:02
 */
@Service("wgwProductCategoryService")
public class WgwProductCategoryServiceImpl implements WgwProductCategoryService {
    @Resource
    private WgwProductCategoryDao wgwProductCategoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WgwProductCategory queryById(Integer id) {
        return this.wgwProductCategoryDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WgwProductCategory> queryAllByLimit(int offset, int limit) {
        return this.wgwProductCategoryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param wgwProductCategory 实例对象
     * @return 实例对象
     */
    @Override
    public WgwProductCategory insert(WgwProductCategory wgwProductCategory) {
        this.wgwProductCategoryDao.insert(wgwProductCategory);
        return wgwProductCategory;
    }

    /**
     * 修改数据
     *
     * @param wgwProductCategory 实例对象
     * @return 实例对象
     */
    @Override
    public WgwProductCategory update(WgwProductCategory wgwProductCategory) {
        this.wgwProductCategoryDao.update(wgwProductCategory);
        return this.queryById(wgwProductCategory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.wgwProductCategoryDao.deleteById(id) > 0;
    }
}