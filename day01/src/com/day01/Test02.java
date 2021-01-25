package com.day01;

public class Test02 {
    public static void main(String[] args) {
        System.out.println(feibonaqi(5));
    }

    public static int feibonaqi(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return feibonaqi(num - 1) + feibonaqi(num - 2);
    }
}
