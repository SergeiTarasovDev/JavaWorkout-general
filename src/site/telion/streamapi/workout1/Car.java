package site.telion.streamapi.workout1;

import java.time.LocalDate;

public class Car {
    private String brend;
    private String model;
    private LocalDate birthday;

    public Car(String brend, String model, LocalDate birthday) {
        this.brend = brend;
        this.model = model;
        this.birthday = birthday;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
