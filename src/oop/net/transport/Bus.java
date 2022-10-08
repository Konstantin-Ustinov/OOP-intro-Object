package oop.net.transport;

public class Bus extends Transport implements Competing, Comparable {

    public enum Capacity {EXTRA_SMALL, SMALL, MEDIUM, LARGE, EXTRA_LARGE}

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.println("Автобус начал движение.");

    }

    @Override
    public void endMove() {
        System.out.println("Автобус остановился.");

    }


    @Override
    public void pitStop() {
        System.out.println("Автобус заехал на питстоп.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Автобус едет с максимальной скоростью.");

    }

    @Override
    public void bestTime() {
        System.out.println("Автобус Автобус проехал лучший круг.");

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
