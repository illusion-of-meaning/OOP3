package com.asherbakov.hw3.Superclass;

import java.util.Objects;

public abstract class Flightless extends Birds {
    protected String typeOfMovement;

    public Flightless(String name) {
        this(name, 0);
    }

    public Flightless(String name, int age) {
        this(name, age, null);
    }

    public Flightless(String name, String livingEnvironment) {
        this(name, 0, livingEnvironment);
    }

    public Flightless(String name, int age, String livingEnvironment) {
        this(name, age, livingEnvironment, null);
    }

    public Flightless(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        if (typeOfMovement != null && !typeOfMovement.isBlank()) {
            this.typeOfMovement = typeOfMovement;
        } else {
            this.typeOfMovement = STRING_VALUE_NOT_DEFINED;
        }
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    protected abstract void walk();

    @Override
    public String toString() {
        return "Flightless{" +
                "typeOfMovement='" + typeOfMovement + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return typeOfMovement.equals(that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }
}
