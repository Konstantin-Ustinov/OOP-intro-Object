package oop.net.transport;

import oop.net.humans.Driver;
import oop.net.humans.Mechanic;
import oop.net.humans.Sponsor;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    private final List<Driver> drivers = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();
    private final List<Mechanic> mechanics = new ArrayList<>();

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || "".equals(brand)) {
            this.brand = "Не указано";
        } else {
            this.brand = brand;
        }
        if (model == null || "".equals(model)) {
            this.model = "Не указано";
        } else {
            this.model = model;
        }
        this.engineVolume = Math.max(engineVolume, 0);
    }

    public abstract void startMove();

    public abstract void endMove();

    public abstract boolean passDiagnostics();

    public List<Driver> getDrivers() {
        return drivers;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = Math.max(engineVolume, 0);
    }

}
