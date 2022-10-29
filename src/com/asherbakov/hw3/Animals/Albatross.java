package com.asherbakov.hw3.Animals;

import com.asherbakov.hw3.Superclass.Flying;

public class Albatross extends Flying {
    public Albatross(String name) {
        super(name);
    }

    public Albatross(String name, int age) {
        super(name, age);
    }

    public Albatross(String name, String livingEnvironment) {
        super(name, livingEnvironment);
    }

    public Albatross(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    public Albatross(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment, typeOfMovement);
    }

    @Override
    protected void fly() {
        System.out.println("Альбатрос летает.");
    }

    @Override
    protected void hunt() {
        System.out.println("Альбатрос охотится.");
    }

    @Override
    protected void eat() {
        System.out.println("Альбатрос ест.");
    }

    @Override
    protected void sleep() {
        System.out.println("Альбатрос спит.");
    }

    @Override
    protected void move() {
        System.out.println("Альбатрос переместился на новое место.");
    }

    @Override
    public String toString() {
        return "Albatross {" +
                "\n\tname='" + getName() + '\'' +
                "\n\tage='" + getAge() + '\'' +
                "\n\ttypeOfMovement='" + getTypeOfMovement() + '\'' +
                "\n\tlivingEnvironment='" + getLivingEnvironment() + '\'' +
                '}';
    }
}
