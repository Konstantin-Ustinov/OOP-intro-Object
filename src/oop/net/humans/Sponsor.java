package oop.net.humans;

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
}
