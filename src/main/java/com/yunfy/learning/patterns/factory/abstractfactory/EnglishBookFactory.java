package com.yunfy.learning.patterns.factory.abstractfactory;

import com.yunfy.learning.patterns.factory.EnglishBook;
import com.yunfy.learning.patterns.factory.IBook;
import com.yunfy.learning.patterns.factory.ILevel;
import com.yunfy.learning.patterns.factory.LowLevel;

/**
 * @author yunfy
 * @create 2019-03-14 19:06
 **/
public class EnglishBookFactory implements IBookFactory {

    public IBook createBook() {
        return new EnglishBook();
    }

    public ILevel createLevel() {
        return new LowLevel();
    }
}
