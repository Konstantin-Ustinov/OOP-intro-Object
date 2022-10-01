package oop.net;

import oop.net.flower.Bouquet;
import oop.net.humans.Human;
import oop.net.transport.Car;
import oop.net.transport.Car.Insurance;
import oop.net.flower.Flower;
import oop.net.transport.Train;

import java.time.LocalDateTime;

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

        Train[] trains = new Train[2];
        fillTrainsArray(trains);

        for (Train train : trains) {
            System.out.println(train.toString());
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
        Insurance insurance = cars[0].new Insurance(LocalDateTime.of(2022, 12, 23, 00,00),1984.20, "23YB34567");
        cars[0].setInsurance(insurance);
        cars[1] = new Car("Audi", "A8", 3.0, "черный", 2020, "Германия");
        cars[2] = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        cars[3] = new Car("Kia", "Sportage 4 поколение", 2.4, "красный", 2018, "Южная Корея");
        cars[4] = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        cars[5] = new Car();
    }

    private static void fillFlowersArray(Flower[] flowers) {
        flowers[0] = new Flower("Роза обыкновенная", "Голландия", 35.59,0);
        flowers[1] = new Flower("Хризантема", "", 15.00,5);
        flowers[2] = new Flower("Пион", "англия", 69.90,1);
        flowers[3] = new Flower("Гипсофила", "Турция", 19.50,10);
    }

    private static void fillTrainsArray(Train[] trains) {
        trains[0] = new Train("Ласточка", "B-901", "Россия","",
                2011, 301, 3500, LocalDateTime.of(2022, 9, 28, 00, 00),
                "Белорусский вокзал", "Минск-Пассажирский", 11);
        trains[1] = new Train("Ленинград", "D-125", "Россия","",
                2019, 270, 1700, LocalDateTime.of(2022, 9, 28, 00, 00),
                "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
    }
}
