package com.day06.question6;

public class Tutor extends Teacher{
    @Override
    public void work() {
        System.out.println("工号为 "+getId()+" 的助教 "+getName()+" 在帮助学生解决问题");
    }

    public Tutor() {
    }

    public Tutor(int id, String name) {
        super(id, name);
    }
}
