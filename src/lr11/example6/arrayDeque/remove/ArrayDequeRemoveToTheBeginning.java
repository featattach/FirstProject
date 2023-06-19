package lr11.example6.arrayDeque.remove;

import java.util.ArrayDeque;

public class ArrayDequeRemoveToTheBeginning {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < 11000000; i++) {
            arrayDeque.add(i);
        }
        System.out.println("Время выполнения операции удаления arrayDeque = " + getRunningTime(arrayDeque));
    }
    private static long getRunningTime(ArrayDeque<Integer> list){
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1; i++) {
            list.removeFirst();
        }
        long end = System.currentTimeMillis();

        return end - start;

    }
}
