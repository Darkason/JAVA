package com.day09;

import java.util.Random;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        guessNumber();
    }

    public static void guessNumber() {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please Import A Integer");
            int guess = scanner.nextInt();
            if (guess > number) {
                System.out.println("It is too big");
            }
            else if (guess < number) {
                System.out.println("It is too small");
            } else {
                System.out.println("You are right!!! The answer is " + number);
                break;
            }
        }
    }
}
