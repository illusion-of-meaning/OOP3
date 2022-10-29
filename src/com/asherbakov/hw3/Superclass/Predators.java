package com.asherbakov.hw3.Superclass;

import java.util.Objects;

public abstract class Predators extends Mammals {
    protected String typeOfFood;

    public Predators(String name) {
        this(name, 0);
    }

    public Predators(String name, int age) {
        this(name, null, age);
    }

    public Predators(String name, String livingEnvironment, int speed) {
        this(name, 0, livingEnvironment, speed);
    }

    public Predators(String name, int age, String livingEnvironment, int speed) {
        this(name, age, livingEnvironment, speed, null);
    }

    public Predators(String name, int age, String livingEnvironment, int speed, String typeOfFood) {
        super(name, age, livingEnvironment, speed);
        if (typeOfFood != null && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        } else {
            this.typeOfFood = STRING_VALUE_NOT_DEFINED;
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    protected abstract void hunt();

    @Override
    public String toString() {
        return "Predators{" +
                "typeOfFood='" + typeOfFood + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return typeOfFood.equals(predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}
