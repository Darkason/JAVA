package com.day15;

public class Stu {
    private Integer id;
    private Integer classId;
    private String name;
    private String sex;
    private Integer age;

    public Stu() {
    }

    public Stu(Integer id, Integer classId, String name, String sex, Integer age) {
        this.id = id;
        this.classId = classId;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Stu(Integer classId, String name, String sex, Integer age) {
        this.classId = classId;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "id=" + id +
                ", classId=" + classId +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
