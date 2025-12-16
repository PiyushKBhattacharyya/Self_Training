package Multithreading.Exercises;

import java.util.LinkedList;

/*
 * Exercise: Producer-Consumer
 * 
 * 1. Create a SharedBuffer class with a fixed capacity.
 * 2. Implement produce() method: wait if full, add item, notify.
 * 3. Implement consume() method: wait if empty, remove item, notify.
 * 4. Create Producer and Consumer threads to test.
 */

class SharedBuffer {
    private LinkedList<Integer> list = new LinkedList<>();
    private int capacity = 2;

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (list.size() == capacity)
                    wait();

                System.out.println("Producer produced-" + value);
                list.add(value++);
                notify();
                Thread.sleep(1000); // Simulate work
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (list.size() == 0)
                    wait();

                int val = list.removeFirst();
                System.out.println("Consumer consumed-" + val);
                notify();
                Thread.sleep(1000); // Simulate work
            }
        }
    }
}

public class ProducerConsumerExercise {
    public static void main(String[] args) throws InterruptedException {
        final SharedBuffer buffer = new SharedBuffer();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    buffer.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    buffer.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
