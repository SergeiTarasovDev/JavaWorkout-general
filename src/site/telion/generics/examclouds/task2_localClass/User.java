package site.telion.generics.examclouds.task2_localClass;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        class Query {
            public void printToLog() {
                System.out.printf("Пользователь с логином \"%s\" и паролем \"%s\" отправил запрос\r\n", login, password);
            }
        }
        new Query().printToLog();
    }

}
