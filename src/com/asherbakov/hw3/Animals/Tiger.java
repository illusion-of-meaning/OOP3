package com.asherbakov.hw3.Animals;

import com.asherbakov.hw3.Superclass.Predators;

public class Tiger extends Predators {
    public Tiger(String name) {
        super(name);
    }

    public Tiger(String name, int age) {
        super(name, age);
    }

    public Tiger(String name, String livingEnvironment, int speed) {
        super(name, livingEnvironment, speed);
    }

    public Tiger(String name, int age, String livingEnvironment, int speed) {
        super(name, age, livingEnvironment, speed);
    }

    public Tiger(String name, int age, String livingEnvironment, int speed, String typeOfFood) {
        super(name, age, livingEnvironment, speed, typeOfFood);
    }

    @Override
    protected void walk() {
        System.out.println("Тигр гуляет.");
    }

    @Override
    protected void hunt() {
        System.out.println("Тигр охотится.");
    }

    @Override
    protected void eat() {
        System.out.println("Тигр ест.");
    }

    @Override
    protected void sleep() {
        System.out.println("Тигр спит.");
    }

    @Override
    protected void move() {
        System.out.println("Тигр переместился на новое место.");
    }

    @Override
    public String toString() {
        return "Tiger {" +
                "\n\tname='" + getName() + '\'' +
                "\n\tage='" + getAge() + '\'' +
                "\n\ttypeOfFood='" + getTypeOfFood() + '\'' +
                "\n\tlivingEnvironment='" + getLivingEnvironment() + '\'' +
                "\n\tspeed=" + getSpeed() +
                '}';
    }
}
