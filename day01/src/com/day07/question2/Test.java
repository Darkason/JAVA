package com.day07.question2;

public class Test {
    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone();
        OldPhone oldPhone = new OldPhone();
        newPhone.call();
        newPhone.playGame();
        newPhone.sendMessages();
        oldPhone.call();
        oldPhone.sendMessages();
    }
}
