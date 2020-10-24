package com.study.Proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 基于类的动态代理
 *
 * @author 18482
 */
public class ClassProxy implements MethodInterceptor {
    private final Object target;

    ClassProxy(Object t) {
        this.target = t;
    }

    /**
     * 方法增强
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法执行前要做的事");
        Object returnValue = method.invoke(target, objects);
        System.out.println("方法执行后所要做的事");
        return returnValue;
    }

    /**
     * 给目标对象创建一个代理对象
     *
     * @return
     */
    public Object getProxyInstance() {
        //工具类
        Enhancer en = new Enhancer();
        //设置父类
        en.setSuperclass(target.getClass());
        //设置回调函数
        en.setCallback(this);
        //创建子类代理对象
        return en.create();
    }
}
