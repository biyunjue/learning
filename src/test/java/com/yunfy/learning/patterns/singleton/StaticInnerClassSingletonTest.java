package com.yunfy.learning.patterns.singleton;


import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class StaticInnerClassSingletonTest {

    @Test
    public void getInstance() {
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton instance2 = StaticInnerClassSingleton.getInstance();

        try {
            Class<?> clazz = StaticInnerClassSingleton.class;
            Constructor<?> con = clazz.getDeclaredConstructor(null);
            con.setAccessible(true);
            StaticInnerClassSingleton instance3 = (StaticInnerClassSingleton) con.newInstance();
            //反射破坏了单例模式
            Assert.assertEquals(instance, instance3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(instance, instance2);
    }
}