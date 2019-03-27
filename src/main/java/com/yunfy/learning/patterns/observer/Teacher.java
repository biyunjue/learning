package com.yunfy.learning.patterns.observer;

import com.google.common.eventbus.Subscribe;

/**
 * @author yunfy
 * @create 2019-03-27 21:36
 **/
public class Teacher {

    private GuavaGPer guavaGPer;
    private String name;

    public Teacher(GuavaGPer guavaGPer, String name) {
        this.guavaGPer = guavaGPer;
        this.name = name;
    }

    @Subscribe
    public void update(Object arg) {
        Question question = (Question) arg;

        System.out.println(this.name + "您好，您收到一个问题\n 来自" + this.guavaGPer.getName() + ",提问者是：" + question.getUsername() + "，提问内容是：" + question.getContext());
    }
}
