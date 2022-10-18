package oop.net.stations;

import oop.net.transport.Bus;
import oop.net.transport.Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {
    private Queue<T> queue = new LinkedList<>();

    public void addTransportToQueue(T transport) {
        if (!(transport instanceof Bus)) {
            queue.offer(transport);
        } else {
            System.out.println("Автобусы не нуждаются в ТО");
        }
    }

    public String servicing() {
        if (queue.poll() != null) {
            return "Выполненно ТО над " + queue.poll();
        } else {
            return null;
        }
    }
}
