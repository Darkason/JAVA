package com.day10;

import java.util.ArrayList;
import java.util.Collections;

public class Test5 {
    public static void main(String[] args) {
        Student s1 = new Student("杨广", 50, 1000D);
        Student s2 = new Student("李渊", 40, 800D);
        Student s3 = new Student("赵匡胤", 30, 100D);
        Student s4 = new Student("忽必烈", 50, 1200D);
        Student s5 = new Student("朱元璋", 50, 10D);
        ArrayList<Student> list = new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        Collections.sort(list);
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
