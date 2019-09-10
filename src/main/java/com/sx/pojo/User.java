package com.sx.pojo;

import java.sql.Date;

public class User {
    
    private int id;
    private String telephone;
    private String password;
    private String password_salt;
    private int sid;
    private int locked;
    private Date createtime;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword_salt() {
        return password_salt;
    }
    public void setPassword_salt(String password_salt) {
        this.password_salt = password_salt;
    }
    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public int getLocked() {
        return locked;
    }
    public void setLocked(int locked) {
        this.locked = locked;
    }
    public Date getCreatetime() {
        return createtime;
    }
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
