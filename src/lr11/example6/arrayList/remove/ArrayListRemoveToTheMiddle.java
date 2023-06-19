package lr11.example6.arrayList.remove;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveToTheMiddle {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 11000000; i++) {
            arrayList.add(i);
        }

        System.out.println("Время выполнения операции удаления arrayList = " + getRunningTime(arrayList));
    }

    private static long getRunningTime(List<Integer> list){
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1; i++) {
            list.remove(5500000);
        }
        long end = System.currentTimeMillis();

        return end - start;

    }
}
