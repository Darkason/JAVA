package com.day04;

public class BookClass {
    private int number;
    private String name;
    private String ISBN;
    private float price;
    private int years;
    private int month;
    private int day;

    public void showBook() {
        System.out.println("最贵的书是：图书编号:" + number + ",书名:" + name + ",ISBN编码:" + ISBN + "，价格：" + price + "元，出版日期：" + years + "年" + month + "月" + day + "日");
    }

    public BookClass(){}

    public BookClass(int number, String name, String ISBN, float price, int years, int month, int day) {
        this.number = number;
        this.name = name;
        this.ISBN = ISBN;
        this.price = price;
        this.years = years;
        this.month = month;
        this.day = day;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
