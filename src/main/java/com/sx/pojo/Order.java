package com.sx.pojo;

import java.util.Date;

public class Order {

    private int orderid;
    private int uid;
    private double price;
    private Date createtime;
    private Date endtime;
    private int status;
    
    public int getOrderid() {
        return orderid;
    }
    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Date getCreatetime() {
        return createtime;
    }
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
    public Date getEndtime() {
        return endtime;
    }
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
}
