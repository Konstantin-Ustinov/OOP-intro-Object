package oop.net.transport;


public class Car extends Transport implements Competing, Comparable {

    public enum BodyType { SEDAN, HATCHBACK, COUPE, UNIVERSAL, OFF_ROAD, ALL_ROAD, PICKUP, VAN, MINIVAN}

    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Марка: " + getBrand() +
                ", Модель: " + getModel() +
                ", Объем двигателя: ";
    }


    public void defineBodyType() {
        if (bodyType == null ) {
            System.out.println("данных по авто недостаточно");
        } else {
            System.out.println(getBodyType());
        }
    }

    @Override
    public void startMove() {
        System.out.println("Машина начала движение.");

    }

    @Override
    public void endMove() {
        System.out.println("Машина остановилась.");

    }

    @Override
    public void pitStop() {
        System.out.println("Машина заехала на питстоп.");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Машина едет быстро.");

    }

    @Override
    public void bestTime() {
        System.out.println("Машина едет лучший круг.");

    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
