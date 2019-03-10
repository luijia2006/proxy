package com.lee.mapper.impl;

import com.lee.mapper.IUserDao;

public class UserDaoImpl implements IUserDao {

    public int delete(int id) {
        System.out.println("正常实现, 删除用户操作");
        return 0;
    }
}
