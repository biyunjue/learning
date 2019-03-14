package com.yunfy.learning.patterns.factory.abstractfactory;

import com.yunfy.learning.patterns.factory.IBook;
import com.yunfy.learning.patterns.factory.ILevel;

/**
 * @author yunfy
 * @create 2019-03-14 19:44
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        IBookFactory factory = new EnglishBookFactory();
        IBook book = factory.createBook();
        ILevel level = factory.createLevel();
        System.out.println(book.readBook());
        System.out.println(level.getLevel());
    }
}
