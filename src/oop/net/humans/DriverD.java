package oop.net.humans;

import oop.net.transport.Bus;

public class DriverD <T extends Bus> extends Driver{
    public DriverD(String fio, boolean hasDriverLicense, int experience, String category) {
        super(fio, hasDriverLicense, experience, category);
    }
}
