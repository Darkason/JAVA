package com.day08.question2;

public class User {
    String username;
    String ps;
    public User(String username, String ps) {
        this.username = username;
        this.ps = ps;
        if (username != "admin"){
            throw new UserException("用户名不存在");
        }
        if (ps != "admin"){
            throw new UserException("密码错误");
        }
        System.out.println("欢迎");
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        if (username != "admin"){
            throw new UserException("用户名不存在");
        }
        if (ps != "admin"){
            throw new UserException("密码错误");
        }
        System.out.println("欢迎");
    }

    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps;
        if (username != "admin"){
            throw new UserException("用户名不存在");
        }
        if (ps != "admin"){
            throw new UserException("密码错误");
        }
        System.out.println("欢迎");
    }
}
