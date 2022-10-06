package site.telion.generics.examclouds.task1_nonStaticInnerClass;

public class Main {
    public static void main(String[] args) {

        User user = new User("www.neon", "pass");
        user.createQuery();

        user.new Query().printToLog();

        new User("Telion", "tln").new Query().printToLog();
    }
}
