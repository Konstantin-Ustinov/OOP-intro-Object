package oop.net.transport;

public class Truck extends Transport implements Competing, Comparable {

    public enum Tonnage {
        N1("с полной массой до 3,5 тонн"),
        N2("с полной массой свыше 3,5 до 12 тонн"),
        N3("с полной массой свыше 12 тонн");

        private final String value;

        Tonnage(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    private Tonnage tonnage;

    public Truck(String brand, String model, double engineVolume, Tonnage tonnage) {
        super(brand, model, engineVolume);
        this.tonnage = tonnage;
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик поехал.");
    }

    @Override
    public void endMove() {
        System.out.println("Грузовик остановился.");
    }

    @Override
    public boolean passDiagnostics() {
        return (Math.random() * 2) == 1;
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик заехал на питстоп.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Грузовик едет на максималках.");
    }

    @Override
    public void bestTime() {
        System.out.println("Грузовик едет лучший круг.");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public void defineTonnage() {
        if (tonnage == null ) {
            System.out.println("данных по авто недостаточно");
        } else {
            System.out.println(getTonnage().value);
        }
    }

    public Tonnage getTonnage() {
        return tonnage;
    }

    public void setTonnage(Tonnage tonnage) {
        this.tonnage = tonnage;
    }

    //    @Override
//    public String toString() {
//        return "Truck{" +
//                "ticketCost=" + ticketCost +
//                ", departureTime=" + departureTime +
//                ", startState='" + startState + '\'' +
//                ", endState='" + endState + '\'' +
//                ", countWagons=" + countWagons +
//                ", brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", productionCountry='" + productionCountry + '\'' +
//                ", color='" + color + '\'' +
//                ", productionYear=" + productionYear +
//                ", maxSpeed=" + maxSpeed +
//                '}';
//    }
}
