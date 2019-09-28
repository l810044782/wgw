package com.wgw.biz.entity;

import java.io.Serializable;

/**
 * (WgwProduct)实体类
 *
 * @author makejava
 * @since 2019-09-27 16:12:55
 */
public class WgwProduct implements Serializable {
    private static final long serialVersionUID = -61639517780682752L;
    //主键
    private Integer id;
    //名称
    private String name;
    //品牌
    private String brand;
    //价格
    private Object price;
    //货号
    private String articleNumber;
    //库存
    private Integer stock;
    //分类1
    private Integer categorylevel1id;
    //分类2
    private Integer categorylevel12d;
    //文件名称
    private String filename;
    //是否上架(1：上架 0：未上架)
    private Integer isup;
    //是否为新品(1:新品 0:非新品)
    private Integer isnewProduct;
    //是否新品推荐(1:推荐 0:非推荐)
    private Integer isnewrecommend;
    //是否人气推荐(1:推荐 0:未推荐)
    private Integer ismoodsrecommend;
    //销量
    private Integer salesVolume;
    //审核状态(1:已审核 0:未审核)
    private Integer checkStatus;
    //商品重量(kg)
    private Object weightgoods;


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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getCategorylevel1id() {
        return categorylevel1id;
    }

    public void setCategorylevel1id(Integer categorylevel1id) {
        this.categorylevel1id = categorylevel1id;
    }

    public Integer getCategorylevel12d() {
        return categorylevel12d;
    }

    public void setCategorylevel12d(Integer categorylevel12d) {
        this.categorylevel12d = categorylevel12d;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Integer getIsup() {
        return isup;
    }

    public void setIsup(Integer isup) {
        this.isup = isup;
    }

    public Integer getIsnewProduct() {
        return isnewProduct;
    }

    public void setIsnewProduct(Integer isnewProduct) {
        this.isnewProduct = isnewProduct;
    }

    public Integer getIsnewrecommend() {
        return isnewrecommend;
    }

    public void setIsnewrecommend(Integer isnewrecommend) {
        this.isnewrecommend = isnewrecommend;
    }

    public Integer getIsmoodsrecommend() {
        return ismoodsrecommend;
    }

    public void setIsmoodsrecommend(Integer ismoodsrecommend) {
        this.ismoodsrecommend = ismoodsrecommend;
    }

    public Integer getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(Integer salesVolume) {
        this.salesVolume = salesVolume;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Object getWeightgoods() {
        return weightgoods;
    }

    public void setWeightgoods(Object weightgoods) {
        this.weightgoods = weightgoods;
    }

}