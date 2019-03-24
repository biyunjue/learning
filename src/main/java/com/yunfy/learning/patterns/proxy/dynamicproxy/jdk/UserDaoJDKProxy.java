package com.yunfy.learning.patterns.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yunfy
 * @create 2019-03-24 20:36
 **/
public class UserDaoJDKProxy implements InvocationHandler {

    private Object target;

    public Object getInstance(Object obj) {
        this.target = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    private void before() {
        System.out.println("before insert handle some logic");
    }

    private void after() {
        System.out.println("after insert handle some logic");
    }
}
