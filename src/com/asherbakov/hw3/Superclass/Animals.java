package com.asherbakov.hw3.Superclass;

import java.util.Objects;

public abstract class Animals {
    private String name;
    private int age;

    protected final static String STRING_VALUE_NOT_DEFINED = "Значение не задано";

    protected abstract void eat();

    protected abstract void sleep();

    protected abstract void move();

    public Animals(String name) {
        this(name, 0);
    }

    public Animals(String name, int age) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = STRING_VALUE_NOT_DEFINED;
        }
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age &&
                name.equals(animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
