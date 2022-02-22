package org.example.objects;

import org.example.interfaces.IAnimal;

public class Person {

    private String name;
    private int age;
    private IAnimal animal;

    public Person(String name, int age, IAnimal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
    }

    public Person() {
    }

    public void persDog() {
        animal.animalPlus();
        animal.animalMinus();
        System.out.println(name + " " + animal.getName() + " жетелеп кетти");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public IAnimal getiAnimal() {
        return animal;
    }

    public void setiAnimal(IAnimal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Персонаж " +
                "имя: " + name +
                ", жашы: " + age;
    }

}
