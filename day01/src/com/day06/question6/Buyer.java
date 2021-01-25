package com.day06.question6;

public class Buyer extends AdminStaff{
    @Override
    public void work() {
        System.out.println("工号为 "+getId()+" 的采购专员 "+getName()+" 在采购影像设备");
    }

    public Buyer() {
    }

    public Buyer(int id, String name) {
        super(id, name);
    }
}
