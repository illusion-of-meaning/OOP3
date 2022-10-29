package com.asherbakov.hw3.Animals;

import com.asherbakov.hw3.Superclass.Flying;

public class Seagull extends Flying {
    public Seagull(String name) {
        super(name);
    }

    public Seagull(String name, int age) {
        super(name, age);
    }

    public Seagull(String name, String livingEnvironment) {
        super(name, livingEnvironment);
    }

    public Seagull(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    public Seagull(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment, typeOfMovement);
    }

    @Override
    protected void fly() {
        System.out.println("Чайка летает.");
    }

    @Override
    protected void hunt() {
        System.out.println("Чайка охотится.");
    }

    @Override
    protected void eat() {
        System.out.println("Чайка ест.");
    }

    @Override
    protected void sleep() {
        System.out.println("Чайка спит.");
    }

    @Override
    protected void move() {
        System.out.println("Чайка переместилась на новое место.");
    }

    @Override
    public String toString() {
        return "Seagull {" +
                "\n\tname='" + getName() + '\'' +
                "\n\tage='" + getAge() + '\'' +
                "\n\ttypeOfMovement='" + getTypeOfMovement() + '\'' +
                "\n\tlivingEnvironment='" + getLivingEnvironment() + '\'' +
                '}';
    }
}
