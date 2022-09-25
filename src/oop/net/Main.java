package oop.net;

import oop.net.humans.Human;
import oop.net.cars.Car;

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

        Car[] cars = new Car[6];
        fillCarsArray(cars);

        for (Car car : cars) {
            System.out.println(car.toString());
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
        cars[0] = new Car("Lada", "Grande", 1.7, "желтый", 2015, "Россия");
        cars[1] = new Car("Audi", "A8", 3.0, "черный", 2020, "Германия");
        cars[2] = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        cars[3] = new Car("Kia", "Sportage 4 поколение", 2.4, "красный", 2018, "Южная Корея");
        cars[4] = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        cars[5] = new Car();
    }
}
