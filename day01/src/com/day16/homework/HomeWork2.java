package com.day16.homework;

import java.io.File;
import java.util.*;

public class HomeWork2 {
    static int javaCount = 0;
    static int jarCount = 0;
    static int txtCount = 0;
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        Map<String,Integer> list = new HashMap<>();
        File file = new File(path);
        select(file);
        list.put("java", javaCount);
        list.put("txt", txtCount);
        list.put("jar", jarCount);
        list.put("其他", count);
        Set<String> strings = list.keySet();
        Iterator iterator = strings.iterator();
        while (iterator.hasNext()){
            Object name = iterator.next();
            System.out.println(name+": "+list.get(name));
        }
    }

    public static void select(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                if (file1.getName().endsWith(".java")) {
                    javaCount++;
                } else if (file1.getName().endsWith(".jar")) {
                    jarCount++;
                } else if (file1.getName().endsWith(".txt")) {
                    txtCount++;
                } else {
                    count++;
                }
            } else if (file1.isDirectory()) {
                select(file1);
            }
        }
    }
}
