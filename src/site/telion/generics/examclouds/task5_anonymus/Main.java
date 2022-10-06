package site.telion.generics.examclouds.task5_anonymus;

public class Main {
    public static void main(String[] args) {
        Food food = new Food();
        Cookable cookable = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println(str);
            }
        };
        food.prepare(cookable, "готовлю печеньку");
    }
}
