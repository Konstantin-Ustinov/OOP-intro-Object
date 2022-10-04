package oop.net.transport;

import java.time.LocalDateTime;

public class Track extends Transport{


    public Track(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {

    }

    @Override
    public void endMove() {

    }

//    @Override
//    public String toString() {
//        return "Track{" +
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
