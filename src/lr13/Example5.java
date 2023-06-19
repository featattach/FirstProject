package lr13;

import org.apache.poi.ss.formula.functions.T;

public class Example5 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 2, 1, 7, 3, 5, 8, 9};
        max(arr);
    }

    public static int max;

    public static void max(int[] arr) {
        Thread thread1 = new Thread(() -> {
            max = arr[0];
            boolean isTrue = false;

            while (!isTrue) {
                isTrue = false;
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + max);
                    isTrue = true;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Error: " + e);
                    }
                }
            }
            System.out.println(Thread.currentThread().getName() + " max: " + max);
        });

        Thread thread2 = new Thread(() -> {
            max = arr[0];

            boolean isTrue = false;

            while (!isTrue) {
                isTrue = false;
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + max);
                    isTrue = true;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Error: " + e);
                    }
                }
            }
            System.out.println(Thread.currentThread().getName() + " max: " + max);
        });

        thread1.start();
        thread2.start();
    }
}
/*
5. Напишите функцию, которая находит максимальный элемент в массиве целых чисел при помощи многопоточности.
Количество потоков должно быть равно количеству ядер процессора.
 */