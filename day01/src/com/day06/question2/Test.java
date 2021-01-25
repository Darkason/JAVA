package com.day06.question2;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
//        animal.setName("旺财");
//        animal.eat();
        dog.setName("旺财狗");
        dog.eat();
        dog.lookHome();
        cat.name = "波斯猫";
        cat.eat();
        cat.catchMouse();
    }
}
