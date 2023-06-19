package lr11.example6.SortedMap.remove;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapRemoveToTheBeginning {
    public static void main(String[] args) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        for (int i = 0; i < 11000000; i++) {
            sortedMap.put(i + "hello", i);
        }
        System.out.println("Время выполнения операции добавления sortedMap = " + getRunningTime(sortedMap));
    }
    private static long getRunningTime(SortedMap<String, Integer> list){
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1; i++) {
            list.remove("0hello");
        }
        long end = System.currentTimeMillis();

        return end - start;

    }
}
