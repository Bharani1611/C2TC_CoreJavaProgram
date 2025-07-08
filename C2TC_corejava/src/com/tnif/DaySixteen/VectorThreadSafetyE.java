package com.tnif.DaySixteen;

import java.util.Vector;

public class VectorThreadSafetyE {
    public static void main(String[] args) {
        // Create a Vector shared by multiple threads
        Vector<Integer> numbers = new Vector<>();

        // Create and start two threads
        Thread producerThread = new Thread(new NumberProducer(numbers));
        Thread consumerThread = new Thread(new NumberConsumer(numbers));
        producerThread.start();
        consumerThread.start();
    }

    // Thread that produces numbers and adds them to the Vector
    static class NumberProducer implements Runnable {
        private final Vector<Integer> numbers;

        public NumberProducer(Vector<Integer> numbers) {
            this.numbers = numbers;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(1000); // Simulate delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (numbers) {
                    numbers.add(i);
                    System.out.println("Produced: " + i);
                    numbers.notify(); // Wake up the consumer
                }
            }
        }
    }

    // Thread that consumes numbers from the Vector
    static class NumberConsumer implements Runnable {
        private final Vector<Integer> numbers;

        public NumberConsumer(Vector<Integer> numbers) {
            this.numbers = numbers;
        }

        @Override
        public void run() {
            int consumed = 0;
            while (consumed < 5) {
                synchronized (numbers) {
                    if (!numbers.isEmpty()) {
                        int num = numbers.remove(0);
                        System.out.println("Consumed: " + num);
                        consumed++;
                    } else {
                        try {
                            numbers.wait(); // Wait for producer
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
