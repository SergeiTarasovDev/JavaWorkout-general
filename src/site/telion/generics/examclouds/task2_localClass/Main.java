package site.telion.generics.examclouds.task2_localClass;

public class Main {
    public static void main(String[] args) {
        User user = new User("www.neon", "dalsdkjflaskfj");
        user.createQuery();

        new User("1", "2").createQuery();
    }
}
