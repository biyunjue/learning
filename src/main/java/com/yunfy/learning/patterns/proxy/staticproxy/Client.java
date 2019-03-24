package com.yunfy.learning.patterns.proxy.staticproxy;

import com.yunfy.learning.patterns.proxy.UserDAOImpl;

/**
 * @author yunfy
 * @create 2019-03-23 23:33
 **/
public class Client {


    public static void main(String[] args) {
        UserDAOImpl conreteUserDAO = new UserDAOImpl();
        UserDAOProxy userDAOProxy = new UserDAOProxy(conreteUserDAO);
        userDAOProxy.insert("dynamo", 18);
    }

}
