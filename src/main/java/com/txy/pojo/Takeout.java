package com.txy.pojo;

import java.util.Date;

/**
 * 出库表
 */
public class Takeout {
    private Integer id;
    private Integer quantity;
    private Date outDate;
    private String handler;
    private Integer productId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }


    public Takeout(){
      super();
    }
    public Takeout(Integer id,Integer quantity,Date outDate,String handler,Integer productId){
        this.id=id;
        this.quantity=quantity;
        this.outDate=outDate;
        this.handler=handler;
        this.productId=productId;
    }

    public Takeout(Integer quantity,Date outDate,String handler,Integer productId){
        this.quantity=quantity;
        this.outDate=outDate;
        this.handler=handler;
        this.productId=productId;
    }

}
