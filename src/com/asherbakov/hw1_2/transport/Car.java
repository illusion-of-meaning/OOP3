package com.asherbakov.hw1_2.transport;

import com.asherbakov.hw1_2.transport.enums.BodyType;
import com.asherbakov.hw1_2.transport.enums.TiresType;
import com.asherbakov.hw1_2.transport.enums.Transmission;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Car extends Transport {
    private double engineVolume;
    private Transmission transmission;
    private BodyType bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private TiresType tiresType;
    private Key key;
    private Insurance insurance;

    @Override
    protected String refill() {
        return "Можно заправлять бензином, дизелем на заправке или заряжать на специальных электроду-парковках, если это электрокар";
    }

    public class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteEngineStart=" + remoteEngineStart +
                    ", keylessAccess=" + keylessAccess +
                    '}';
        }
    }

    public class Insurance {
        private LocalDate insuranceValidityPeriod;
        private double costOfInsurance;
        private String insuranceNumber;

        public Insurance(LocalDate insuranceValidityPeriod, double costOfInsurance, String insuranceNumber) {
            this.insuranceValidityPeriod = insuranceValidityPeriod;
            if (!isActualInsurance(insuranceValidityPeriod)) {
                System.out.println("Нужно срочно ехать оформлять новую страховку!");
            }
            this.costOfInsurance = costOfInsurance;
            if (insuranceNumber != null && !insuranceNumber.isBlank() && insurerNumberCheck(insuranceNumber)) {
                this.insuranceNumber = insuranceNumber;
            } else {
                System.out.println("Номер страховки некорректный!");
                this.insuranceNumber = EMPTY_STRING_VALUE;
            }
        }

        public LocalDate getInsuranceValidityPeriod() {
            return insuranceValidityPeriod;
        }

        public double getCostOfInsurance() {
            return costOfInsurance;
        }

        public String getInsuranceNumber() {
            return insuranceNumber;
        }

        public boolean isActualInsurance(LocalDate insuranceValidityPeriod) {
            return insuranceValidityPeriod.isBefore(LocalDate.now()) ? false : true;
        }

        public boolean insurerNumberCheck(String insuranceNumber) {
            return insuranceNumber.length() != 9 ? false : true;
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "insuranceValidityPeriod=" + insuranceValidityPeriod +
                    ", costOfInsurance=" + costOfInsurance +
                    ", insuranceNumber='" + insuranceNumber + '\'' +
                    '}';
        }
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, Transmission transmission, BodyType bodyType, String registrationNumber, int numberOfSeats, TiresType tiresType, int maxSpeed) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
        if (bodyType != null) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = BodyType.Sedan;
        }
        if (numberOfSeats > 0) {
            this.numberOfSeats = numberOfSeats;
        } else {
            this.numberOfSeats = 4;
        }
        setTransmission(transmission);
        setRegistrationNumber(registrationNumber);
        setTiresType(tiresType);
        setEngineVolume(engineVolume);
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0.0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission != null ? transmission : Transmission.MT;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && registrationNumberIsCorrect(registrationNumber)) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "х000хх000";
        }
    }

    public TiresType getTiresType() {
        return tiresType;
    }

    public void setTiresType(TiresType tiresType) {
        this.tiresType = tiresType != null ? tiresType : TiresType.Summer;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key != null) {
            this.key = key;
        }
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        if (insurance != null) {
            this.insurance = insurance;
        }
    }

    public boolean registrationNumberIsCorrect(String number) {
        String regex = "\\D\\d{3}\\D{2}\\d{2,3}";
        return Pattern.matches(regex, number);
    }

    @Override
    public String toString() {
        return "Car {" +
                "\n\tмарка: " + super.getBrand() +
                "\n\tмодель: " + super.getModel() +
                "\n\tцвет: " + super.getColor() +
                "\n\tгод выпуска: " + super.getProductionYear() +
                "\n\tстрана производства: " + super.getProductionCountry() +
                "\n\tмаксимальная скорость: " + super.getMaxSpeed() +
                "\n\tengineVolume=" + engineVolume +
                "\n\tтрансмиссия: " + transmission +
                "\n\tтип кузова: " + bodyType +
                "\n\tномер: " + registrationNumber +
                "\n\tкол-во мест: " + numberOfSeats +
                "\n\tтип резины: " + tiresType +
                "\n\tбесключевой доступ: " + key.isKeylessAccess() +
                "\n\tудаленный запуск: " + key.isRemoteEngineStart() +
                String.format("\n\tстоимость страховки: %.2f", insurance.getCostOfInsurance()) +
                "\n\tномер страхового полиса: " + insurance.getInsuranceNumber() +
                "\n}";
    }
}
