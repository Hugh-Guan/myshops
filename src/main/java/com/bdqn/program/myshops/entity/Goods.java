package com.bdqn.program.myshops.entity;

import java.util.Date;

public class Goods {
    private int good_id;
    private String goods_name;
    private String brand_name;
    private float price;
    private int is_sale;
    private float original;
    private Date created_at;
    private Date updated_at;
    private String cate_name;
    private String content;
    private String tags;
    private String good_img_pos;
    private String spu_pro_name;
    private String spu_pro_value;
    private int spu_pro_status;
    private String sku_title;
    private int sku_num;
    private String sku_good_code;

    public int getGood_id() {
        return good_id;
    }

    public void setGood_id(int good_id) {
        this.good_id = good_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getIs_sale() {
        return is_sale;
    }

    public void setIs_sale(int is_sale) {
        this.is_sale = is_sale;
    }

    public float getOriginal() {
        return original;
    }

    public void setOriginal(float original) {
        this.original = original;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getCate_name() {
        return cate_name;
    }

    public void setCate_name(String cate_name) {
        this.cate_name = cate_name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getGood_img_pos() {
        return good_img_pos;
    }

    public void setGood_img_pos(String good_img_pos) {
        this.good_img_pos = good_img_pos;
    }

    public String getSpu_pro_name() {
        return spu_pro_name;
    }

    public void setSpu_pro_name(String spu_pro_name) {
        this.spu_pro_name = spu_pro_name;
    }

    public String getSpu_pro_value() {
        return spu_pro_value;
    }

    public void setSpu_pro_value(String spu_pro_value) {
        this.spu_pro_value = spu_pro_value;
    }

    public int getSpu_pro_status() {
        return spu_pro_status;
    }

    public void setSpu_pro_status(int spu_pro_status) {
        this.spu_pro_status = spu_pro_status;
    }

    public String getSku_title() {
        return sku_title;
    }

    public void setSku_title(String sku_title) {
        this.sku_title = sku_title;
    }

    public int getSku_num() {
        return sku_num;
    }

    public void setSku_num(int sku_num) {
        this.sku_num = sku_num;
    }

    public String getSku_good_code() {
        return sku_good_code;
    }

    public void setSku_good_code(String sku_good_code) {
        this.sku_good_code = sku_good_code;
    }
}
