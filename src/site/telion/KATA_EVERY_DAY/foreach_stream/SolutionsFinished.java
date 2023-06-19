package site.telion.KATA_EVERY_DAY.foreach_stream;

import java.util.*;
import java.util.stream.Collectors;

public class SolutionsFinished {
    public static void main(String[] args) {
        task_1();
        System.out.println();
        task_2();
    }

    // Task 1. Перебрать коллекцию с помощью forEach и лямбды
    // list или set или  map или array
    // Заполнить случайными числами или заполнить готовым набором данных.
    private static void task_1() {
        //List<Integer> productList = new ArrayList<>(List.of(1, 2, 1, 1, 1, 3, 5, 6, 3, 4, 2));
        List<Integer> productList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            productList.add(random.nextInt(60 - 18) + 18);
        }

        productList.forEach(productId -> {
            System.out.print(productId + " ");
        });
    }

    // Task 2. Stream API.
    //      Преобразовать коллекцию в другой тип
    //      Выбрать из мапы (string, person) людей с определенным номером профессии
    //      Получить значение одного из элеме
    private static void task_2() {
        Random random = new Random();
        Map<String, Person> personsMap = new HashMap<>();
        List<Person> personsList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String fullName = "Ivanov_" + (i + 1);
            String passport = String.valueOf(random.nextInt(222222) + 555555);
            List<String> professionNumbers = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                professionNumbers.add(String.valueOf(random.nextInt(5) + 1));
            }
            Person person = new Person(fullName, passport, professionNumbers);
            personsList.add(person);
            personsMap.put(fullName, person);
        }

        List<String> passports = personsList.stream()
                .map(person -> person.getPassport())
                .collect(Collectors.toList());

        System.out.println("passports = " + passports);

        String newList = personsMap.values().stream()
                .map(e -> e.getPassport())
                .filter(p -> p.startsWith("6"))
                .map(p -> "~" + p + "~")
                .findFirst()
                .orElseThrow();

        System.out.println("newList = " + newList);


    }


    // for Task 2
    static class Person {
        private String fullName;
        private String passport;
        private List<String> professionNumbers;

        public Person(String fullName, String passport, List<String> professionNumbers) {
            this.fullName = fullName;
            this.passport = passport;
            this.professionNumbers = professionNumbers;
        }

        public String getPassport() {
            return passport;
        }

        public List<String> getProfessionNumbers() {
            return professionNumbers;
        }

    }



}


