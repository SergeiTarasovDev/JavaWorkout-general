package site.telion.oop.examclouds.task7_animals;

import site.telion.oop.examclouds.task7_animals.animals.*;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("вискас", "30 лет победы", "Ириска", 3, "ленивая"),
                new Dog("педигри", "республики", "Батон", 5, "ласковый", "знает немного команд"),
                new Horse("комбикорм", "село туманово", "Улитка", 2, true),
        };
        Veterinarian pablo = new Veterinarian("одесская", 500);

        for (Animal animal : animals) {
            pablo.treatAnimal(animal);
        }
    }
}
