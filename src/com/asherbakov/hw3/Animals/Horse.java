package com.asherbakov.hw3.Animals;

import com.asherbakov.hw3.Superclass.Herbivores;

public class Horse extends Herbivores {
    public Horse(String name) {
        super(name);
    }

    public Horse(String name, int age) {
        super(name, age);
    }

    public Horse(String name, String livingEnvironment, int speed) {
        super(name, livingEnvironment, speed);
    }

    public Horse(String name, int age, String livingEnvironment, int speed) {
        super(name, age, livingEnvironment, speed);
    }

    public Horse(String name, int age, String livingEnvironment, int speed, String typeOfFood) {
        super(name, age, livingEnvironment, speed, typeOfFood);
    }

    @Override
    protected void graze() {
        System.out.println("Лошадь пасется.");
    }

    @Override
    protected void eat() {
        System.out.println("Лошадь ест.");
    }

    @Override
    protected void sleep() {
        System.out.println("Лошадь спит.");
    }

    @Override
    protected void walk() {
        System.out.println("Лошадь гуляет.");
    }

    @Override
    protected void move() {
        System.out.println("Лошадь переместилась на новое место.");
    }

    @Override
    public String toString() {
        return "Horse {" +
                "\n\tname='" + getName() + '\'' +
                "\n\tage='" + getAge() + '\'' +
                "\n\ttypeOfFood='" + getTypeOfFood() + '\'' +
                "\n\tlivingEnvironment='" + getLivingEnvironment() + '\'' +
                "\n\tspeed=" + getSpeed() +
                '}';
    }
}
