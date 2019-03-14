package com.yunfy.learning.patterns.singleton;

import java.io.Serializable;

/**
 * 推荐使用枚举式单例
 *
 * @author yunfy
 * @create 2019-03-14 20:50
 **/
public enum EnumSingleton implements Serializable {

    /**
     *
     */
    INSTANCE;

    private static Object data = new Object();

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        EnumSingleton.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
