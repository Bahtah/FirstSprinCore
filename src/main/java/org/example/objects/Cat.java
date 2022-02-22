package org.example.objects;

import org.example.interfaces.IAnimal;

public class Cat implements IAnimal {

    private String name;
    private String breed;

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Cat() {
    }

    @Override
    public void animalPlus() {
        System.out.println(name + " добавлен");
    }

    @Override
    public void animalMinus() {
        System.out.println(name + " удалён");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Кот " +
                "имя: " + name +
                ", порода: " + breed;
    }
}
