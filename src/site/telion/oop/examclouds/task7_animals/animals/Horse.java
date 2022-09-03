package site.telion.oop.examclouds.task7_animals.animals;

public class Horse extends Animal {
    private boolean isHorseRacer;

    public Horse(String food, String location, String name, int age, boolean isHorseRacer) {
        super(food, location, name, age);
        this.setType("horse");
        this.isHorseRacer = isHorseRacer;
    }

    public boolean isHorseRacer() {
        return isHorseRacer;
    }

    public void setHorseRacer(boolean horseRacer) {
        isHorseRacer = horseRacer;
    }

    @Override
    public void makeNoise() {
        System.out.println("i-go-go");
    }

    @Override
    public void eat() {
        System.out.println("oats");
    }
}
