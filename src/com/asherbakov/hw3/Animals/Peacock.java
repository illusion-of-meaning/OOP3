package com.asherbakov.hw3.Animals;

import com.asherbakov.hw3.Superclass.Flightless;

public class Peacock extends Flightless {
    public Peacock(String name) {
        super(name);
    }

    public Peacock(String name, int age) {
        super(name, age);
    }

    public Peacock(String name, String livingEnvironment) {
        super(name, livingEnvironment);
    }

    public Peacock(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    public Peacock(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment, typeOfMovement);
    }

    @Override
    protected void walk() {
        System.out.println("Павлин гуляет.");
    }

    @Override
    protected void hunt() {
        System.out.println("Павлин охотится.");
    }

    @Override
    protected void eat() {
        System.out.println("Павлин ест.");
    }

    @Override
    protected void sleep() {
        System.out.println("Павлин спит.");
    }

    @Override
    protected void move() {
        System.out.println("Павлин переместился на новое место.");
    }

    @Override
    public String toString() {
        return "Peacock {" +
                "\n\tname='" + getName() + '\'' +
                "\n\tage='" + getAge() + '\'' +
                "\n\ttypeOfMovement='" + getTypeOfMovement() + '\'' +
                "\n\tlivingEnvironment='" + getLivingEnvironment() + '\'' +
                '}';
    }
}
