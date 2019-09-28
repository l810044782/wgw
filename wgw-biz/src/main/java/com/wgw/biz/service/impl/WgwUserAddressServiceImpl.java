package com.wgw.biz.service.impl;

import com.wgw.biz.entity.WgwUserAddress;
import com.wgw.biz.dao.WgwUserAddressDao;
import com.wgw.biz.service.WgwUserAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (WgwUserAddress)表服务实现类
 *
 * @author makejava
 * @since 2019-09-27 16:13:49
 */
@Service("wgwUserAddressService")
public class WgwUserAddressServiceImpl implements WgwUserAddressService {
    @Resource
    private WgwUserAddressDao wgwUserAddressDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WgwUserAddress queryById(Integer id) {
        return this.wgwUserAddressDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WgwUserAddress> queryAllByLimit(int offset, int limit) {
        return this.wgwUserAddressDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param wgwUserAddress 实例对象
     * @return 实例对象
     */
    @Override
    public WgwUserAddress insert(WgwUserAddress wgwUserAddress) {
        this.wgwUserAddressDao.insert(wgwUserAddress);
        return wgwUserAddress;
    }

    /**
     * 修改数据
     *
     * @param wgwUserAddress 实例对象
     * @return 实例对象
     */
    @Override
    public WgwUserAddress update(WgwUserAddress wgwUserAddress) {
        this.wgwUserAddressDao.update(wgwUserAddress);
        return this.queryById(wgwUserAddress.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.wgwUserAddressDao.deleteById(id) > 0;
    }
}