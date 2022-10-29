package com.asherbakov.hw3.Animals;

import com.asherbakov.hw3.Superclass.Herbivores;

public class Giraffe extends Herbivores {
    public Giraffe(String name) {
        super(name);
    }

    public Giraffe(String name, int age) {
        super(name, age);
    }

    public Giraffe(String name, String livingEnvironment, int speed) {
        super(name, livingEnvironment, speed);
    }

    public Giraffe(String name, int age, String livingEnvironment, int speed) {
        super(name, age, livingEnvironment, speed);
    }

    @Override
    protected void walk() {
        System.out.println("Жираф гуляет.");
    }

    public Giraffe(String name, int age, String livingEnvironment, int speed, String typeOfFood) {
        super(name, age, livingEnvironment, speed, typeOfFood);
    }

    @Override
    protected void graze() {
        System.out.println("Жираф пасется.");
    }

    @Override
    protected void eat() {
        System.out.println("Жираф ест.");
    }

    @Override
    protected void sleep() {
        System.out.println("Жираф спит.");
    }

    @Override
    protected void move() {
        System.out.println("Жираф переместился на новое место.");
    }

    @Override
    public String toString() {
        return "Giraffe {" +
                "\n\tname='" + getName() + '\'' +
                "\n\tage='" + getAge() + '\'' +
                "\n\ttypeOfFood='" + getTypeOfFood() + '\'' +
                "\n\tlivingEnvironment='" + getLivingEnvironment() + '\'' +
                "\n\tspeed=" + getSpeed() +
                '}';
    }
}
