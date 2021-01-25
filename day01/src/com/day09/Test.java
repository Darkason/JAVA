package com.day09;

public class Test {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 100000; i++) {
            str += 1;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
