package com.sx.pojo;

public class Product {
    private int id;
    private String name;
    private double oprice;
    private double nprice;
    private int count;
    private String photo; 
    private int tid;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getOprice() {
        return oprice;
    }
    public void setOprice(double oprice) {
        this.oprice = oprice;
    }
    public double getNprice() {
        return nprice;
    }
    public void setNprice(double nprice) {
        this.nprice = nprice;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public int getTid() {
        return tid;
    }
    public void setTid(int tid) {
        this.tid = tid;
    }
}
