package com.asherbakov.hw3;

import com.asherbakov.hw3.Animals.*;
import com.asherbakov.hw3.Superclass.*;

public class Main {
    public static void main(String[] args) {
        Animals gazelle = new Gazelle("Газик", 3, "Наземно-воздушная", 50);
        Animals giraffe = new Giraffe("Жорик", 5, "Наземно-воздушная", 20);
        Animals horse = new Horse("Яблочко", 2, "Наземно-воздушная", 80);

        Animals hyena = new Hyena("Оскал", 6);
        Animals tiger = new Tiger("Полосатик");
        Animals bear = new Bear("Топотун", 8, "Наземно-воздушная", 12, "Растительная пища, мясо");

        Animals frog = new Frog("Квакуша", 2);
        Animals snake = new SnakeFreshwater(null);

        Animals peacock = new Peacock("Красавчик", 3, "Наземно-воздушная", "Хотьба");
        Animals penguin = new Penguin("Жорик", 5, "Наземно-воздушная", "Хотьба");
        Animals dodoBird = new DodoBird("Додо", 2, "Наземно-воздушная", "С курьером");

        Animals seagull = new Seagull("Нахлебник", 3, "Наземно-воздушная", "Полёт");
        Animals falcon = new Falcon("Стрела", 5, "Наземно-воздушная", "Полёт");
        Animals albatros = new Albatross("Карасик", 2, "Наземно-воздушная", "Полёт");

        Animals[] zoo = {
                gazelle,
                giraffe,
                horse,
                hyena,
                tiger, tiger, // проверка поиска дублей
                bear,
                frog,
                snake,
                peacock,
                penguin,
                dodoBird,
                seagull,
                falcon,
                albatros
        };

        System.out.println("Поиск дублей: " + (findDouble(zoo) ? "найдены" : "нет"));

        System.out.println("-------------------------------------------------------");

        for (Animals animal : zoo) {
            System.out.println(animal);
            if (animal instanceof Mammals) {
                System.out.println("Класс млекопитающих");
            } else if (animal instanceof Amphibians) {
                System.out.println("Класс земноводных");
            } else if (animal instanceof Birds) {
                System.out.println("Класс птиц");
            }
            System.out.println();
        }

    }

    private static boolean findDouble(Animals[] animals) {
        boolean findDoubleFlag = false;
        for (int animalIndex = 0; animalIndex < animals.length - 1; animalIndex++) {
            for (int animalIndex2 = 0; animalIndex2 < animals.length - 1; animalIndex2++) {
                if (animalIndex == animalIndex2) continue;
                else {
                    if (animals[animalIndex].equals(animals[animalIndex2])) {
                        findDoubleFlag = true;
                    }
                }
            }
        }
        return findDoubleFlag;
    }
}
