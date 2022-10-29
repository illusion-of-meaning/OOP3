package com.asherbakov.hw3.Animals;

import com.asherbakov.hw3.Superclass.Flightless;

public class Penguin extends Flightless {
    public Penguin(String name) {
        super(name);
    }

    public Penguin(String name, int age) {
        super(name, age);
    }

    public Penguin(String name, String livingEnvironment) {
        super(name, livingEnvironment);
    }

    public Penguin(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    public Penguin(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment, typeOfMovement);
    }

    @Override
    protected void walk() {
        System.out.println("Пингвин гуляет.");
    }

    @Override
    protected void hunt() {
        System.out.println("Пингвин охотится.");
    }

    @Override
    protected void eat() {
        System.out.println("Пингвин ест.");
    }

    @Override
    protected void sleep() {
        System.out.println("Пингвин спит.");
    }

    @Override
    protected void move() {
        System.out.println("Пингвин переместился на новое место.");
    }

    @Override
    public String toString() {
        return "Penguin {" +
                "\n\tname='" + getName() + '\'' +
                "\n\tage='" + getAge() + '\'' +
                "\n\ttypeOfMovement='" + getTypeOfMovement() + '\'' +
                "\n\tlivingEnvironment='" + getLivingEnvironment() + '\'' +
                '}';
    }
}
