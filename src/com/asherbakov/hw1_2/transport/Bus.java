package com.asherbakov.hw1_2.transport;

public class Bus extends Transport{
    @Override
    protected String refill() {
        return "можно заправлять бензином или дизелем на заправке";
    }

    public Bus(String brand, String model, String color, int productionYear, String productionCountry, int maxSpeed) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
    }

}
