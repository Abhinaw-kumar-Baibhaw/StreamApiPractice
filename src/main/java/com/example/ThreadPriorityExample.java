package com.example;

public class ThreadPriorityExample {
    public static void main(String[] args) {
        Thread highPriorityThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("High priority thread is executing");
            }
        });

        Thread lowPriorityThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Low priority thread is executing");
            }
        });

        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        highPriorityThread.start();
        lowPriorityThread.start();
    }
}

