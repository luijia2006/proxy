package com.lee.test;

import com.lee.dao.IUserDao;
import com.lee.dao.impl.UserDaoImpl;
import com.lee.proxy.UserDaoProxy;
import org.junit.Test;

public class UserDaoTest {

    @Test
    public void testDelete() {
        //目标对象
        IUserDao target = new UserDaoImpl();
        //代理对象
        UserDaoProxy proxy = new UserDaoProxy(target);
        proxy.delete(1);
    }
}
