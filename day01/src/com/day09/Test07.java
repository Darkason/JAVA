package com.day09;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入出生日期（格式 YYYY-MM-dd）：");
        String born = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = sdf.parse(born);
        Date today = new Date();
        long birthdaySecond = birthday.getTime();
        long todaySecond = today.getTime();
        long second = todaySecond - birthdaySecond;
        if (second < 0) {
            System.out.println("This Person Have Not Bron");
        } else {
            System.out.println("This person has bron " + second / 1000 / 60 / 60 / 24 + " days");
        }
    }
}
