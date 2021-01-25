package com.day07.question4;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("马云",45);
        SportTeacher sportTeacher = new SportTeacher("大姚",35);
        Student student = new Student("小王",20);
        SportStudent sportStudent = new SportStudent("王中王",21);
        teacher.eat();
        gotoSport(sportTeacher);
        student.eat();
        gotoSport(sportStudent);
    }
    public static void gotoSport(Sport sport){
        sport.playBasketball();
    }
}
