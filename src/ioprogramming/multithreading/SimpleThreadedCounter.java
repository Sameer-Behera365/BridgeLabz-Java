package ioprogramming.multithreading;

import java.util.Scanner;

class CounterThread extends Thread {
    private int start;
    private int end;

    public CounterThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        synchronized (CounterThread.class) {
            for (int i = start; i <= end; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}

public class SimpleThreadedCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter counting limit: ");
            int limit = sc.nextInt();

            if (limit <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            int mid = limit / 2;

            CounterThread t1 = new CounterThread(1, mid);
            CounterThread t2 = new CounterThread(mid + 1, limit);

            t1.setName("Thread-1");
            t2.setName("Thread-2");

            t1.start();
            t2.start();

            t1.join();
            t2.join();

            System.out.println("Counting completed successfully.");

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            sc.close();
        }
    }
}