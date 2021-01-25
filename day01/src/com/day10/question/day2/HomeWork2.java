package com.day10.question.day2;

import java.util.HashMap;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap();
        while (hashMap.size() < 5) {
            System.out.println("请输入：");
            String stu = scanner.next();
            String[] student = stu.split(",|，");
            hashMap.put(student[0], Integer.parseInt(student[1]));
        }
        Integer max = 0;
        Integer aver = 0;
        for (Integer age : hashMap.values()) {
            if (age > max) {
                max = age;
            }
            aver += age;
        }
        System.out.println("max:"+max+"aver:"+aver/hashMap.size());
    }
}
