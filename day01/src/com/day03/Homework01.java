package com.day03;

import java.util.Arrays;

public class Homework01 {
    public static void main(String[] args) {
        //第一题
        System.out.println("第一题");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(equals(arr1, arr2));
        //第二题
        System.out.println("第二题");
        String[] xiaomin = {"D", "C", "B", "A", "D"};
        String[] xiaohong = {"A", "D", "B", "C", "D"};
        String[] xiaohuang = {"A", "D", "B", "C", "A"};
        String[] xiaoqiang = {"A", "B", "C", "D", "D"};
        String min = "小明";
        String hong = "小红";
        String huang = "小黄";
        String qiang = "小强";
        grades(xiaomin, min);
        grades(xiaohong, hong);
        grades(xiaohuang, huang);
        grades(xiaoqiang, qiang);
        //第三题
        System.out.println("第三题");
        int[] arr3 = {99, 100, 98, 97, 96};
        compete(arr3);
        //第四题
        System.out.println("第四题");
        int[] arr4 = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        aver(arr4);
        //第五题
        System.out.println("第五题");
        getMessage(20, 8);
        //第六题
        System.out.println("第六题");
        String color = "blue";
        showColor(color);
    }

    //第一题
    public static boolean equals(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]) {
                    continue;
                } else {
//                    System.out.println("两个数组的长度相同，内容不同");
                    return false;
                }
            }
//            System.out.println("两个数组完全一致");
            return true;
        }
//        else {
////            System.out.println("两个数组长度不一致");
//        }
        return false;
    }

    //第二题
    public static void grades(String[] arr, String name) {
        String[] answer = {"A", "D", "B", "C", "D"};
        int grade = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == arr[i]) {
                grade += 2;
                continue;
            }
        }
        System.out.println("满分10分，" + name + "得分" + grade);
    }

    //第三题
    public static void compete(int[] arr) {
        Arrays.sort(arr);
        int max = arr[4];
        int min = arr[0];
        int num = arr[1] + arr[2] + arr[3];
        int aver = num / 3;
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("总分：" + num);
        System.out.println("平均分" + aver);
    }

    //第四题
    public static void aver(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        int aver = total / arr.length;
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > aver) {
                number++;
            }
        }
        System.out.println("高于平均分（" + aver + ")的个数有" + number + "个");
    }

    //第五题
    public static void getMessage(int length, int width) {
        int getPerimeter = (length + width) * 2;
        int getArea = length * width;
        System.out.println("长方形的周长是" + getPerimeter + ",面积是" + getArea);
    }

    //第六题
    public static void showColor(String color) {
        switch (color) {
            case "red":
                System.out.println("红色");
                break;
            case "blue":
                System.out.println("蓝色");
                break;
            case "green":
                System.out.println("绿色");
                break;
            default:
                System.out.println("未知");
                break;
        }
    }
}

