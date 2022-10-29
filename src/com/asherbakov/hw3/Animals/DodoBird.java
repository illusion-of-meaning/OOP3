package com.asherbakov.hw3.Animals;

import com.asherbakov.hw3.Superclass.Flightless;

public class DodoBird extends Flightless {
    public DodoBird(String name) {
        super(name);
    }

    public DodoBird(String name, int age) {
        super(name, age);
    }

    public DodoBird(String name, String livingEnvironment) {
        super(name, livingEnvironment);
    }

    public DodoBird(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    public DodoBird(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment, typeOfMovement);
    }

    @Override
    protected void walk() {
        System.out.println("Птица додо гуляет.");
    }

    @Override
    protected void hunt() {
        System.out.println("Птица додо охотится.");
    }

    @Override
    protected void eat() {
        System.out.println("Птица додо ест.");
    }

    @Override
    protected void sleep() {
        System.out.println("Птица додо спит.");
    }

    @Override
    protected void move() {
        System.out.println("Птица додо переместилась на новое место.");
    }

    @Override
    public String toString() {
        return "DodoBird {" +
                "\n\tname='" + getName() + '\'' +
                "\n\tage='" + getAge() + '\'' +
                "\n\ttypeOfMovement='" + getTypeOfMovement() + '\'' +
                "\n\tlivingEnvironment='" + getLivingEnvironment() + '\'' +
                '}';
    }
}
