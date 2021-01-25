package com.day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Test4 {
    public static void main(String[] args) {
//        a();
        b();
//        c();
    }

    public static void a() {
        Student s1 = new Student("Old G", 30);
        Student s2 = new Student("Young boy", 20);
        Student s3 = new Student("Old Mc", 25);
        Student s4 = new Student("DJ", 22);
        ArrayList<Student> arrayList = new ArrayList();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
//        for (Student stu : arrayList) {
//            System.out.println(stu);
//        }
        ArrayList<ArrayList<Student>> arrayLists = new ArrayList();
        arrayLists.add(arrayList);
        arrayLists.add(arrayList);
        for (int i = 0; i < arrayLists.size(); i++) {
            ArrayList<Student> students = arrayLists.get(i);
            for (int j = 0; j < students.size(); j++) {
                System.out.println(students.get(j));
            }
        }
    }

    public static void b() {
        Student stu1 = new Student("Old G", 30);
        Student stu2 = new Student("Young boy", 20);
        Student stu3 = new Student("Old Mc", 25);
        Student stu4 = new Student("DJ", 22);
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(stu1);
        hashSet.add(stu2);
        hashSet.add(stu3);
        hashSet.add(stu4);
//        System.out.println(hashSet);
        for (Student stu : hashSet) {
            System.out.println(stu);
        }
        HashSet<HashSet<Student>> HashSet1 = new HashSet();
        HashSet1.add(hashSet);
        HashSet1.add(hashSet);

    }
}
