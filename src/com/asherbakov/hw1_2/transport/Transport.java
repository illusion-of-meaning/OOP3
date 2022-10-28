package com.asherbakov.hw1_2.transport;

public abstract class Transport {

    private String brand;
    private String model;
    private String color;
    private int productionYear;
    private String productionCountry;
    private int maxSpeed;
    protected final String EMPTY_STRING_VALUE = "параметр не задан";
    protected abstract String refill();

    public Transport(String brand, String model, String color, int productionYear, String productionCountry, int maxSpeed) {
        setColor(color);
        setMaxSpeed(maxSpeed);
        this.brand = brand.isBlank() ? EMPTY_STRING_VALUE : brand;
        this.model = model.isBlank() ? EMPTY_STRING_VALUE : model;
        this.productionYear = productionYear <= 0 ? 2000 : productionYear;
        this.productionCountry = productionCountry.isBlank() ? EMPTY_STRING_VALUE : productionCountry;

//        if (brand.isBlank()) {
//            this.brand = EMPTY_STRING_VALUE;
//        } else {
//            this.brand = brand;
//        }
//        if (model.isBlank()) {
//            this.model = EMPTY_STRING_VALUE;
//        } else {
//            this.model = model;
//        }
//        if (productionYear <= 0) {
//            this.productionYear = 2000;
//        } else {
//            this.productionYear = productionYear;
//        }
//        if (productionCountry.isBlank()) {
//            this.productionCountry = EMPTY_STRING_VALUE;
//        } else {
//            this.productionCountry = productionCountry;
//        }
    }
    public void setColor(String color) {
        if (!color.isBlank() && color != null) {
            this.color = color;
        } else {
            this.color = EMPTY_STRING_VALUE;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0) {
            this.maxSpeed = 0;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
