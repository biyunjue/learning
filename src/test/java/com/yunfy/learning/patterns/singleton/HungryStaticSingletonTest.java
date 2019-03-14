package com.yunfy.learning.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HungryStaticSingletonTest {

    @Test
    public void getInstance() {
        HungryStaticSingleton instance = HungryStaticSingleton.getInstance();
        HungryStaticSingleton instance2 = HungryStaticSingleton.getInstance();
        Assert.assertEquals(instance, instance2);
    }
}