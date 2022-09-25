package oop.net.humans;

import java.util.Objects;

public class Human {
    private String name;
    private int yearOfBirth;
    private String town;
    private String job;

    public Human(String name, int yearOfBirth, String town, String job) {
        this.name = name;
        this.yearOfBirth = yearOfBirth > 0 ? yearOfBirth : 0;
        this.town = town;
        this.job = job;
    }

    public Human() {
        this("Информация не указана", 0, "Информация не указана", "Информация не указана");
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "Имя ='" + getName() + '\'' +
                ", год рождения =" + getYearOfBirth() +
                ", город ='" + getTown() +
                ", должность ='" + getJob();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return yearOfBirth == human.yearOfBirth && name.equals(human.name) && Objects.equals(town, human.town) && Objects.equals(job, human.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfBirth, town, job);
    }
}

