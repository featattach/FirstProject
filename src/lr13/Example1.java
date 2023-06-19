package lr13;

import java.time.LocalTime;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
            }
        });

        Thread thread2 = new Thread(() -> {

            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
/*
1. Напишите программу, которая запускает два потока и выводит на экран их имена и текущее время в течение 10 секунд.
 */