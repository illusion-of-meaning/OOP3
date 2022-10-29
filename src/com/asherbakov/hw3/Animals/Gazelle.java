package com.asherbakov.hw3.Animals;

import com.asherbakov.hw3.Superclass.Herbivores;

public class Gazelle extends Herbivores {
    public Gazelle(String name) {
        super(name);
    }

    public Gazelle(String name, int age) {
        super(name, age);
    }

    public Gazelle(String name, String livingEnvironment, int speed) {
        super(name, livingEnvironment, speed);
    }

    public Gazelle(String name, int age, String livingEnvironment, int speed) {
        super(name, age, livingEnvironment, speed);
    }

    @Override
    protected void walk() {
        System.out.println("Газель гуляет.");
    }

    public Gazelle(String name, int age, String livingEnvironment, int speed, String typeOfFood) {
        super(name, age, livingEnvironment, speed, typeOfFood);
    }

    @Override
    protected void graze() {
        System.out.println("Газель пасется.");
    }

    @Override
    protected void eat() {
        System.out.println("Газель ест.");
    }

    @Override
    protected void sleep() {
        System.out.println("Газель спит.");
    }

    @Override
    protected void move() {
        System.out.println("Газель переместилась на новое место.");
    }

    @Override
    public String toString() {
        return "Gazelle {" +
                "\n\tname='" + getName() + '\'' +
                "\n\tage='" + getAge() + '\'' +
                "\n\ttypeOfFood='" + getTypeOfFood() + '\'' +
                "\n\tlivingEnvironment='" + getLivingEnvironment() + '\'' +
                "\n\tspeed=" + getSpeed() +
                '}';
    }
}
