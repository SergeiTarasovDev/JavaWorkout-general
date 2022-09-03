package site.telion.oop.examclouds.task7_animals;

import site.telion.oop.examclouds.task7_animals.animals.Animal;

public class Veterinarian {
    private String clinicAddress;
    private int costTreatment;

    public Veterinarian(String clinicAddress, int costTreatment) {
        this.clinicAddress = clinicAddress;
        this.costTreatment = costTreatment;
    }

    public String getClinicAddress() {
        return clinicAddress;
    }

    public void setClinicAddress(String clinicAddress) {
        this.clinicAddress = clinicAddress;
    }

    public int getCostTreatment() {
        return costTreatment;
    }

    public void setCostTreatment(int costTreatment) {
        this.costTreatment = costTreatment;
    }

    public void treatAnimal(Animal animal) {
        System.out.println("Тип животного: " + animal.getType() +
                " Питание: " + animal.getFood() +
                " Место нахождения: " + animal.getLocation()
        );
    }
}
