package com.asherbakov.hw3.Superclass;

import java.util.Objects;

public abstract class Birds extends Animals {
    protected String livingEnvironment;

    public Birds(String name) {
        this(name, 0);
    }

    public Birds(String name, int age) {
        this(name, age, null);
    }

    public Birds(String name, String livingEnvironment) {
        this(name, 0, livingEnvironment);
    }

    public Birds(String name, int age, String livingEnvironment) {
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
        return "Birds{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return livingEnvironment.equals(birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
