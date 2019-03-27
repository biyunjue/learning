package com.yunfy.learning.patterns.observer;

import com.google.common.eventbus.Subscribe;

/**
 * @author yunfy
 * @create 2019-03-27 21:29
 **/
public class GuavaGPer {

    private String name = "咕泡社区";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Subscribe
    public void publisQuestion(Question question) {
        System.out.println(question.getUsername() + "在社区发布了问题,内容是：" + question.getContext());
    }
}
