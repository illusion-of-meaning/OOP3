package com.asherbakov.hw3.Superclass;

import java.util.Objects;

public abstract class Flying extends Birds {
    protected String typeOfMovement;

    public Flying(String name) {
        this(name, 0);
    }

    public Flying(String name, int age) {
        this(name, age, null);
    }

    public Flying(String name, String livingEnvironment) {
        this(name, 0, livingEnvironment);
    }

    public Flying(String name, int age, String livingEnvironment) {
        this(name, age, livingEnvironment, null);
    }

    public Flying(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        if (typeOfMovement != null && !typeOfMovement.isBlank()) {
            this.typeOfMovement = typeOfMovement;
        } else {
            this.typeOfMovement = STRING_VALUE_NOT_DEFINED;
        }
    }

    protected abstract void fly();

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public String toString() {
        return "Flying{" +
                "typeOfMovement='" + typeOfMovement + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return typeOfMovement.equals(flying.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }
}
