package com.day04.test;

import com.day04.Dog;

public class Test02 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.eat();//未获取值
//        dog.setName("马保国");
//        dog.setAge(50);
//        dog.setMoney(-11000);
//        System.out.println(dog.getName());
//        System.out.println(dog.getAge());
//        System.out.println(dog.getMoney());
//        dog.eat();//已经获取值

        //调用的构造方法
        Dog dog = new Dog("马保国",50,2314d);
        dog.eat();
    }
}
