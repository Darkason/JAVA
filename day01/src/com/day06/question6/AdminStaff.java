package com.day06.question6;

public class AdminStaff extends Employee{
    @Override
    public void work() {
        System.out.println("工号为 "+getId()+" 的行政部员工 "+getName()+" 在工作");
    }

    public AdminStaff() {
    }

    public AdminStaff(int id, String name) {
        super(id, name);
    }
}
