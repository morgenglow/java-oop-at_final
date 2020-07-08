package ru.geekbrains.java.oop.at;

import ru.geekbrains.java.oop.at.parent.Animal;

public class Start {
    public static void main(String[] args) {
        CatFood purinaOne = new CatFood("Purina One");

        Cat tom = new Cat("Том");
        Cat cat = new Cat();
        Dog spike = new Dog("Спайк");

        Animal[] animal = {tom,  spike, cat};
        Swimming[] swimmings = {tom,  spike, cat};



        for (int i = 0; i < swimmings.length; i++) {
            swimmings[i].swimming();
        }
    }
}
