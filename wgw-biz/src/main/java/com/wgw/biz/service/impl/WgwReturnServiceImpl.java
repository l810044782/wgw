package com.wgw.biz.service.impl;

import com.wgw.biz.entity.WgwReturn;
import com.wgw.biz.dao.WgwReturnDao;
import com.wgw.biz.service.WgwReturnService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (WgwReturn)表服务实现类
 *
 * @author makejava
 * @since 2019-09-27 16:13:38
 */
@Service("wgwReturnService")
public class WgwReturnServiceImpl implements WgwReturnService {
    @Resource
    private WgwReturnDao wgwReturnDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WgwReturn queryById(Integer id) {
        return this.wgwReturnDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WgwReturn> queryAllByLimit(int offset, int limit) {
        return this.wgwReturnDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param wgwReturn 实例对象
     * @return 实例对象
     */
    @Override
    public WgwReturn insert(WgwReturn wgwReturn) {
        this.wgwReturnDao.insert(wgwReturn);
        return wgwReturn;
    }

    /**
     * 修改数据
     *
     * @param wgwReturn 实例对象
     * @return 实例对象
     */
    @Override
    public WgwReturn update(WgwReturn wgwReturn) {
        this.wgwReturnDao.update(wgwReturn);
        return this.queryById(wgwReturn.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.wgwReturnDao.deleteById(id) > 0;
    }
}