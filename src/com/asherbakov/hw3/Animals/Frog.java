package com.asherbakov.hw3.Animals;

import com.asherbakov.hw3.Superclass.Amphibians;

public class Frog extends Amphibians {
    public Frog(String name) {
        super(name);
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    public Frog(String name, String livingEnvironment) {
        super(name, livingEnvironment);
    }

    public Frog(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    @Override
    protected void hunt() {
        System.out.println("Лягушка охотится.");
    }

    @Override
    protected void eat() {
        System.out.println("Лягушка ест.");
    }

    @Override
    protected void sleep() {
        System.out.println("Лягушка спит.");
    }

    @Override
    protected void move() {
        System.out.println("Лягушка переместилась на новое место.");
    }

    @Override
    public String toString() {
        return "Frog {" +
                "\n\tname='" + getName() + '\'' +
                "\n\tage='" + getAge() + '\'' +
                "\n\tlivingEnvironment='" + getLivingEnvironment() + '\'' +
                '}';
    }
}
