package com.wgw.biz.entity;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author makejava
 * @since 2019-09-27 16:09:57
 */
public class Role implements Serializable {
    private static final long serialVersionUID = -52934683878718152L;
    
    private Integer id;
    
    private String name;
    
    private String namezh;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamezh() {
        return namezh;
    }

    public void setNamezh(String namezh) {
        this.namezh = namezh;
    }

}