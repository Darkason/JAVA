package com.day04.HomeWork;

import com.day04.BookClass;

public class Book {
    public static void main(String[] args) {
        BookClass bookClass = new BookClass(001,"三国演义","978-7-5101-3674-0",400,2010,6,1);
        BookClass bookClass1 = new BookClass(002,"水浒传","7-02-003608-2",200,1975,10,1);
        BookClass bookClass2 = new BookClass(003,"红楼梦","978-7-5422-4811-1",100,1798,10,1);

        float price1=bookClass.getPrice();
        float price2=bookClass1.getPrice();
        float price3=bookClass2.getPrice();
        if (price1 > price2) {
            if (price1 > price3) {
                bookClass.showBook();
            }
        } else {
            if (price2 > price3) {
                bookClass1.showBook();
            } else {
                bookClass2.showBook();
            }
        }
    }
}
