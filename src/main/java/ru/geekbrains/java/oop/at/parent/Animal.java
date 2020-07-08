package ru.geekbrains.java.oop.at.parent;

import ru.geekbrains.java.oop.at.CatFood;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        this.name = "Без имени";
    }

    public void eat(CatFood catFood) {
        System.out.println(name + " кушает " + catFood.getProductName());
    }

    public String getName() {
        return name;
    }

}
