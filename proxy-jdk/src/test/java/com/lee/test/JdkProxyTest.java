package com.lee.test;

import com.lee.dao.IUserDao;
import com.lee.dao.impl.UserDaoImpl;
import com.lee.handler.TrasactionInvocationHandler;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JdkProxyTest {

    @Test
    public void testProxy() {
        // 目标对象 - 被代理对象
        IUserDao target = new UserDaoImpl();

        // 事务处理器
        InvocationHandler handler = new TrasactionInvocationHandler(target);


        // 获取代理对象
        IUserDao proxyInstance = (IUserDao) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                target.getClass().getInterfaces(), handler);

        proxyInstance.delete(1);
    }
}
