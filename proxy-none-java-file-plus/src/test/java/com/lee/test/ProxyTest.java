package com.lee.test;

import com.lee.mapper.UserMapper;
import com.lee.proxy.InvocationHandler;
import com.lee.proxy.Proxy;

public class ProxyTest {

    public static void main(String[] args) throws Exception {
        InvocationHandler mapperProxy = new MapperProxy();
        UserMapper userMapper = Proxy.newInstance(UserMapper.class, mapperProxy);
        System.out.println(userMapper.delete(1));
        System.out.println("=================");
        System.out.println(userMapper.getUserById(1));
    }
}
