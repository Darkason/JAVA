package com.day10.question.day2.homework5;

import java.util.*;

public class HomeWork5 {
    public static void main(String[] args) {
        Map<String, ArrayList<ArrayList<Student>>> map = new HashMap<>();
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张阿生", 23));
        students.add(new Student("阿松大", 24));
        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(new Student("沃斯基说的", 34));
        students1.add(new Student("说你嘛呢", 20));
        ArrayList<ArrayList<Student>> arrayList = new ArrayList<>();
        arrayList.add(students);
        ArrayList<ArrayList<Student>> arrayList1 = new ArrayList<>();
        arrayList1.add(students1);
        map.put("中山大学", arrayList);
        map.put("野鸡大学", arrayList1);
        System.out.println(map);
        Collection<ArrayList<ArrayList<Student>>> values = map.values();
        for (ArrayList<ArrayList<Student>> student : values) {
            for (ArrayList<Student> stu : student) {
                for (Student student1 : stu) {
                    System.out.println(student1);
                }
            }
        }
    }
}
