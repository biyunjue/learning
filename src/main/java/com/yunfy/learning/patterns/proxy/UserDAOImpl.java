package com.yunfy.learning.patterns.proxy;

/**
 * @author yunfy
 * @create 2019-03-23 23:27
 **/
public class UserDAOImpl implements UserDAO {


    @Override
    public boolean insert(String name, int age) {
        System.out.println("insert to database name=" + name + " age=" + age);
        return true;
    }
}
