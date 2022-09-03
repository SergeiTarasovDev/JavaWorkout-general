package site.telion.modificators.exp1.otherPackage;

import site.telion.modificators.exp1.Parent;

public class NotChild {

    public void printText() {
        Parent parent = new Parent(1, 1, 1, 1);
//        parent.privateField = 2;
//        parent.defaultField = 2;
//        parent.protectedField = 2;
        parent.publicField = 2;
    }
}
