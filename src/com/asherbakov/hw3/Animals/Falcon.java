package com.asherbakov.hw3.Animals;

import com.asherbakov.hw3.Superclass.Flying;

public class Falcon extends Flying {
    public Falcon(String name) {
        super(name);
    }

    public Falcon(String name, int age) {
        super(name, age);
    }

    public Falcon(String name, String livingEnvironment) {
        super(name, livingEnvironment);
    }

    public Falcon(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    public Falcon(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment, typeOfMovement);
    }

    @Override
    protected void fly() {
        System.out.println("Сокол летает.");
    }

    @Override
    protected void hunt() {
        System.out.println("Сокол охотится.");
    }

    @Override
    protected void eat() {
        System.out.println("Сокол ест.");
    }

    @Override
    protected void sleep() {
        System.out.println("Сокол спит.");
    }

    @Override
    protected void move() {
        System.out.println("Сокол переместился на новое место.");
    }

    @Override
    public String toString() {
        return "Falcon {" +
                "\n\tname='" + getName() + '\'' +
                "\n\tage='" + getAge() + '\'' +
                "\n\ttypeOfMovement='" + getTypeOfMovement() + '\'' +
                "\n\tlivingEnvironment='" + getLivingEnvironment() + '\'' +
                '}';
    }
}
