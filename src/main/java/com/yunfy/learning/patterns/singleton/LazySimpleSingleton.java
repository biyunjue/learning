package com.yunfy.learning.patterns.singleton;

/**
 * 懒汉式单例
 * 外部需要时初始化，简单实现
 *
 * @author yunfy
 * @create 2019-03-14 20:05
 **/
public class LazySimpleSingleton {

    private static LazySimpleSingleton INSTANCE;

    private LazySimpleSingleton() {
    }


    public static synchronized LazySimpleSingleton getInstance() {
        //可能出现线程安全隐患，需要加上synchronized关键字
        if (INSTANCE == null) {
            INSTANCE = new LazySimpleSingleton();
        }
        return INSTANCE;
    }
}
