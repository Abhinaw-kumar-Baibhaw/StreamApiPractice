package com.example;

class SharedResource {
    private int data = 0;

    public synchronized void produceData() throws InterruptedException {
        while (data != 0) {
            wait();
        }
        data = 1;
        System.out.println("Produced: " + data);
        notify();
    }

    public synchronized void consumeData() throws InterruptedException {
        while (data == 0) {
            wait();
        }
        data = 0;
        System.out.println("Consumed: " + data);
        notify();
    }
}
