package timus.Task_1010;
//Дана дискретная функция. Она определена для целых аргументов из диапазона от 1 до N и может принимать значения от −231 до 231−1. Требуется найти такие две точки A и B на графике функции, для которых все точки между ними расположены строго ниже прямой AB. Среди всех допустимых пар нужно выдать такую, для которой модуль углового коэффициента прямой AB максимален.
//        Исходные данные
//        В первой строке дано целое число N (2 ≤ N ≤ 100000). Затем следует N строк со значениями функции для аргументов 1, 2, …, N соответственно.
//        Результат
//        Выведите пару целых чисел — абсциссы искомых точек A и B. Первое число должно быть меньше второго. Если существует множество решений, выведите пару с наименьшим первым числом.
//        Пример
//        исходные данные	результат
//        3
//        2
//        6
//        4
//        1 2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long k = 0;
        int p1 = 0;
        int p2 = 0;
        int N = sc.nextInt();
        long prev = sc.nextLong();
        for (int i = 2; i <= N; i++) {
            long current = sc.nextLong();
            if (Math.abs(current - prev) > k) {
                k = Math.abs(current - prev);
                p1 = i - 1;
                p2 = i;
            }
            prev = current;
        }

        System.out.println(p1 + " " + p2);
    }
}