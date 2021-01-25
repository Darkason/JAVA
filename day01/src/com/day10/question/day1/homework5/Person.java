package com.day10.question.day1.homework5;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private double pay;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pay=" + pay +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (o.getAge() == this.age) {
            if (o.getPay() > this.pay) {
                return -1;
            } else if (o.getPay() < this.pay) {
                return 1;
            } else {
                return 0;
            }
        }
        return o.getAge() - this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
//                Double.compare(person.pay, pay) == 0 &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Person() {
    }

    public Person(String name, int age, double pay) {
        this.name = name;
        this.age = age;
        this.pay = pay;
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

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
}
