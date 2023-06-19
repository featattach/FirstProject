package lr11.example3.example6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Example6 {
    public static void main(String[] args) {
        HashMap<Integer, String> maps = new HashMap<>();
        maps.put(1, "один");
        maps.put(2, "два");
        maps.put(3, "три");
        maps.put(4, "четыре");
        maps.put(5, "пять");
        maps.put(6, "шесть");
        maps.put(7, "семь");
        maps.put(8, "восемь");
        maps.put(9, "девять");
        maps.put(10, "десять");
        System.out.println(maps);

        int result = 1;
        for (Map.Entry<Integer, String> map : maps.entrySet()) {
            if (map.getKey() > 5) {
                System.out.println("Строки, у которых ключ больше 5: " + map.getValue() + " ");
            }
            if (map.getValue().length() > 5) {
                result *= map.getKey();
            }
            if (map.getKey() == 0) {
                System.out.println(Arrays.toString(map.getValue().split(", ")));
            }
        }
        System.out.println("Результат перемноженных строк, длина которых больше 5: " + result);
    }
}
