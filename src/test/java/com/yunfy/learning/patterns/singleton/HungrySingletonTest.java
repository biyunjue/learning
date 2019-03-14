package com.yunfy.learning.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class HungrySingletonTest {

    @Test
    public void getInstance() {
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        Assert.assertEquals(instance, instance2);
    }

    @Test
    public void testSeriable() {
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton instance2 = null;
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
            instance2 = (HungrySingleton) ois.readObject();
            System.out.println(instance);
            System.out.println(instance2);
            Assert.assertEquals(instance, instance2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}