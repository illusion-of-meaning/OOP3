package com.asherbakov.hw3.Animals;

import com.asherbakov.hw3.Superclass.Amphibians;

public class SnakeFreshwater extends Amphibians {
    public SnakeFreshwater(String name) {
        super(name);
    }

    public SnakeFreshwater(String name, int age) {
        super(name, age);
    }

    public SnakeFreshwater(String name, String livingEnvironment) {
        super(name, livingEnvironment);
    }

    public SnakeFreshwater(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    @Override
    protected void hunt() {
        System.out.println("Уж охотится.");
    }

    @Override
    protected void eat() {
        System.out.println("Уж ест.");
    }

    @Override
    protected void sleep() {
        System.out.println("Уж спит.");
    }

    @Override
    protected void move() {
        System.out.println("Уж переместился на новое место.");
    }

    @Override
    public String toString() {
        return "SnakeFreshwater {" +
                "\n\tname='" + getName() + '\'' +
                "\n\tage='" + getAge() + '\'' +
                "\n\tlivingEnvironment='" + getLivingEnvironment() + '\'' +
                '}';
    }
}
