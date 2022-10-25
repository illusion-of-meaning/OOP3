package com.asherbakov;

import com.asherbakov.transport.Car;
import com.asherbakov.transport.enums.BodyType;
import com.asherbakov.transport.enums.TiresType;
import com.asherbakov.transport.enums.Transmission;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car(
                "Lada",
                "Granta",
                1.7,
                "желтый",
                2015,
                "Россия",
                Transmission.MT,
                BodyType.Sedan,
                "к603от28",
                5,
                TiresType.Summer,
                160
        );
        Car.Key ladaKey = ladaGranta.new Key(false, false);
        Car.Insurance ladaInsurance = ladaGranta.new Insurance(LocalDate.parse("2023-06-09"), 9800, "1234567890");
        ladaGranta.setKey(ladaKey);
        ladaGranta.setInsurance(ladaInsurance);

        System.out.println(ladaGranta);
    }
}
