package lr11.example6.SortedMap.get;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapGetElement {
    public static void main(String[] args) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        for (int i = 0; i < 11000000; i++) {
            sortedMap.put(i + "hello", i);
        }
        System.out.println("Время выполнения операции добавления sortedMap = " + getRunningTime(sortedMap));
    }
    private static long getRunningTime(SortedMap<String, Integer> list){
        long start = System.currentTimeMillis();

        System.out.println(list.get("9999999hello"));
        long end = System.currentTimeMillis();

        return end - start;

    }
}
