package com.yunfy.learning.patterns.singleton;

import java.io.Serializable;

/**
 * 静态内部类单例模式
 * 这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
 *
 * @author yunfy
 * @create 2019-03-14 20:13
 **/
public class StaticInnerClassSingleton implements Serializable {


    private StaticInnerClassSingleton() {
        if (InnerClass.INSTANCE != null) {
            //防止反射破坏单例
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    /**
     * static是为了使单例的空间共享
     *
     * @return
     */
    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.INSTANCE;
    }

    /**
     * 默认不加载
     */
    private static class InnerClass {
        private static StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }
}
