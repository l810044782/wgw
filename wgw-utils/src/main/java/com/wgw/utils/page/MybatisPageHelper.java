package com.wgw.utils.page;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wgw.utils.util.ReflectionUtils;

import java.util.List;

/**
 * 分页查询助手
 */
public class MybatisPageHelper {
    public static final String findPage="findPage";

    /**
     * 分页查询，约定查询方法名为findPage
     * @param pageRequest
     * @param mapper
     * @return
     */
    public static PageResult findPage(PageRequest pageRequest,Object mapper){
        return findPage(pageRequest,mapper,findPage);
    }


    @SuppressWarnings({"unchecked","rawtypes"})
    public static PageResult findPage(PageRequest pageRequest,Object mapper,String queryMethodName,Object... args){
        //设置分页参数
        int pageNum=pageRequest.getPageNum();
        int pageSize=pageRequest.getPageSize();
        PageHelper.startPage(pageNum,pageSize);
        //利用反射调查查询方法
        Object result= ReflectionUtils.invoke(mapper,queryMethodName,args);
        return getPageResult(pageRequest,new PageInfo((List)result));
    }

    /**
     * 将分页信息封装到统一的接口
     * @param pageRequest
     * @param pageInfo
     * @return
     */
    private static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo){
        PageResult pageResult=new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalPages(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }

}
