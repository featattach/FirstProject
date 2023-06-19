package lr11.example6.arrayDeque.add;

import java.util.ArrayDeque;

public class ArrayDequeAddingToTheMiddle {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < 11000000; i++) {
            arrayDeque.add(i);
        }
        System.out.println("Время выполнения операции добавления arrayDeque = " + getRunningTime(arrayDeque));
    }
    private static long getRunningTime(ArrayDeque<Integer> list){
        long start = System.currentTimeMillis();

        for (int i = 0; i < 11000000; i++) {
            if (i == 5500000) {
            list.add(1);
            }
        }
        long end = System.currentTimeMillis();

        return end - start;

    }
}
