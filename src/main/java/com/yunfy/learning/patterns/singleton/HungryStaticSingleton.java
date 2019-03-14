package com.yunfy.learning.patterns.singleton;

/**
 * 饿汉式单例模式
 * 优点：没有加任何的锁、执行效率比较高，在用户体验上来说，比懒汉式更好。
 * 缺点：类加载的时候就初始化，不管用与不用都占着空间，浪费了内存，有可能占着茅坑不拉屎
 *
 * @author yunfy
 * @create 2019-03-14 20:00
 **/
public class HungryStaticSingleton {

    private static final HungryStaticSingleton INSTANCE;

    static {
        INSTANCE = new HungryStaticSingleton();
    }

    /**
     * 私有成员变量
     */
    private HungryStaticSingleton() {

    }

    public static HungryStaticSingleton getInstance() {
        return INSTANCE;
    }
}
