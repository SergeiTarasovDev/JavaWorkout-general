package site.telion.lambda.javarush;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.println("Выводит все числа: ");
        evaluate(list, (n) -> true);

        System.out.println("Не выводит ни одного числа:");
        evaluate(list, (n) -> false);

        System.out.println("Вывод четных чисел:");
        evaluate(list, (n) -> n % 2 == 0);

        System.out.println("Вывод нечетных чисел");
        evaluate(list, (n) -> n % 2 == 1);

        System.out.println("Вывод чисел больше 5");
        evaluate(list, (n) -> n > 5);
    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n : list) {
            if (predicate.test(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
