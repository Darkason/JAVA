package com.day10.test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        a();
        b();
    }

    public static void b() {
        Map<String, ArrayList<Student>> map = new HashMap<>();
        ArrayList<Student> class1 = new ArrayList<>();
        class1.add(new Student("老陈", 23, 10d));
        class1.add(new Student("老罗", 50, 1d));
        class1.add(new Student("老裂", 30, 5d));
        ArrayList<Student> class2 = new ArrayList<>();
        class2.add(new Student("老黄", 23, 10d));
        class2.add(new Student("老麟", 50, 1d));
        class2.add(new Student("老裂", 30, 5d));

        map.put("贞子班", class1);
        map.put("列子班", class2);
        Set<String> strings = map.keySet();
        for (String key : strings) {
            ArrayList<Student> students = map.get(key);
            for (Student key1 : students) {
                System.out.println("班级：" + key + key1);
            }
        }
    }

    public static void a() {
        Student s1 = new Student("老陈", 23, 10d);
        Student s2 = new Student("老罗", 50, 1d);
        Student s3 = new Student("老裂", 30, 5d);
        HashMap<Student, String> hashMap = new HashMap();
        hashMap.put(s1, "针子班");
        hashMap.put(s2, "弱智班");
        hashMap.put(s3, "钓鱼班");
        Set<Student> students = hashMap.keySet();
        for (Student key : students) {
            System.out.println(hashMap.get(key)+key);
        }
    }
}
