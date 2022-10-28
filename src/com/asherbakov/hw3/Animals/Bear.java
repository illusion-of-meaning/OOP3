package com.asherbakov.hw3.Animals;

import com.asherbakov.hw3.Superclass.Predators;

public class Bear extends Predators {

    public Bear(String name) {
        super(name);
    }

    public Bear(String name, int age) {
        super(name, age);
    }

    public Bear(String name, String livingEnvironment, int speed) {
        super(name, livingEnvironment, speed);
    }

    public Bear(String name, int age, String livingEnvironment, int speed) {
        super(name, age, livingEnvironment, speed);
    }

    public Bear(String name, int age, String livingEnvironment, int speed, String typeOfFood) {
        super(name, age, livingEnvironment, speed, typeOfFood);
    }

    @Override
    protected void walk() {
        System.out.println("Медведь гуляет.");
    }

    @Override
    protected void hunt() {
        System.out.println("Медведь охотится.");
    }

    @Override
    protected void eat() {
        System.out.println("Медведь ест.");
    }

    @Override
    protected void sleep() {
        System.out.println("Медведь спит.");
    }

    @Override
    protected void move() {
        System.out.println("Медведь переместился на новое место.");
    }

    @Override
    public String toString() {
        return "Bear {" +
                "\n\tname='" + getName() + '\'' +
                "\n\tage='" + getAge() + '\'' +
                "\n\ttypeOfFood='" + getTypeOfFood() + '\'' +
                "\n\tlivingEnvironment='" + getLivingEnvironment() + '\'' +
                "\n\tspeed=" + getSpeed() +
                '}';
    }
}
