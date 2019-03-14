package com.yunfy.learning.patterns.factory.factorymethod;

import com.yunfy.learning.patterns.factory.IBook;
import com.yunfy.learning.patterns.factory.MathBook;

/**
 * @author yunfy
 * @create 2019-03-14 19:06
 **/
public class MathBookFactory implements IBookFactory {

    public IBook createBook() {
        return new MathBook();
    }
}
