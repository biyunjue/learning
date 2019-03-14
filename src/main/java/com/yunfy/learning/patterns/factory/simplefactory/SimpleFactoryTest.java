package com.yunfy.learning.patterns.factory.simplefactory;

import com.yunfy.learning.patterns.factory.IBook;
import com.yunfy.learning.patterns.factory.MathBook;

/**
 * @author yunfy
 * @create 2019-03-14 18:53
 **/
public class SimpleFactoryTest {

    public static void main(String[] args) {
        BookFactory factory = new BookFactory();
        IBook book = factory.createBook(MathBook.class);
        System.out.println(book.readBook());
    }
}
