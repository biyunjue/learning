package com.yunfy.learning.patterns.prototype.simple;

import org.junit.Test;

public class SimplePrototypeTest {

    @Test
    public void copy() throws CloneNotSupportedException {
        Student studentA = new Student();
        studentA.setAge(10);
        studentA.setName("李明");
        studentA.setScore(88);

        Book mathBook = new Book("math", 100);
        studentA.setBook(mathBook);

        //浅克隆，引用对象只克隆了地址
        Student studentB = studentA.simpleCopy();
        System.out.println("studentA ---------------------" + studentA);
        System.out.println("studentB ---------------------" + studentB);

        studentB.setAge(12);
        studentB.setName("小红");
        studentB.setScore(99);

        studentB.getBook().setBookName("english");
        studentB.getBook().setPage(200);

        System.out.println("------------------------change ---------------------");

        System.out.println("studentA ---------------------" + studentA);
        System.out.println("studentB ---------------------" + studentB);
    }
}