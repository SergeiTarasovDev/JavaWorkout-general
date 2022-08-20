package site.telion.innopolis;

import java.util.Arrays;

public class MainInnopolis {

    public static void main(String[] args) {

//        example1_AnonymousClass();
//        exapmle2_AnonymousClass();
//        example3_FunctionalInterface();
//        example4_Lambda();
//        example5_Lambda();

    }

    public static void example1_AnonymousClass() {
        System.out.println("Пример 1. Использование анонимного класса");
        Example1_TextField textFieldWithMemory = new Example1_TextField() {

            private String previousValue;

            @Override
            public void beforeEnter() {
                this.previousValue = text;
            }

            @Override
            public void afterEnter() {
                if (this.text.equals("")) {
                    this.text = previousValue;
                }
            }
        };

        textFieldWithMemory.enter("Привет");
        textFieldWithMemory.enter("Как дела?");
        textFieldWithMemory.enter("");
        System.out.println(textFieldWithMemory.getText());
    }

    public static void exapmle2_AnonymousClass() {
        System.out.println("Пример 2. Использование анонимного класса");
        Example2_Processor processor = new Example2_Processor() {
            @Override
            public int from(String text) {
                return text.length();
            }

            @Override
            public String from(int number) {
                return "Число - " + number;
            }
        };

        System.out.println(processor.from(135));
        System.out.println(processor.from("135"));
    }

    public static void example3_FunctionalInterface() {
        System.out.println("Пример 3. Использование функционального интерфейса");
        Example3_TextField textField = new Example3_TextField();
        textField.enter("Привет!");
        System.out.println("Исходный текст: " + textField.getText());

        Example3_Mapper toLowerCaseMapper = new Example3_Mapper() {
            @Override
            public String map(String string) {
                return string.toLowerCase();
            }
        };

        Example3_Mapper toUpperCaseMapper = new Example3_Mapper() {
            @Override
            public String map(String string) {
                return string.toUpperCase();
            }
        };

        Example3_Mapper replaceLettersMapper = new Example3_Mapper() {
            @Override
            public String map(String string) {
                string = string.toLowerCase();
                char[] characters = string.toCharArray();
                for (int i = 0; i < characters.length; i++) {
                    if (characters[i] == 'п') {
                        characters[i] = 'p';
                    }
                    if (characters[i] == 'р') {
                        characters[i] = 'r';
                    }
                    if (characters[i] == 'и') {
                        characters[i] = 'i';
                    }
                    if (characters[i] == 'в') {
                        characters[i] = 'v';
                    }
                    if (characters[i] == 'с') {
                        characters[i] = '$';
                    }
                }
                return new String(characters);
            }
        };

        textField.replaceStringByMapper(toLowerCaseMapper);
        System.out.println("toLowerCaseMapper: " + textField.getText());

        textField.replaceStringByMapper(toUpperCaseMapper);
        System.out.println("toUpperCaseMapper: " + textField.getText());

        textField.replaceStringByMapper(replaceLettersMapper);
        System.out.println("replaceLettersMapper: " + textField.getText());

    }

    public static void example4_Lambda() {
        System.out.println("Пример 4. Использование лямбда выражений");
        Example4_TextField textField = new Example4_TextField();
        textField.enter("Привет!");

        Example4_Mapper toLowerCaseMapper = string -> string.toLowerCase();
        Example4_Mapper toUpperCaseMapper = string -> string.toUpperCase();
        Example4_Mapper replaceLettersMapper = string -> {
            string = string.toLowerCase();
            char[] characters = string.toCharArray();
            for (int i = 0; i < characters.length; i++) {
                if (characters[i] == 'п') {
                    characters[i] = 'p';
                }
                if (characters[i] == 'р') {
                    characters[i] = 'r';
                }
                if (characters[i] == 'и') {
                    characters[i] = 'i';
                }
                if (characters[i] == 'в') {
                    characters[i] = 'v';
                }
                if (characters[i] == 'с') {
                    characters[i] = '$';
                }
            }
            return new String(characters);
        };

        textField.replaceStringByMapper(toLowerCaseMapper);
        System.out.println("toLowerCaseMapper: " + textField.getText());

        textField.replaceStringByMapper(toUpperCaseMapper);
        System.out.println("toUpperCaseMapper: " + textField.getText());

        textField.replaceStringByMapper(replaceLettersMapper);
        System.out.println("replaceLettersMapper: " + textField.getText());

    }

    private static void example5_Lambda() {
        System.out.println("Пример 5. Использование лямбда выражений");
        System.out.println("Исходный массив");
        int[] array = {12, 16, 782, 987, 101, 501};

        System.out.println("Остаток от деления элементов массива на 10");
        int[] a = Example5_Sequence.map(array, number -> number % 10);
        System.out.println(Arrays.toString(a));

        System.out.println("Вычисление попарного произведения элементов массива");
        int b[] = Example5_Sequence.process(array, (first, second) -> first * second);
        System.out.println(Arrays.toString(b));
    }
}
