package oop.net.flower;

public class Flower {
    private String name;
    private String country;
    private double cost;
    private int lifeSpan;

    public Flower(String name, String country, double cost, int lifeSpan) {
        if (name == null || "".equals(name)) {
            this.name = "Не указано";
        } else {
            this.name = name;
        }
        if (country == null || "".equals(country)) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1.00;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || "".equals(name)) {
            this.name = "Не указано";
        } else {
            this.name = name;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || "".equals(country)) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1.00;
        } else {
            this.cost = cost;
        }
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    @Override
    public String toString() {
        return "Название: " + name +
                ", Страна: " + country +
                ", Цена: " + cost +
                ", Срок стояния: " + lifeSpan;
    }
}
