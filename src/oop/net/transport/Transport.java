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
    private List<Driver> drivers = new ArrayList<>();
    private List<Sponsor> sponsors = new ArrayList<>();
    private List<Mechanic> mechanics = new ArrayList<>();

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

    public void addDriver(Driver driver) {
        try {
            drivers.add(driver);
        } catch (NullPointerException e) {
            System.out.println("Ошибка занесения Водителя в Транспорт. Водитель null");
        }

    }

    public List<Driver> getDrivers() {
        if (drivers != null) {
            return drivers;
        } else {
            throw new RuntimeException("Водитель не указан");
        }
    }

    public void addSponsors(Sponsor sponsor) {
        sponsors.add(sponsor);
    }

    public List<Sponsor> getSponsors() {
        if (sponsors != null) {
            return sponsors;
        } else {
            throw new RuntimeException("Спонсор не указан");
        }
    }

    public void addMechanics(Mechanic mechanic) {
        try {
            mechanics.add(mechanic);
        } catch (NullPointerException e) {
            System.out.println("Ошибка занесения Механика в Транспорт. " + e.getMessage());
        }

    }

    public List<Mechanic> getMechanics() {
        if (mechanics != null) {
            return mechanics;
        } else {
            throw new RuntimeException("Механик не указан");
        }
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
