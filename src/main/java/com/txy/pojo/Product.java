package com.txy.pojo;

/**
 * 商品表
 */
public class Product {
    private Integer id;
    private String productName;
    private Integer quantity;

    public Product(){

    }
    public Product(Integer id,String productName,Integer quantity){
        this.id=id;
        this.productName=productName;
        this.quantity=quantity;
    }

    public Product(String productName,Integer quantity){
        this.productName=productName;
        this.quantity=quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {

        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
