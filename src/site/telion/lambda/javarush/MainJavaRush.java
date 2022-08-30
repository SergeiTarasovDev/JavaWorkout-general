package site.telion.lambda.javarush;

import java.util.Arrays;
import java.util.List;

public class MainJavaRush {

    public static void main(String[] args) {
        MainJavaRush mainJavaRush = new MainJavaRush();
        mainJavaRush.run();
    }

    public void run() {
        System.out.println("Lambda JavaRush:\r\n");
        example1();
        example2();
        example3();
        example4();
        example5();
    }

    public void example1() {
        Runnable r = () -> System.out.println("hello world");
    }

    public void example2() {
        new Thread(
                () -> {
                    System.out.println("hello world");
                    System.out.println();
                }
        ).start();

    }

    public void example3() {
        // вывод всех элементов массива
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.println("Старый способ:");
        for (Integer n : list) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("С использованием лямбда-выражения");
        list.forEach(n -> System.out.print(n + " "));
        System.out.println();

        System.out.println("С использование двойного двоеточия");
        list.forEach(System.out::println);
        System.out.println();
    }

    public void example4() {
//        () -> 42
    }

    public void example5() {
//        () -> { return 3.1415; }
    }
}
