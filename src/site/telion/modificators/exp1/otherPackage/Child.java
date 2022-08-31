package site.telion.modificators.exp1.otherPackage;

import site.telion.modificators.exp1.Parent;

public class Child extends Parent {
    public Child(int privateField, int defaultField, int protectedField, int publicField) {
        super(privateField, defaultField, protectedField, publicField);
    }

    public void printFields() {
        this.privateField = 2;
        this.defaultField = 2;
        this.protectedField = 2;
        this.publicField = 2;
    }
}
