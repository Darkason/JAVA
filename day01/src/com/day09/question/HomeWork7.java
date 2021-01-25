package com.day09.question;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeWork7 {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date reg = sdf.parse("2013-6-8");
        Date start = sdf.parse("2015-9-1");
        Date end = sdf.parse("2016-3-3");
        Date today = new Date();
        long reg1 = reg.getTime();
        long start1 = start.getTime();
        long end1 = end.getTime();
        long today1 = today.getTime();
        long unLogin = end1 - start1;
        long now = today1 - reg1;
        long seconds = now - unLogin;
        long days = seconds/1000/60/60/24;
//        System.out.println(days);
        double d = Math.sqrt(16+4*days);
        double level2 = (-4+d)/2;
//        double level1 = (-4-d)/2;
//        System.out.println(d);
//        System.out.println(level2);
//        System.out.println(level1);
        if (level2 > 0) {
           int dG =(int) Math.floor(level2);
//            int dG = 74;
            System.out.println("等级为：" + dG);
            if (dG > 64) {
                for (int i = 0; i < Math.floor(dG / 64); i++) {
                    System.out.print("♕ ");
                }
            }
            if (dG % 64 >= 16) {
                for (int i = 0; i < Math.floor((dG % 64) / 16); i++) {
                    System.out.print("☀ ");
                }
            }
            if (dG % 16 >= 4) {
                for (int i = 0; i < Math.floor((dG % 16) / 4); i++) {
                    System.out.print("☽ ");
                }
            }
            if (dG % 4 >= 1) {
                for (int i = 0; i < Math.floor(dG % 4); i++) {
                    System.out.print("☆ ");
                }
            }
        }
        System.out.println("");
    }
}
