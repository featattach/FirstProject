package lr12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        String str = "Напишите функцию, которая принимает на вход список строк и возвращает новый список, содержащий " +
                "только те строки, которые содержат заданную подстроку.";

        List<String> list = List.of(str.split(" "));

        System.out.println("list: ".toUpperCase());
        for (String a : list) {
            System.out.println(a);
        }

        List<String> filterList = filterStr(list);

        System.out.println("filter_List: ".toUpperCase());
        filterList.forEach(System.out::println);
    }

    public static List<String> filterStr(List<String> strings) {
        String el = "ст";
        return strings.stream().filter(x -> x.contains(el)).collect(Collectors.toList());
    }
}
/*
5.	Напишите функцию, которая принимает на вход список строк и возвращает новый список, содержащий только те строки,
которые содержат заданную подстроку.
 */