package com.yunfy.learning.patterns.singleton;

/**
 * 懒汉式单例
 * 双重检查，避免每次都要锁，并且可以保证线程安全
 *
 * @author yunfy
 * @create 2019-03-14 20:05
 **/
public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton INSTANCE;

    private static final Object OBJECT = new Object();

    private LazyDoubleCheckSingleton() {
    }


    public static LazyDoubleCheckSingleton getInstance() {

        if (INSTANCE == null) {
            synchronized (OBJECT) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyDoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
