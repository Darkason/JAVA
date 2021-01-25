package com.day09;

public class Test03 {
    public static void main(String[] args) {
        Integer i = 1 + 1;
        Integer i2 = new Integer(11);
        Integer i3 = Integer.valueOf(111);
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        int a = i;
        int a2 = i2.intValue();
        System.out.println(a);
        System.out.println(a2);
    }
}
