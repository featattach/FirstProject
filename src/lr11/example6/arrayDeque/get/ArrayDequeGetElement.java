package lr11.example6.arrayDeque.get;

import java.util.ArrayDeque;

public class ArrayDequeGetElement {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < 11000000; i++) {
            arrayDeque.add(i);
        }
        System.out.println("Время выполнения операции получения arrayDeque = " + getRunningTime(arrayDeque));
    }
    private static long getRunningTime(ArrayDeque<Integer> list){
        long start = System.currentTimeMillis();

        System.out.println(list.getLast());
        long end = System.currentTimeMillis();

        return end - start;

    }
}
