package com.day16;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file = new File("D:\\JAVA\\day01");
        print(file);
//        sum(0);
    }

    public static void print(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                if (file1.getName().endsWith(".java")) {
                    System.out.println("是Java文件：" + file1);
                }
            } else {
                print(file1);
            }
        }
    }

    public static void sum(int i) {
        if (i >= 9000) {
            return;
        }
        System.out.println(i);
        i++;
        sum(i);
    }
}
