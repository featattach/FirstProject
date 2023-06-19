package lr11.example3.example7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example7 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("Время выполнения операции удаления linkedList = " + getRunningTime(linkedList));

        List<Integer> arrayList = new ArrayList<>();
        System.out.println("Время выполнения операции удаления arrayList = " + getRunningTime(arrayList));
    }

    private static long getRunningTime(List<Integer> list) {
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();

        while (list.size() != 1) {
            for (int i = 0; i < list.size(); i++) {
                if (i + 1 < list.size()) {
                    list.remove(i + 1);
                }
            }
        }
        System.out.println("size " + list.size());
        long end = System.currentTimeMillis();

        return end - start;
    }
}
/*
Сложность удаления элементов ArrayList O(1), если они находятся в
конце и O(N) во всех остальных случаях.
LinkedList имеют сложность O(1) для удаления с начала или конца и O(N) в других случаях.
При удалении ArrayList, требует смещения всех последних элементов, а LinkedList, должен пройти по списку с начала
или с конца, в зависимости от того, что ближе к указанному индексу.
Любая индексированная операция LinkedList требует обхода, т.е. имеет производительность O(n), что приводит к работе
алгоритмов на O (n) медленнее, чем при использовании ArrayList.
 */