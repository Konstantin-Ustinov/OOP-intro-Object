package oop.net.transport;

import java.time.LocalDateTime;
import java.util.Objects;

public class Car extends Transport {

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

    }

    @Override
    public void endMove() {

    }
}
