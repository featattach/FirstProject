package lr13;

public class Example4 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() ->
                System.out.println("thread1: id " + Thread.currentThread().threadId()));

        Thread thread2 = new Thread(() ->
                System.out.println("thread2: id " + Thread.currentThread().threadId()));

        Thread thread3 = new Thread(() ->
                System.out.println("thread3: id " + Thread.currentThread().threadId()));

        Thread thread4 = new Thread(() ->
                System.out.println("thread4: id " + Thread.currentThread().threadId()));

        Thread thread5 = new Thread(() ->
                System.out.println("thread5: id " + Thread.currentThread().threadId()));

        Thread thread6 = new Thread(() ->
                System.out.println("thread6: id " + Thread.currentThread().threadId()));

        Thread thread7 = new Thread(() ->
                System.out.println("thread7: id " + Thread.currentThread().threadId()));

        Thread thread8 = new Thread(() ->
                System.out.println("thread8: id " + Thread.currentThread().threadId()));

        Thread thread9 = new Thread(() ->
                System.out.println("thread9: id " + Thread.currentThread().threadId()));

        Thread thread10 = new Thread(() ->
                System.out.println("thread10: id " + Thread.currentThread().threadId()));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
    }
}
/*
4. Напишите программу, которая создает 10 потоков и каждый поток выводит на экран свой номер.
 */