package com.lee.test;

import com.lee.mapper.UserMapper;
import com.lee.proxy.Proxy;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void proxyTest() throws Exception {
        UserMapper userMapper = Proxy.newInstance(UserMapper.class);
        userMapper.getUserById(12);
    }
}
