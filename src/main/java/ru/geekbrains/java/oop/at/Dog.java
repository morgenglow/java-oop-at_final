package ru.geekbrains.java.oop.at;

import ru.geekbrains.java.oop.at.parent.Animal;

public class Dog extends Animal implements Swimming {

    public Dog(String name) {
        super(name);
    }

    public void barking() {
        System.out.println(name + " лает");
    }

    public void swimming() {
        System.out.println(name + " плавает как собака");
    }
}
