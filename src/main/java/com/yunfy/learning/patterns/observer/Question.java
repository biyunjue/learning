package com.yunfy.learning.patterns.observer;

/**
 * @author yunfy
 * @create 2019-03-27 21:35
 **/
public class Question {

    /**
     * 提问用户
     */
    private String username;

    /**
     * 提问内容
     */
    private String context;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "Question{" +
                "username='" + username + '\'' +
                ", context='" + context + '\'' +
                '}';
    }
}
