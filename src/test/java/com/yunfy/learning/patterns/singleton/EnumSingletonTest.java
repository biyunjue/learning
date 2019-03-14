package com.yunfy.learning.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class EnumSingletonTest {

    @Test
    public void testSeriable() {
        //枚举式单例无法被序列化破坏 也无法被反射破坏
        EnumSingleton instance = EnumSingleton.getInstance();
        EnumSingleton instance2 = null;
        FileOutputStream fos = null;
        try {
            //序列化破坏单例
            fos = new FileOutputStream("HungrySingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("HungrySingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance2 = (EnumSingleton) ois.readObject();
            System.out.println(instance);
            System.out.println(instance2);
            Assert.assertEquals(instance, instance2);
            Assert.assertEquals(instance.getData(), instance2.getData());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}