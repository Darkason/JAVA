package com.day01;

public class Test01 {
    public static void main(String[] args) {
//        System.out.println("中");
//        String str = "23456789wertyui#$$";
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (65<c && c<90 || 97<c && c<122){
//                System.out.println(c);
//            }else
//                System.out.println("去你妈的");
//        }

        int a = 10;
        int b = 10;
        int c = 10;
        a = b++;  //a=10 , b=11
        c = --a;  //a=9 , c=9
        b = ++a;  //b=10 , a=10
        a = c--;  //a=9 , c=8 , b=10

        System.out.println(a);      //?
        System.out.println(b);      //?
        System.out.println(c);      //?
    }
}
