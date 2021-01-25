package com.day06.question6;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(660,"laowang");
        Lecturer lecturer = new Lecturer(666,"傅红雪");
        Tutor tutor = new Tutor(668,"顾绮");
        AdminStaff adminStaff = new AdminStaff(680,"laozhang");
        Maintainer maintainer = new Maintainer(686,"庖丁");
        Buyer buyer = new Buyer(888,"景甜");
        teacher.work();
        lecturer.work();
        tutor.work();
        adminStaff.work();
        maintainer.work();
        buyer.work();
    }
}
