package oop.net.humans;

import java.util.Objects;

public class Sponsor extends Human{
    private int amountSupport; // Сделал это поле, но пользоваться не буду. Буду параметром в метод.


    public Sponsor(String name, int yearOfBirth, String town, String job) {
        super(name, yearOfBirth, town, job);
    }

    public void sponsoring(int amountSupport) {
        System.out.println("Спонсор проспонсировал " + amountSupport);
    }

    @Override
    public String toString() {
        return "Sponsor{} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sponsor sponsor = (Sponsor) o;
        return amountSupport == sponsor.amountSupport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amountSupport);
    }
}
