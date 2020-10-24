package com.study.Proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 基于接口的动态代理
 *
 * @author 18482
 */
public class ApiProxy implements InvocationHandler {

    private final Object taregt;

    ApiProxy(Object t) {
        this.taregt = t;
    }

    /**
     * 提供给外部调用
     *
     * @return
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(taregt.getClass().getClassLoader(), taregt.getClass().getInterfaces(), this);
    }

    /**
     * 增强的方法
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行前的操作！");
        Object returnValue = method.invoke(taregt, args);
        System.out.println("执行后的操作！");
        return returnValue;
    }
}
