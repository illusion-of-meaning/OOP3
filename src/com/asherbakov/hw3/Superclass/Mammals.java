package com.asherbakov.hw3.Superclass;

import java.util.Objects;

public abstract class Mammals extends Animals {
    protected String livingEnvironment;
    protected int speed;

    public Mammals(String name) {
        this(name, 0);
    }

    public Mammals(String name, int age) {
        this(name, null, age);
    }

    public Mammals(String name, String livingEnvironment, int speed) {
        this(name, 0, livingEnvironment, speed);
    }

    public Mammals(String name, int age, String livingEnvironment, int speed) {
        super(name, age);
        if (livingEnvironment != null && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = STRING_VALUE_NOT_DEFINED;
        }
        setSpeed(speed);
    }

    protected abstract void walk();

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 1;
        } else {
            this.speed = speed;
        }
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speed == mammals.speed &&
                livingEnvironment.equals(mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speed);
    }
}
