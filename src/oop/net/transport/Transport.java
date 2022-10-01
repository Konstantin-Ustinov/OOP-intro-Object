package oop.net.transport;

public class Transport {
    String brand;
    String model;
    String productionCountry;
    String color;
    int productionYear;
    int maxSpeed;

    public Transport(String brand, String model, String productionCountry, String color, int year, int maxSpeed) {
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
        if (productionCountry == null || "".equals(productionCountry)) {
            this.productionCountry = "Не указано";
        } else {
            this.productionCountry = productionCountry;
        }
        if (color == null || "".equals(color)) {
            this.color = "Не указано";
        } else {
            this.color = color;
        }
        this.productionYear = Math.max(year, 1900);
        this.maxSpeed = Math.max(maxSpeed, 0);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if (color == null || "".equals(color)) {
            this.color = "Не указано";
        } else {
            this.color = color;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = Math.max(maxSpeed, 0);
    }
}
