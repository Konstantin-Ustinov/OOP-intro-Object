package oop.net.transport;


public class Car extends Transport implements Competing, Comparable {

    public enum BodyType { SEDAN, HATCHBACK, COUPE, UNIVERSAL, OFF_ROAD, ALL_ROAD, PICKUP, VAN, MINIVAN}

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Марка: " + getBrand() +
                ", Модель: " + getModel() +
                ", Объем двигателя: ";
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

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
