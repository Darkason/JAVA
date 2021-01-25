package com.day04.test;

import com.day04.Person;

public class Test01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "马冬梅";
        p.age = 24;
        p.b = true;
        p.eat();
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.b);
        int result = p.sum(1,2);
        System.out.println(result);
    }
}
