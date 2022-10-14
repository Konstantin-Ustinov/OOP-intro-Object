package oop.net.humans;

import oop.net.transport.Truck;

public class DriverC <T extends Truck> extends Driver {
    public DriverC(String fio, boolean hasDriverLicense, int experience, String category) {
        super(fio, hasDriverLicense, experience, category);
    }
}
