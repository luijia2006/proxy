package com.lee.test;

import com.lee.mapper.UserMapper;
import com.lee.proxy.MapperProxy;
import com.lee.proxy.MapperProxyFactory;
import org.junit.Test;

public class JdkProxyTest {

    @Test
    public void testProxy() {

        // 代理逻辑处理handler
        MapperProxy mapperProxy = new MapperProxy(UserMapper.class);

        // 代理实例工厂
        MapperProxyFactory proxyFactory = new MapperProxyFactory(UserMapper.class);

        // 获取代理对象
        UserMapper mapper = (UserMapper) proxyFactory.newInstance(mapperProxy);

        int delete = mapper.delete(1);
        System.out.println("result = " + delete);
    }
}
