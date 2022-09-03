package site.telion.oop.examclouds.task7_animals.animals;

public class Dog extends Animal {
    private String agression;
    private String training;

    public Dog(String food, String location, String name, int age, String agression, String training) {
        super(food, location, name, age);
        this.setType("dog");
        this.agression = agression;
        this.training = training;
    }

    public String getAgression() {
        return agression;
    }

    public void setAgression(String agression) {
        this.agression = agression;
    }

    public String getTraining() {
        return training;
    }

    public void setTraining(String training) {
        this.training = training;
    }

    @Override
    public void makeNoise() {
        System.out.println("gav-gav");
    }

    @Override
    public void eat() {
        System.out.println("bones");
    }
}
