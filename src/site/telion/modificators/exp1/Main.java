package site.telion.modificators.exp1;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent(1, 1, 1, 1);
        parent.privateField = 2;
        parent.defaultField = 2;
        parent.protectedField = 2;
        parent.publicField = 2;

    }
}
