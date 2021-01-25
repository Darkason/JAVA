package com.day16.homework;

public class HomeWork1 {
    public static void main(String[] args) {
        int sum = sum(100);
        System.out.println(sum);
    }
    public static int sum(int i){
        if (i<=0){
            return 0;
        }
        int rt = i+sum(--i);
        return rt;
    }
}
