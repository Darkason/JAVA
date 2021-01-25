package com.day06.question6;

public class Maintainer extends AdminStaff{
    @Override
    public void work() {
        System.out.println("工号为 "+getId()+" 的维护专员 "+getName()+" 在解决不能共享屏幕问题");
    }

    public Maintainer() {
    }

    public Maintainer(int id, String name) {
        super(id, name);
    }
}
