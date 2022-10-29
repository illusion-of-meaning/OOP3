package com.asherbakov.hw1_2;

import com.asherbakov.hw1_2.transport.Bus;
import com.asherbakov.hw1_2.transport.Car;
import com.asherbakov.hw1_2.transport.Train;
import com.asherbakov.hw1_2.transport.enums.BodyType;
import com.asherbakov.hw1_2.transport.enums.TiresType;
import com.asherbakov.hw1_2.transport.enums.Transmission;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("===ДЗ 1, задание 1===");
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

        System.out.println("===ДЗ 1, задание 2===");
        Train trainSwallow = new Train("Ласточка", "B-901", null, 2011, "Россия", 301);
        trainSwallow.setDepartStation("Белорусский вокзал");
        trainSwallow.setDestinationStation("Минск-Пассажирский");
        trainSwallow.setPrice(3500);
        trainSwallow.setCountOfWagons(8);
        System.out.println(trainSwallow);

        Train trainLeningrad = new Train("Ленинград", "D-125", null, 2019, "Россия", 270);
        trainLeningrad.setDepartStation("Ленинградский вокзал");
        trainLeningrad.setDestinationStation("Ленинград-Пассажирский");
        trainLeningrad.setPrice(1700);
        trainLeningrad.setCountOfWagons(8);
        System.out.println(trainLeningrad);

        System.out.println("===ДЗ 1, задание 3===");
        Bus busPaz4234 = new Bus("ПАЗ", "4234", "Белый", 2018, "Россия", 95);
        Bus busVector = new Bus("ГАЗ", "Вектор Next 8.8", "Синий", 2022, "Россия", 100);
        Bus busKavz4235 = new Bus("КАВЗ", "4235", "Красный", 2020, "Россия", 100);
        Bus[] buses = {busPaz4234, busVector, busKavz4235};
        for (Bus bus : buses) {
            System.out.println(bus);
        }

    }
}
