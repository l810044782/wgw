package com.wgw.utils.service;


import com.wgw.utils.page.PageRequest;
import com.wgw.utils.page.PageResult;

public interface CurdService<T> {
    /**
     * 保存操作
     * @param record
     */
    int save(T record);

    /**
     * 删除操作
     * @param record
     * @return
     */
    int delete(T record);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    T findById(Long id);

    /**
     * 分页查询
     * 这里统一封账了分页请求和结果，避免直接引入具体框架的分页对象
     * 如MyBatis或JPA的分页对象从而避免因为替换ORM框架而导致服务层、
     * 控制层的分页接口也需要变动的情况，替换ORM框架也不会影响服务层以上的分页接口
     * 起到了解耦的作用
     * @param pageRequest
     * @return
     */
    PageResult findPage(PageRequest pageRequest);

}
