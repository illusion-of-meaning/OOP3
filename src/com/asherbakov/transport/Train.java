package com.asherbakov.transport;

public class Train extends Transport{
    private double cost;
    private int travelTime;
    private String departStation;
    private String destinationStation;
    private int numberOfWagons;
    
    public Train(String brand, String model, String color, int productionYear, String productionCountry, int maxSpeed) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
    }
}
