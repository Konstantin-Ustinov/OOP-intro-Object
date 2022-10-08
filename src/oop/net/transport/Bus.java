package oop.net.transport;

public class Bus extends Transport implements Competing, Comparable {

    public enum Capacity {
        EXTRA_SMALL("особо малая (до 10 мест)"),
        SMALL("малая (до 25)"),
        MEDIUM("средняя (40–50)"),
        LARGE("большая (60–80)"),
        EXTRA_LARGE("особо большая (100–120 мест)");

        private final String value;

        Capacity(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public void defineCapacity() {
        if (capacity == null ) {
            System.out.println("данных по авто недостаточно");
        } else {
            System.out.println(getCapacity());
        }
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

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }
}
