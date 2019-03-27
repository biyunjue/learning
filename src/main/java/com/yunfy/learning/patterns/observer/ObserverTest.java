package com.yunfy.learning.patterns.observer;

import com.google.common.eventbus.EventBus;

/**
 * @author yunfy
 * @create 2019-03-27 21:38
 **/
public class ObserverTest {

    public static void main(String[] args) {

        EventBus eventBus = new EventBus("咕泡社区");
        GuavaGPer gPer = new GuavaGPer();

        Teacher tom = new Teacher(gPer, "Tom");
        Teacher james = new Teacher(gPer, "James");

        Question question = new Question();
        question.setUsername("李明");
        question.setContext("Spring是怎么产生的");


        eventBus.register(tom);
        eventBus.register(james);
        // 必须要先添加观察者,然后再发布内容,不然通知不到观察者
        eventBus.post(question);
    }
}
