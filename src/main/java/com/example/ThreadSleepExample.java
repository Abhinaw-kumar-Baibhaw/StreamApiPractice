package com.example;

import java.util.Random;

public class ThreadSleepExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int threadId = i + 1;
            new Thread(() -> {
                try {
                    Random random = new Random();
                    while (true) {
                        System.out.println("Thread " + threadId + " is running: " + Thread.currentThread().getName());
                        Thread.sleep(random.nextInt(3000) + 1000); // sleep for 1-3 seconds
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}

