package site.telion.lambda.javarush;

import java.util.Arrays;
import java.util.List;

public class lambdaWithStream {
    private static final List<Integer> LIST = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

    public static void main(String[] args) {
//        System.out.println("Task. Возвести все числа массива в квадрат:");
//        squareNumbers(list);

        System.out.println("Task. Вывести сумму квадратов элементов списка:");
        printSumSquareNumbers();


    }

    public static void squareNumbers() {
        System.out.println("без лямбды:");
        for (Integer n : LIST) {
            int x = n * n;
            System.out.println(n + "^2 = " + x);
        }
        System.out.println();

        System.out.println("с лямбдой:");
        LIST.stream().map((x) -> x * x).forEach(System.out::println);
    }

    public static void printSumSquareNumbers() {
        printSumSquareNumbersWithoutLambda();
        printSumSquareNumbersWithLambda();
    }

    private static void printSumSquareNumbersWithoutLambda() {
        System.out.println("без лямбды:");
        int sum = 0;
        for (Integer n : LIST) {
            int x = n * n;
            sum = sum + x;
        }
        System.out.println("sum = " + sum);
        System.out.println();
    }

    private static void printSumSquareNumbersWithLambda() {
        System.out.println("с лямбдой:");
        int sum = LIST
                .stream()
                .map(x -> x * x)
                .reduce((x, y) -> x + y)
                .get();
        System.out.println("sum = " + sum);
    }

}
