package oop.net.humans;

import oop.net.transport.Transport;

public class Driver <T extends Transport & Comparable>{
    private String fio;
    private boolean hasDriverLicense;
    private int experience;
    private String category;

    public Driver(String fio, boolean hasDriverLicense, int experience, String category) {
        this.fio = fio;
        this.hasDriverLicense = hasDriverLicense;
        this.experience = experience;
        this.category = category;
    }


    public void startMove(T t) {
        System.out.println("Водитель " + getFio() + " Управляет автомобилем " + t.getBrand() +
        " " + t.getModel() + " и будет учавствовать в гонках.");
    }
    public void stopMove() {
        System.out.println("Водитель остановиля");
    }
    public void refill() {
        System.out.println("Водитель поехал на заправку");
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
