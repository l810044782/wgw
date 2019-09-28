package com.wgw.biz.service;

import com.wgw.biz.entity.User;
import com.wgw.utils.page.PageRequest;
import com.wgw.utils.page.PageResult;
import com.wgw.utils.service.CurdService;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2019-09-27 16:10:15
 */
public interface UserService extends CurdService<User>{

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<User> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User update(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    @Override
    int save(User record);

    @Override
    int delete(User record);

    @Override
    User findById(Long id);

    @Override
    PageResult findPage(PageRequest pageRequest);
}