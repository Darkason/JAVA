package com.day07;

public class Test {
    public static void main(String[] args) {
        swimming(new Person() {
            @Override
            public void swim(int age) {
                System.out.println("weq"+age);
            }
        }, 2);
        swimming((n) ->{
            System.out.println("wqe"+n);
        },1);
    }
    public static void swimming(Person p,int age){
        p.swim(age);
    }
}
