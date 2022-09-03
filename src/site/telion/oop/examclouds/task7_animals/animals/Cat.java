package site.telion.oop.examclouds.task7_animals.animals;

public class Cat extends Animal {
    private String catValue;

    public Cat(String food, String location, String name, int age, String catValue) {
        super(food, location, name, age);
        this.setType("cat");
        this.catValue = catValue;
    }

    public String getCatValue() {
        return catValue;
    }

    public void setCatValue(String catValue) {
        this.catValue = catValue;
    }

    @Override
    public void makeNoise() {
        System.out.println("meow");
    }

    @Override
    public void eat() {
        System.out.println("fish");
    }
}
