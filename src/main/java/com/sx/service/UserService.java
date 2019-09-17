package com.sx.service;

import com.sx.pojo.User;

public interface UserService {

    /**
     * 获取信息
     * @param telephone
     * @return
     */
    User getByTel(String telephone);
}
