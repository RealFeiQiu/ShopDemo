package com.sx.dao;

import com.sx.pojo.User;

public interface UserMapper {
    /**
     * 获取信息
     * @param telephone
     * @return
     */
    User getByTel(String telephone);
}
