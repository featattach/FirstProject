package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(100));
            System.out.println(list.get(i));
        }

        List<Integer> filterList = filterIntegersForBigger(list);

        System.out.println("filterList: ");
        filterList.forEach(System.out::println);
    }

    public static List<Integer> filterIntegersForBigger(List<Integer> integers) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для фильтра списка: ");
        int num = in.nextInt();
        return integers.stream().filter(x -> x > num).collect(Collectors.toList());
    }
}
/*
8.	Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
содержащий только те числа, которые больше заданного значения.
 */