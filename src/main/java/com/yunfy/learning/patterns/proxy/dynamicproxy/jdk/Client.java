package com.yunfy.learning.patterns.proxy.dynamicproxy.jdk;

import com.yunfy.learning.patterns.proxy.UserDAO;
import com.yunfy.learning.patterns.proxy.UserDAOImpl;

/**
 * @author yunfy
 * @create 2019-03-24 20:39
 **/
public class Client {


    public static void main(String[] args) {
        UserDAO userDao = (UserDAO) new UserDaoJDKProxy().getInstance(new UserDAOImpl());

        userDao.insert("jdk", 18);
        System.out.println(userDao.getClass().getName());

    }
}
