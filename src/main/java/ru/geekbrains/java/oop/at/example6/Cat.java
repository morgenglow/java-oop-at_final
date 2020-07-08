package ru.geekbrains.java.oop.at.example6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void meows(){
        System.out.println(name+" мяукает");
    }

}
