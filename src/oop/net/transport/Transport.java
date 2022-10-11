package oop.net.transport;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

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
