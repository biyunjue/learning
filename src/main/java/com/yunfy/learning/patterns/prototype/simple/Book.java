package com.yunfy.learning.patterns.prototype.simple;

/**
 * @author yunfy
 * @create 2019-03-16 14:01
 **/
public class Book {

    private String bookName;
    private int page;

    public Book(String bookName, int page) {
        this.bookName = bookName;
        this.page = page;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", page=" + page +
                '}';
    }
}
