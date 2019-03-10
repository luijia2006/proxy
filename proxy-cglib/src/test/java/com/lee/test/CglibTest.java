package com.lee.test;

import com.lee.dao.IUserDao;
import com.lee.proxy.DaoMethodInterceptor;
import com.lee.proxy.DaoProxyFactory;
import net.sf.cglib.proxy.MethodInterceptor;
import org.junit.Test;

public class CglibTest {

    @Test
    public void cglibTest() {
        MethodInterceptor interceptor = new DaoMethodInterceptor();

        IUserDao userDao = DaoProxyFactory.newInstance(IUserDao.class, interceptor);
        int result = userDao.delete(1);
        System.out.println("result = " + result);
    }
}
