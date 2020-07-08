package ru.geekbrains.java.oop.at;

import ru.geekbrains.java.oop.at.parent.Animal;

public class Cat extends Animal implements Swimming{

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super();
    }

    public void meows() {
        System.out.println(name + " мяукает");
    }

    public void swimming() {
        System.out.println(name + " плавает как кот");
    }
}
