package com.yunfy.learning.patterns.factory.simplefactory;

import com.yunfy.learning.patterns.factory.IBook;

/**
 * @author yunfy
 * @create 2019-03-14 18:21
 **/
public class BookFactory {

    public IBook createBook(Class<? extends IBook> clazz) {

        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
