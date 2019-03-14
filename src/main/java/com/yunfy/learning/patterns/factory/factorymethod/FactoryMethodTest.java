package com.yunfy.learning.patterns.factory.factorymethod;

import com.yunfy.learning.patterns.factory.IBook;

/**
 * @author yunfy
 * @create 2019-03-14 19:29
 **/
public class FactoryMethodTest {

    public static void main(String[] args) {
        IBookFactory factory = new EnglishBookFactory();
        IBook book = factory.createBook();
        System.out.println(book.readBook());
    }
}
