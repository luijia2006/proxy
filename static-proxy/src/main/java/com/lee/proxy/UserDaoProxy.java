package com.lee.proxy;

import com.lee.dao.IUserDao;

public class UserDaoProxy implements IUserDao {

    private IUserDao target;            // 被代理对象

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    public int delete(int id) {
        // 前置处理，例如开启事务
        System.out.println("前置处理...");

        // 调用目标对象方法
        int count = target.delete(id);

        // 后置处理，例如提交事务或事务回滚
        System.out.println("前置处理...");
        return count;
    }
}
