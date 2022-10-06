package site.telion.generics.examclouds.task1_nonStaticInnerClass;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public class Query {
        public void printToLog() {
            System.out.printf("Пользователь с логином: \"%s\" и паролем: \"%s\" отправил сообщение\r\n", login, password);
        }
    }

}

