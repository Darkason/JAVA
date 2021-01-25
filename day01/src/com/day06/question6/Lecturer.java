package com.day06.question6;

public class Lecturer extends Teacher {
    @Override
    public void work() {
        System.out.println("工号为 "+getId()+" 的讲师 "+getName()+" 在讲课");
    }

    public Lecturer() {
    }

    public Lecturer(int id, String name) {
        super(id, name);
    }
}
