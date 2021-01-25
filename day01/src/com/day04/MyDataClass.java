package com.day04;

public class MyDataClass {
    private int years;
    private int month;
    private int day;

    public void showDate() {
        System.out.println(years + "年" + month + "月" + day + "日");
    }

    public void isBi() {
        if ((years % 4 == 0 && years % 100 != 0) || years % 400 == 0) {
            System.out.println(years + "是闰年");
        } else
            System.out.println(years + "不是闰年");
    }

    public MyDataClass(int years, int month, int day) {
        this.years = years;
        this.month = month;
        this.day = day;
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

    public void setMobth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
