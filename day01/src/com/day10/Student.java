package com.day10;

public class Student implements Comparable<Student> {
    private String name;
    private Integer age;
    private Double money;

    @Override
    public int compareTo(Student o) {
        //仅对年龄降序排序
//        return o.getAge() - this.age;
        //对年龄进行降序 ,年龄相同，则工资升序
        if (o.getAge() == this.age) {
            //说明年龄相同，再对工资升序排序
            if (o.getMoney() > this.money) {
                return -1;
            }
            if (o.getMoney() < this.money) {
                return 1;
            } else {
                return 0;
            }
        }
        return this.age - o.getAge();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }


    public Student(String name, Integer age, Double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
