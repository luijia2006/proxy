package com.lee.test;

import com.lee.mapper.UserMapper;
import com.lee.proxy.InvocationHandler;
import com.lee.proxy.Proxy;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void test() throws Exception {
        // InvocationHandler mapperProxy = new MapperProxy();
        InvocationHandler mapperProxy = new DaoProxy();
        UserMapper userMapper = Proxy.newInstance(UserMapper.class, mapperProxy);
        System.out.println(userMapper.delete(1));
        System.out.println("=================");
        System.out.println(userMapper.getUserById(1));
    }
}
