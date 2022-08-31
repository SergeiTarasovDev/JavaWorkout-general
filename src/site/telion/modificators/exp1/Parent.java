package site.telion.modificators.exp1;

public class Parent {
    private int privateField;
    int defaultField;
    protected int protectedField;
    public int publicField;

    public Parent(int privateField, int defaultField, int protectedField, int publicField) {
        this.privateField = privateField;
        this.defaultField = defaultField;
        this.protectedField = protectedField;
        this.publicField = publicField;
    }
}
