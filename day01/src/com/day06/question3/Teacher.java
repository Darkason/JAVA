package com.day06.question3;

public class Teacher extends Person {
    private String section;

    public void teach() {
        System.out.println(getName() + "teach" + section + getAge());
    }

    public Teacher() {
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Teacher(String section) {
        this.section = section;
    }
}
