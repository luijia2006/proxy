package com.lee.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理逻辑实现 - 事务逻辑
 * 此handler不仅仅只是适用UserDao，还适用于其他所有的Dao
 */
public class TrasactionInvocationHandler implements InvocationHandler {

    private Object target;

    public TrasactionInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy     代理类执行，链式编程的情况下会用到
     * @param method    目标方法
     * @param args      目标方法参数
     * @return          需要根据具体情况来定，可能是proxy，可能是mehtod的返回值(void和非void)
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 前置处理，例如开启事务
        System.out.println("开启事务...");

        // 调用目标对象方法
        Object result = method.invoke(target, args);

        // 后置处理，例如提交事务或事务回滚
        System.out.println("提交事务或事务回滚...");
        return result;
    }
}
