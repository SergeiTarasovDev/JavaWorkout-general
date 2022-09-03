package site.telion.oop.examclouds.task7_animals.animals;

public abstract class Animal {
    private String food;
    private String location;
    private String name;
    private String type;
    private int age;

    public Animal(String food, String location, String name, int age) {
        this.food = food;
        this.location = location;
        this.name = name;
        this.age = age;
    }

    public abstract void makeNoise();

    public abstract void eat();

    public void sleap() {
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
