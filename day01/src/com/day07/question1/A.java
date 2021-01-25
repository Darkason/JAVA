package com.day07.question1;

public interface A {
    void showA();
    public default void showB(){
        System.out.println("BBBBB");
    }
}
