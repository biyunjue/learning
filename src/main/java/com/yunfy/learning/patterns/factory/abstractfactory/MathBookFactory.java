package com.yunfy.learning.patterns.factory.abstractfactory;

import com.yunfy.learning.patterns.factory.HighLevel;
import com.yunfy.learning.patterns.factory.IBook;
import com.yunfy.learning.patterns.factory.ILevel;
import com.yunfy.learning.patterns.factory.MathBook;


/**
 * @author yunfy
 * @create 2019-03-14 19:06
 **/
public class MathBookFactory implements IBookFactory {

    public IBook createBook() {
        return new MathBook();
    }

    public ILevel createLevel() {
        return new HighLevel();
    }
}
