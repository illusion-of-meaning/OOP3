package com.asherbakov.hw3.Animals;

import com.asherbakov.hw3.Superclass.Predators;

public class Hyena extends Predators {
    public Hyena(String name) {
        super(name);
    }

    public Hyena(String name, int age) {
        super(name, age);
    }

    public Hyena(String name, String livingEnvironment, int speed) {
        super(name, livingEnvironment, speed);
    }

    public Hyena(String name, int age, String livingEnvironment, int speed) {
        super(name, age, livingEnvironment, speed);
    }

    public Hyena(String name, int age, String livingEnvironment, int speed, String typeOfFood) {
        super(name, age, livingEnvironment, speed, typeOfFood);
    }

    @Override
    protected void walk() {
        System.out.println("Гиена гуляет.");
    }

    @Override
    protected void hunt() {
        System.out.println("Гиена охотится.");
    }

    @Override
    protected void eat() {
        System.out.println("Гиена ест.");
    }

    @Override
    protected void sleep() {
        System.out.println("Гиена спит.");
    }

    @Override
    protected void move() {
        System.out.println("Гиена переместилась на новое место.");
    }

    @Override
    public String toString() {
        return "Hyena {" +
                "\n\tname='" + getName() + '\'' +
                "\n\tage='" + getAge() + '\'' +
                "\n\ttypeOfFood='" + getTypeOfFood() + '\'' +
                "\n\tlivingEnvironment='" + getLivingEnvironment() + '\'' +
                "\n\tspeed=" + getSpeed() +
                '}';
    }
}
