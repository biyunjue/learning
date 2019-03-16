package com.yunfy.learning.patterns.prototype.deep;


import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeepCopyTest {
    @Test
    public void copy() throws Exception {
        Student studentA = new Student();
        studentA.setAge(10);
        studentA.setName("李明");
        studentA.setScore(88);

        Book mathBook = new Book("math", 100);
        studentA.setBook(mathBook);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(studentA);

        byte[] buffer = byteArrayOutputStream.toByteArray();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buffer);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Student studentB = (Student) objectInputStream.readObject();

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