package com.day04.HomeWork;

import com.day04.Coder;
import com.day04.Manager;

public class Test {
    public static void main(String[] args) {
        Coder coder = new Coder("小尼姑",214354232,9876);
        coder.intro();
        coder.showSalary();
        coder.work();
        Manager manager = new Manager("大尼姑",432413542,10828,231);
        manager.intro();
        manager.showSalary();
        manager.work();
    }
}
