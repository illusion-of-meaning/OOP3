package com.asherbakov.hw3.Superclass;

import java.util.Objects;

public abstract class Amphibians extends Animals {
    protected String livingEnvironment;

    public Amphibians(String name) {
        this(name, 0);
    }

    public Amphibians(String name, int age) {
        this(name, age, null);
    }

    public Amphibians(String name, String livingEnvironment) {
        this(name, 0, livingEnvironment);
    }

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment != null && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = STRING_VALUE_NOT_DEFINED;
        }
    }

    protected abstract void hunt();

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return livingEnvironment.equals(that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
