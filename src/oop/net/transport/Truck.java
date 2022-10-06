package oop.net.transport;

public class Truck extends Transport implements Competing, Comparable {


    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
