package com.yunfy.learning.patterns.factory.factorymethod;

import com.yunfy.learning.patterns.factory.EnglishBook;
import com.yunfy.learning.patterns.factory.IBook;

/**
 * @author yunfy
 * @create 2019-03-14 19:06
 **/
public class EnglishBookFactory implements IBookFactory {

    public IBook createBook() {
        return new EnglishBook();
    }
}
