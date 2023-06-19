package lr12;

import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        String str = "9. Напишите функцию, 4 которая принимает $ на вход 55 список строк и возвращает новый список," +
                " содержащий только те строки, 9( ) которые содержат только буквы 6 (без цифр и символов).";

        List<String> list = List.of(str.split(" "));

        System.out.println("list: ".toUpperCase());
        for (String a : list) {
            System.out.println(a);
        }

        List<String> filterList = filterStringForLetter(list);

        System.out.println("filter_list: ".toUpperCase());
        filterList.forEach(System.out::println);
    }

    public static List<String> filterStringForLetter(List<String> strings) {
        return strings.stream().filter(s -> s.matches("[а-яА-Я]+")).collect(Collectors.toList());
    }
}
/*
9.	Напишите функцию, которая принимает на вход список строк и возвращает новый список, содержащий только те строки,
 которые содержат только буквы (без цифр и символов).
 */