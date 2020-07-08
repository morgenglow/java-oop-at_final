package ru.geekbrains.java.oop.at.example9;

public class Mouse extends Animal {

    public Mouse(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(name+" не хочет плавать");
    }

}
