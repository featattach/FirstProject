package lr11.example6.arrayList.add;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddingToTheEnd {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 11000000; i++) {
            arrayList.add(i);
        }
        System.out.println("Время выполнения операции добавления arrayList = " + getRunningTime(arrayList));

    }

    private static long getRunningTime(List<Integer> list){
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();

        return end - start;

    }
}
