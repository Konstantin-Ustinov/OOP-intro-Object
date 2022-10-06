package oop.net.transport;


public class Car extends Transport implements Competing, Comparable {

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Марка: " + brand +
                ", Модель: " + model +
                ", Объем двигателя: ";
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Car car = (Car) o;
//        return Double.compare(car.engineVolume, engineVolume) == 0 && productionYear == car.productionYear && brand.equals(car.brand) && model.equals(car.model) && Objects.equals(color, car.color) && Objects.equals(productionCountry, car.productionCountry);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(brand, model, engineVolume, color, productionYear, productionCountry);
//    }

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
