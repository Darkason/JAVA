package com.day04;

public class Circle1 {
    public static final double PI = 3.1415d;
    private double r;
    private double perimeter;
    private double area;

    //    无参构造方法
    public Circle1() {
    }

    //    有参构造方法
    public Circle1(double r) {
        this.r = r;
    }

    //    定义方法
    public void showArea() {
        area = 2 * PI * r;
        System.out.println("圆的周长="+area);
    }

    public void showPerimeter() {
        perimeter = PI * r * r;
        System.out.println("圆的面积="+perimeter);
    }

    //    get和set方法
    public static double getPI() {
        return PI;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
