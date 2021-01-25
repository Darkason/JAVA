package com.day08.question1;

public class Student {
    String name;
    int score;
    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
        if (score < 0 ){
            throw new NoScoreException("分数为负");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        if (score < 0 ){
            throw new NoScoreException("分数不能为负数");
        }
    }
}
