package lr13;


public class Example3 {
    private static final Object lock = new Object();
    private static int number = 1;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                while (number < 10) {
                    if (number % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            System.out.println("Error: " + e);
                        }
                    }
                    lock.notify();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                while (number < 10) {
                    if (number % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + "Error: " + number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            System.out.println("Error: " + e);
                        }
                    }
                    lock.notifyAll();
                }
            }
        });

        thread1.setName("Even Thread");
        thread2.setName("Odd Thread");

        thread1.start();
        thread2.start();

    }
}
/*
3. Напишите программу, которая создает два потока, которые выводят на экран числа от 1 до 10.
 Первый поток должен выводить только четные числа, а второй поток должен выводить только нечетные числа.
 */