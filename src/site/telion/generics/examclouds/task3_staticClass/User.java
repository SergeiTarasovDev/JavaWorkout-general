package site.telion.generics.examclouds.task3_staticClass;

public class User {
    private static String login;
    private static String password;

    public static class Query {
        public void printToLog() {
            System.out.printf("Пользователь с логином: \"%s\" и паролем: \"%s\" отправил сообщение\r\n", login, password);
        }
    }

    public static void initialize(String login, String password) {
        User.login = login;
        User.password = password;
    }


}

