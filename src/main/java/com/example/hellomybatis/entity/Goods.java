package com.example.hellomybatis.entity;

public class Goods {
    private Integer goodsId;
    private Integer cateId;
    private String goodsName;
    private String goodsDisc;
    private float goodsPrice;
    private float goodsDiscount;
    private Integer stock;
    private String goodsOrigin;
    private String goodsMaterial;
    private float goodsPostalfee;
    private String goodsDate;
    private Integer goodsSales;
    private String goodsPic;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsDisc() {
        return goodsDisc;
    }

    public void setGoodsDisc(String goodsDisc) {
        this.goodsDisc = goodsDisc;
    }

    public float getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public float getGoodsDiscount() {
        return goodsDiscount;
    }

    public void setGoodsDiscount(float goodsDiscount) {
        this.goodsDiscount = goodsDiscount;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getGoodsOrigin() {
        return goodsOrigin;
    }

    public void setGoodsOrigin(String goodsOrigin) {
        this.goodsOrigin = goodsOrigin;
    }

    public String getGoodsMaterial() {
        return goodsMaterial;
    }

    public void setGoodsMaterial(String goodsMaterial) {
        this.goodsMaterial = goodsMaterial;
    }

    public float getGoodsPostalfee() {
        return goodsPostalfee;
    }

    public void setGoodsPostalfee(float goodsPostalfee) {
        this.goodsPostalfee = goodsPostalfee;
    }

    public String getGoodsDate() {
        return goodsDate;
    }

    public void setGoodsDate(String goodsDate) {
        this.goodsDate = goodsDate;
    }

    public Integer getGoodsSales() {
        return goodsSales;
    }

    public void setGoodsSales(Integer goodsSales) {
        this.goodsSales = goodsSales;
    }

    public String getGoodsPic() {
        return goodsPic;
    }

    public void setGoodsPic(String goodsPic) {
        this.goodsPic = goodsPic;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", cateId=" + cateId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsDisc='" + goodsDisc + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsDiscount=" + goodsDiscount +
                ", stock=" + stock +
                ", goodsOrigin='" + goodsOrigin + '\'' +
                ", goodsMaterial='" + goodsMaterial + '\'' +
                ", goodsPostalfee=" + goodsPostalfee +
                ", goodsDate='" + goodsDate + '\'' +
                ", goodsSales=" + goodsSales +
                ", goodsPic='" + goodsPic + '\'' +
                '}'+"\n";
    }
}
