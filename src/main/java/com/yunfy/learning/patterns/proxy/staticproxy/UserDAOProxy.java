package com.yunfy.learning.patterns.proxy.staticproxy;

import com.yunfy.learning.patterns.proxy.UserDAO;
import com.yunfy.learning.patterns.proxy.UserDAOImpl;

/**
 * 代理类
 *
 * @author yunfy
 * @create 2019-03-23 23:31
 **/
public class UserDAOProxy implements UserDAO {

    /**
     * 持有被代理类的引用
     */
    private UserDAOImpl userDAO;

    public UserDAOProxy(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public boolean insert(String name, int age) {
        System.out.println("before insert handle some logic");
        return userDAO.insert(name, age);
    }
}
