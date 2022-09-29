package oop.net.flower;

public class Bouquet {
    private Flower[] bouquet;

    public Bouquet(Flower[] bouquet) {
        this.bouquet = bouquet != null ? bouquet : new Flower[0];
    }
    private double costBouquet() {
        double sum = 0;

        for (Flower flower : bouquet) {
            sum += flower.getCost();
        }
        return Math.round((sum * 1.1) * 100) / 100d;
    }

    private int lifeSpan() {
        int min = bouquet[0].getLifeSpan();

        for (Flower flower : bouquet) {
            if (min > flower.getLifeSpan()) {
                min = flower.getLifeSpan();
            }
        }

        return min;
    }

    @Override
    public String toString() {
        StringBuilder names = new StringBuilder();

        for (Flower flower : bouquet) {
            names.append(flower.getName()).append(", ");
        }

        return "Цветы в букете: " + names.toString() + "Стоимость: " + costBouquet() + ", Простоит дней: " +
                lifeSpan();
    }
}
