package oop.net;

import oop.net.exceptions.WrongPassDiagnosticsException;
import oop.net.flower.Bouquet;
import oop.net.humans.*;
import oop.net.transport.*;
import oop.net.flower.Flower;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1,2");

        Human[] humans = new Human[5];
        fillHumansArray(humans);

        for (Human h : humans) {
            System.out.printf("Привет! Меня зовут %s. Я из города %s. Я родился в %d году. " +
                    "Я работаю на должности %s. Будем знакомы!",
                    h.getName(), h.getTown(), h.getYearOfBirth(), h.getJob());
            System.out.println();
        }

        System.out.println("Task 3");

        Car[] cars = new Car[4];
        fillCarsArray(cars);

        for (Car car : cars) {
            System.out.println(car.toString());
        }

        System.out.println("Task 4");

        Flower[] flowers = new Flower[4];
        fillFlowersArray(flowers);

        for (Flower flower : flowers) {
            System.out.println(flower.toString());
        }

        System.out.println("Создаем букет");
        Bouquet bouquet = new Bouquet(flowers);
        System.out.println(bouquet.toString());

        System.out.println("Task 5");

        Truck[] trucks = new Truck[4];
        fillTracksArray(trucks);

        for (Truck truck : trucks) {
            System.out.println(truck.toString());
            truck.defineTonnage();
        }

        System.out.println("Task 6");

        Bus[] buses = new Bus[4];
        fillBusesArray(buses);

        for (Bus bus : buses) {
            System.out.println(bus.toString());
            bus.defineCapacity();
        }

        System.out.println("Task 7");

        Competing[][] competing = {cars, buses, trucks};

        for (int i = 0; i < competing.length; i++) {
            for (int j = 0; j < competing[i].length; j++) {
                competing[i][j].pitStop();
                competing[i][j].bestTime();
                competing[i][j].maxSpeed();
            }
        }

        System.out.println("Task 8");

        DriverB<Car> paul = new DriverB<>("Paul", true, 3, "B");
        DriverD<Bus> ben = new DriverD<>("Ben", true, 6, "");
        DriverC<Truck> mia = new DriverC<>("Mia", true, 4, "C");
        paul.startMove(cars[0]);
        //ben.getCategory();
        ben.startMove(buses[0]);
        mia.startMove(trucks[0]);

        System.out.println("Task Exceptions");

        Transport[][] transports = {cars, buses, trucks};

        for (int i = 0; i < transports.length; i++) {
            for (int j = 0; j < transports[i].length; j++) {
                if (transports[i][j].passDiagnostics()) {
                    System.out.println("Диагностика " + transports[i][j].getModel() + " пройдена");
                } else if (!(transports[i][j] instanceof Bus)){
                    throw new WrongPassDiagnosticsException("Диагностика " + transports[i][j].getModel() + " не пройдена");
                }
            }
        }

    }

    private static void fillHumansArray(Human[] humans) {
        humans[0] = new Human("Максим", 1987, "Минск", "бренд-менеджер");
        humans[1] = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        humans[2] = new Human("Катя", 1994, "Калининград", "продакт-менеджер");
        humans[3] = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");
        humans[4] = new Human();
    }

    private static void fillCarsArray(Car[] cars) {
        cars[0] = new Car("Lada", "Grande", 1.7, Car.BodyType.COUPE);
        cars[1] = new Car("Audi", "A8", 3.0, Car.BodyType.OFF_ROAD);
        cars[2] = new Car("BMW", "Z8", 3.0, Car.BodyType.SEDAN);
        cars[3] = new Car("Kia", "Sportage 4 поколение", 2.4, Car.BodyType.ALL_ROAD);
    }

    private static void fillFlowersArray(Flower[] flowers) {
        flowers[0] = new Flower("Роза обыкновенная", "Голландия", 35.59,0);
        flowers[1] = new Flower("Хризантема", "", 15.00,5);
        flowers[2] = new Flower("Пион", "англия", 69.90,1);
        flowers[3] = new Flower("Гипсофила", "Турция", 19.50,10);
    }

    private static void fillTracksArray(Truck[] trucks) {
        trucks[0] = new Truck("HOWO", "h5", 5.6, Truck.Tonnage.N1);
        trucks[1] = new Truck("Mercedes", "m85", 8.6, Truck.Tonnage.N2);
        trucks[2] = new Truck("Haval", "maven", 4.9, Truck.Tonnage.N1);
        trucks[3] = new Truck("KIA", "mia", 9.4, Truck.Tonnage.N3);

    }

    private static void fillBusesArray(Bus[] buses) {
        buses[0] = new Bus("volkswagen", "transporter", 3.2, Bus.Capacity.LARGE);
        buses[1] = new Bus("Mercedes", "sprinter", 6.6, Bus.Capacity.MEDIUM);
        buses[2] = new Bus("Haval", "bus", 4.9, Bus.Capacity.EXTRA_SMALL);
        buses[3] = new Bus("KIA", "busik", 5.2, Bus.Capacity.MEDIUM);

    }


}
