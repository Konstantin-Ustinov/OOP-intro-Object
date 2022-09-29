package oop.net.cars;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;
    private String tiers = "Summer";
    private String reqNumber = "Не задано";

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand == null ? "default" : brand;
        this.model = model == null ? "default" : model;
        this.engineVolume = engineVolume;
        this.color = color == null ? "белый" : color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry == null ? "default" : productionCountry;
    }

    public Car() {
        this("default", "default", 1.5, "белый", 2000, "default");
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

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTiers() {
        return tiers;
    }

    public String getReqNumber() {
        return reqNumber;
    }

    public void setReqNumber(String reqNumber) {
        if (reqNumber.matches("[A-Z]\\d\\d\\d[A-z][A-z]\\d\\d\\d")) {
            this.reqNumber = reqNumber;
        } else {
            this.reqNumber = "Не задано";
        }

    }

    public void changeTiers() {
        if (tiers.equals("Summer")) {
            tiers = "winter";
        } else {
            tiers = "Summer";
        }
    }

    @Override
    public String toString() {
        return "Марка: " + brand +
                ", Модель: " + model +
                ", Объем двигателя: " + engineVolume +
                ", Цвет: " + color +
                ", Год выпуска: " + productionYear +
                ", Сборка: " + productionCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && productionYear == car.productionYear && brand.equals(car.brand) && model.equals(car.model) && Objects.equals(color, car.color) && Objects.equals(productionCountry, car.productionCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, productionYear, productionCountry);
    }
}
