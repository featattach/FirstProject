package lr12;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        String str = "3. Напишите функцию, которая принимает на вход Список строк и возвращает новый список, " +
                "содержащий только те Строки , которые начинаются С Большой Буквы.";
        List<String> list = List.of(str.split(" "));
        System.out.println("list: ");
        for (String a : list) {
            System.out.print(a + " ");
        }

        List<String> listResult = filterCapitalizedString(list);
        System.out.println("\n\n" + "listResult: ");
        for (String a : listResult) {
            System.out.print(a + " ");
        }
    }

    public static List<String> filterCapitalizedString(List<String> str) {
        return str.stream().filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}
/*
3.	Напишите функцию, которая принимает на вход список строк и возвращает новый список, содержащий только те строки,
которые начинаются с большой буквы.
 */