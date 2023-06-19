package lr12;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        String str = "7.\tНапишите функцию, которая принимает на вход список строк и возвращает новый список," +
                " содержащий только те строки, которые имеют длину больше заданного значения.";

        List<String> list = List.of(str.split(" "));
        for (String a : list) {
            System.out.println(a);
        }

        List<String> filterList = filterCountStr(list);

        System.out.println("filterList: ");
        filterList.forEach(System.out::println);
    }

    public static List<String> filterCountStr(List<String> strings) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину строки: ");
        int count = in.nextInt();
        return strings.stream().filter(s -> s.length() > count).collect(Collectors.toList());
    }
}
/*
7.	Напишите функцию, которая принимает на вход список строк и возвращает новый список, содержащий только те строки,
 которые имеют длину больше заданного значения.
 */