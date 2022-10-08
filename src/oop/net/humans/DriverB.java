package oop.net.humans;

import oop.net.transport.Car;

public class DriverB <T extends Car> extends Driver{

    public DriverB(String fio, boolean hasDriverLicense, int experience, String category) {
        super(fio, hasDriverLicense, experience, category);
    }
}
