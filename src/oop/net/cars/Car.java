package oop.net.cars;

import java.time.LocalDateTime;
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
    private Key key;
    private Insurance insurance;

    class Key {
        private boolean remoteStartEngine;
        private boolean notKeyEnter;

        public Key(boolean remoteStartEngine, boolean notKeyEnter) {
            this.remoteStartEngine = remoteStartEngine;
            this.notKeyEnter = notKeyEnter;
        }

        public boolean isRemoteStartEngine() {
            return remoteStartEngine;
        }

        public void setRemoteStartEngine(boolean remoteStartEngine) {
            this.remoteStartEngine = remoteStartEngine;
        }

        public boolean isNotKeyEnter() {
            return notKeyEnter;
        }

        public void setNotKeyEnter(boolean notKeyEnter) {
            this.notKeyEnter = notKeyEnter;
        }
    }

    public class Insurance {
        private LocalDateTime validPeriod;
        private double cost;
        private String number;

        public Insurance() {
            this.validPeriod = LocalDateTime.MIN;
            this.cost = 0;
            this.number = "Не указано";
        }

        public Insurance(LocalDateTime validPeriod, double cost, String number) {
            this.validPeriod = validPeriod;
            this.cost = cost;
            this.number = number;
        }

        public void checkValidPeriod() {
            if (LocalDateTime.now().isAfter(validPeriod)) {
                System.out.println("Срочно оформить страховку!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println( "Номер страховки некорректный!");
            }
        }

        public LocalDateTime getValidPeriod() {
            return validPeriod;
        }

        public void setValidPeriod(LocalDateTime validPeriod) {
            this.validPeriod = validPeriod;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "validPeriod=" + validPeriod +
                    ", cost=" + cost +
                    ", number='" + number + '\'' +
                    '}';
        }
    }

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

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        if (insurance != null) {
            return insurance;
        } else {
            return new Insurance();
        }

    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
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
                ", Сборка: " + productionCountry +
                "\n Страховка: " + getInsurance();
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
