package com.day06.question6;

public class Teacher extends Employee {
    @Override
    public void work() {
        System.out.println("工号为 "+getId()+" 的老师 "+getName()+" 在讲课");
    }

    public Teacher() {
    }

    public Teacher(int id, String name) {
        super(id, name);
    }
}
