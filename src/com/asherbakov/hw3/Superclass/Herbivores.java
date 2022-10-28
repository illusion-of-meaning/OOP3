package com.asherbakov.hw3.Superclass;

import java.util.Objects;

public abstract class Herbivores extends Mammals {
    protected String typeOfFood;

    public Herbivores(String name) {
        this(name, 0);
    }

    public Herbivores(String name, int age) {
        this(name, age, null, 0);
    }

    public Herbivores(String name, String livingEnvironment, int speed) {
        this(name, 0, livingEnvironment, speed);
    }

    public Herbivores(String name, int age, String livingEnvironment, int speed) {
        this(name, age, livingEnvironment, speed, null);
    }

    public Herbivores(String name, int age, String livingEnvironment, int speed, String typeOfFood) {
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

    protected abstract void graze();

    @Override
    public String toString() {
        return "Herbivores{" +
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
        Herbivores that = (Herbivores) o;
        return typeOfFood.equals(that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}
