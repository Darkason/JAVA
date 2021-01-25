package com.day09.question;

import java.util.Random;

public class HomeWork2 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Integer integer = random.nextInt(10) + 1;
            System.out.println(integer);
        }
    }
}
