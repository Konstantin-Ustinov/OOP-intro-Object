package oop.net.humans;

import oop.net.transport.Transport;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Mechanic <T extends Transport> extends Human  {
    private String lastName;
    private String company;
    private List<T> specializations;

    public Mechanic(String name, String lastName, int yearOfBirth, String town, String job, String company, T[] specializations) {
        super(name, yearOfBirth, town, job);
        this.lastName = lastName;
        this.company = company;
        //this.specializations.addAll(Arrays.asList(specializations));
    }

    public void servicing() {
        System.out.println("Механик обслуживает машину " + specializations.get(0).getModel());
    }

    public void fixingCar() {
        System.out.println("Механик чинит машину " + specializations.get(0).getModel());
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<T> getSpecializations() {
        return specializations;
    }

    public void setSpecializations(T specialization) {
        this.specializations.add(specialization);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return lastName.equals(mechanic.lastName) && company.equals(mechanic.company) && specializations.equals(mechanic.specializations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lastName, company, specializations);
    }
}
