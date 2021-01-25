package com.day07.question3;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        showAnimal(cat);
        showAnimal(dog);
    }
    public static void showAnimal(Animal animal){
        animal.eat();
        if (animal instanceof Cat){
            ((Cat) animal).catchMouse();
        }else if (animal instanceof Dog){
            ((Dog) animal).lookHome();
        }
    }
}
