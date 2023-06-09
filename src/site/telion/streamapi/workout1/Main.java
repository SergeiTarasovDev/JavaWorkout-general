package site.telion.streamapi.workout1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        // First try
        List<Car> firstList = new ArrayList<>(List.of(
                new Car("Toyota", "Camry", LocalDate.of(2012, 7, 20)),
                new Car("Honda", "Accord", LocalDate.of(2022, 9, 20)),
                new Car("Toyota", "Camry", LocalDate.of(2015, 11, 20))
        ));

        Optional<Car> firstResult = firstList.stream()
                .max(Comparator.comparing(Car::getBirthday));

        firstResult.ifPresent(car -> System.out.println("From first list: " + car));

        // Empty try
        List<Car> emptyList = new ArrayList<>();
        Optional<Car> emptyResult = emptyList.stream()
                .max(Comparator.comparing(Car::getBirthday));
        emptyResult.ifPresent(car -> System.out.println("From empty list: " + car));

        // Second try
        List<Car> secondList = new ArrayList<>(List.of(
                new Car("Toyota", "Camry", LocalDate.of(2012, 7, 20)),
                new Car("Honda", "Accord", LocalDate.of(2022, 9, 20)),
                new Car("Toyota", "Camry", LocalDate.of(2015, 11, 20)),
                new Car("Toyota", "Camry", LocalDate.of(2012, 7, 20)),
                new Car("Honda", "Accord", LocalDate.of(2022, 9, 20)),
                new Car("Toyota", "Camry", LocalDate.of(2015, 11, 20))
        ));

        Optional<Car> secondResult = secondList.stream()
                .max(Comparator.comparing(Car::getBirthday));

        secondResult.ifPresent(car -> System.out.println("From second list: " + car));
    }
}
