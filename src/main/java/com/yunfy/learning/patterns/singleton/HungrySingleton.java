package com.yunfy.learning.patterns.singleton;

import java.io.Serializable;

/**
 * 饿汉式单例模式
 * 优点：没有加任何的锁、执行效率比较高，在用户体验上来说，比懒汉式更好。
 * 缺点：类加载的时候就初始化，不管用与不用都占着空间，浪费了内存，有可能占着茅坑不拉屎
 *
 * @author yunfy
 * @create 2019-03-14 20:00
 **/
public class HungrySingleton implements Serializable {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    /**
     * 私有成员变量
     */
    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }

    /**
     * 解决反射破坏
     *
     * @return
     */
    public Object readResolve() {
        return INSTANCE;
    }
}
