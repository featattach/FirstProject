package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        System.out.println("list: ");
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
            System.out.println(list.get(i));
        }

        List<Integer> listSquare = squareList(list);

        System.out.println("\n" + "listSquare: ");
        listSquare.forEach(System.out::println);

    }

    public static List<Integer> squareList(List<Integer> list) {
        return list.stream().map(x -> x * x).collect(Collectors.toList());
    }
}
/*
4.	Напишите функцию, которая принимает на вход список чисел и возвращает новый список, содержащий квадраты этих чисел.
 */