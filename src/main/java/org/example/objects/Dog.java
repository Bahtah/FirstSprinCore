package org.example.objects;

import org.example.interfaces.IAnimal;

public class Dog implements IAnimal {

    private String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Dog() {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ит " +
                "аты = " + name +
                ", тусу = " + color;
    }
}
