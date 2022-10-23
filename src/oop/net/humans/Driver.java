package oop.net.humans;

import oop.net.exceptions.EmptyCategoryDriverException;
import oop.net.transport.Transport;

import java.util.Objects;

public class Driver <T extends Transport & Comparable>{
    private String fio;
    private boolean hasDriverLicense;
    private int experience;
    private String category;
    private Transport transport;

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

    public String getCategory() {
        if (!category.isEmpty()) {
            return category;
        } else throw new EmptyCategoryDriverException("Категория прав не заполненна.");
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fio='" + fio + '\'' +
                ", hasDriverLicense=" + hasDriverLicense +
                ", experience=" + experience +
                ", category='" + category + '\'' +
                ", transport=" + transport +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return hasDriverLicense == driver.hasDriverLicense && experience == driver.experience && fio.equals(driver.fio) && category.equals(driver.category) && transport.equals(driver.transport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, hasDriverLicense, experience, category, transport);
    }
}
