package com.yunfy.learning.patterns.singleton;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例模式
 *
 * @author yunfy
 * @create 2019-03-14 20:45
 **/
public class ContainerSingleton {
    private static final ConcurrentHashMap<String, ContainerSingleton> CONTAINER = new ConcurrentHashMap<>();

    private ContainerSingleton() {
    }

    public static ContainerSingleton getInstance(String className) {
        synchronized (CONTAINER) {
            if (!CONTAINER.containsKey(className)) {
                ContainerSingleton containerSingleton = new ContainerSingleton();
                CONTAINER.put(className, containerSingleton);
                return containerSingleton;
            } else {
                return CONTAINER.get(className);
            }
        }
    }
}
