package com.yunfy.learning.patterns.prototype.deep;


import java.io.Serializable;

/**
 * @author yunfy
 * @create 2019-03-16 13:47
 **/
public class Student implements Serializable {
    private Integer age;
    private String name;
    private double score;
    private Book book;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", book=" + book +
                '}';
    }
}
