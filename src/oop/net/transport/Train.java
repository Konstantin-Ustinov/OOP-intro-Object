package oop.net.transport;

import java.time.LocalDateTime;

public class Train extends Transport{
    private double ticketCost;
    private LocalDateTime departureTime;
    private String startState;
    private String endState;
    private int countWagons;

    public Train(String brand, String model, String productionCountry, String color, int year, int maxSpeed, double ticketCost, LocalDateTime departureTime, String startState, String endState, int countWagons) {
        super(brand, model, productionCountry, color, year, maxSpeed);
        this.ticketCost = Math.max(ticketCost, 0);
        this.departureTime = departureTime;
        if (startState == null || "".equals(startState)) {
            this.startState = "Не указано";
        } else {
            this.startState = startState;
        }
        if (endState == null || "".equals(endState)) {
            this.endState = "Не указано";
        } else {
            this.endState = endState;
        }
        this.countWagons = Math.max(countWagons, 0);
    }

    @Override
    public String toString() {
        return "Train{" +
                "ticketCost=" + ticketCost +
                ", departureTime=" + departureTime +
                ", startState='" + startState + '\'' +
                ", endState='" + endState + '\'' +
                ", countWagons=" + countWagons +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionCountry='" + productionCountry + '\'' +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
