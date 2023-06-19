package lr12;

import java.util.*;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        System.out.println("list: ");
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(100));
            if (list.get(i) == 0) {
                continue;
            }
            System.out.println(list.get(i));
        }

        List<Integer> filterList = filterListForDivision(list);

        System.out.println("filterList: ");
        filterList.forEach(System.out::println);
    }

    public static List<Integer> filterListForDivision(List<Integer> integers) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число, на которое будут делиться значения: ");
        int value = in.nextInt();

        return integers.stream().filter(x -> x % value == 0).filter(x -> x != 0).collect(Collectors.toList());
    }
}
/*
6.	Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список, содержащий
только те числа, которые делятся на заданное число без остатка.
 */