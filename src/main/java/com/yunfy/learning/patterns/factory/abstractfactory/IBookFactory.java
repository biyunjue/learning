package com.yunfy.learning.patterns.factory.abstractfactory;


import com.yunfy.learning.patterns.factory.IBook;
import com.yunfy.learning.patterns.factory.ILevel;

public interface IBookFactory {

    IBook createBook();

    ILevel createLevel();
}
