package com.asherbakov.hw1_2.transport;

public class Train extends Transport{
    private double price;
    private int travelTime;
    private String departStation;
    private String destinationStation;
    private int countOfWagons;

    @Override
    protected String refill() {
        return "нужно заправлять дизелем";
    }

    public Train(String brand, String model, String color, int productionYear, String productionCountry, int maxSpeed) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price <= 0 ? 1 : price;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime <= 0 ? 1 : travelTime;
    }

    public String getDepartStation() {
        return departStation;
    }

    public void setDepartStation(String departStation) {
        this.departStation = (departStation != null && !departStation.isBlank()) ? departStation : EMPTY_STRING_VALUE;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = (destinationStation != null && !destinationStation.isBlank()) ? destinationStation : EMPTY_STRING_VALUE;
    }

    public int getCountOfWagons() {
        return countOfWagons;
    }

    public void setCountOfWagons(int countOfWagons) {
        this.countOfWagons = countOfWagons < 0 ? 0 : countOfWagons;
    }

    @Override
    public String toString() {
        return "Поезд " + super.getBrand() + " {" +
                "\n\tмодель: " + super.getModel() +
                "\n\tгод выпуска: " + super.getProductionYear() +
                "\n\tстрана производства: " + super.getProductionCountry() +
                "\n\tскорость передвижения: " + super.getMaxSpeed() +
                "\n\tстанция отправления: '" + getDepartStation() + "'" +
                "\n\tстанция прибытия: '" + getDestinationStation() + "'" +
                "\n\tцена поездки: " + getPrice() +
                "\n\tвремя в пути: " + getTravelTime() +
                "\n\tколичество вагоноа: " + getCountOfWagons() +
                '}';
    }
}
