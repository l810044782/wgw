package com.wgw.biz.entity;

import java.io.Serializable;

/**
 * (Advertising)实体类
 *
 * @author makejava
 * @since 2019-09-27 16:14:21
 */
public class Advertising implements Serializable {
    private static final long serialVersionUID = -72421991432872220L;
    //编号
    private Integer id;
    //广告名称
    private String advername;
    //广告位置
    private String adveraddress;
    //开始时间
    private Object advergotime;
    //结束时间
    private Object adverovertime;
    //上线/下线(1:上线 0:下线)
    private Integer advertype;
    //点击次数
    private Integer advernumber;
    //图片
    private String advertopic;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdvername() {
        return advername;
    }

    public void setAdvername(String advername) {
        this.advername = advername;
    }

    public String getAdveraddress() {
        return adveraddress;
    }

    public void setAdveraddress(String adveraddress) {
        this.adveraddress = adveraddress;
    }

    public Object getAdvergotime() {
        return advergotime;
    }

    public void setAdvergotime(Object advergotime) {
        this.advergotime = advergotime;
    }

    public Object getAdverovertime() {
        return adverovertime;
    }

    public void setAdverovertime(Object adverovertime) {
        this.adverovertime = adverovertime;
    }

    public Integer getAdvertype() {
        return advertype;
    }

    public void setAdvertype(Integer advertype) {
        this.advertype = advertype;
    }

    public Integer getAdvernumber() {
        return advernumber;
    }

    public void setAdvernumber(Integer advernumber) {
        this.advernumber = advernumber;
    }

    public String getAdvertopic() {
        return advertopic;
    }

    public void setAdvertopic(String advertopic) {
        this.advertopic = advertopic;
    }

}