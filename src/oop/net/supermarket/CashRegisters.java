package oop.net.supermarket;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class CashRegisters {
    private Queue<String> queue1 = new ArrayBlockingQueue<>(5);
    private Queue<String> queue2 = new ArrayBlockingQueue<>(5);
    private Queue<String> queue3 = new ArrayBlockingQueue<>(5);

    public CashRegisters() {
        this.queue1.add("John");
        this.queue1.add("Adam");
        this.queue1.add("Sarah");

        this.queue2.add("Murzic");
        this.queue2.add("Jopic");
        this.queue2.add("Kotic");
        this.queue2.add("Shprotic");
    }

    public void addToQueue(String name) {
        if (queue1.size() < queue2.size()) {
            queue1.add(name);
            System.out.println("В очередь 1 добавлен.");
        } else {
            try {
                queue2.add(name);
                System.out.println("В очередь 2 добавлен.");
            } catch (IllegalStateException e) {
                try {
                    queue3.add(name);
                    System.out.println("В очередь 3 добавлен.");
                } catch (IllegalStateException exception) {
                    System.out.println("Все касы заняты, ожидайте.");
                }
            }
        }
        System.out.println("Первая очередь:");
        System.out.println(queue1);
        System.out.println("Вторая очередь:");
        System.out.println(queue2);
        System.out.println("Третья очередь:");
        System.out.println(queue3);
    }

    public void removeFromQueue(String name) {
        if (queue1.remove(name)) {
            System.out.println(name + " Удален из первой очереди.");
        } else if (queue2.remove(name)) {
            System.out.println(name + " Удален из второй очереди.");
        } else if (queue3.remove(name)) {
            System.out.println(name + " Удален из третьей очереди.");
        } else {
            System.out.println(name + " нет ни в одной очереди.");
        }
    }

    public void removeFromQueue() {
       int num = new Random().nextInt(3);
        switch (num) {
            case 0: if (queue1.size() > 0) {
                        queue1.poll();
                        System.out.println("Обслужен из первой очереди.");
                    } else {
                        System.out.println("Очередь пуста.");
                    } break;
            case 1: if (queue2.size() > 0) {
                        queue2.poll();
                        System.out.println("Обслужен из второй очереди.");
                    } else {
                        System.out.println("Очередь пуста.");
                    } break;
            case 2: if (queue3.size() > 0) {
                        queue3.poll();
                        System.out.println("Обслужен из третьей очереди.");
                    } else {
                        System.out.println("Очередь пуста.");
                    } break;
            default: System.out.println("Такой очереди нет.");
        }
    }
}
