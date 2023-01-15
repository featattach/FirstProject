package timus.Task_1001;
//Эта задача настолько проста, что авторы даже поленились сочинить для нее условие!
//        Исходные данные
//        Входной поток содержит набор целых чисел Ai (0 ≤ Ai ≤ 1018), отделённых друг от друга произвольным количеством пробелов и переводов строк. Размер входного потока не превышает 256 КБ.
//        Результат
//        Для каждого числа Ai, начиная с последнего и заканчивая первым, в отдельной строке вывести его квадратный корень не менее чем с четырьмя знаками после десятичной точки.
//        Пример
//        исходные данные	результат
//        1427  0
//
//        876652098643267843
//        5276538

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat dF = new DecimalFormat( "0.0000");
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();
        System.out.println(dF.format(Math.sqrt(x4)));
        System.out.println(dF.format(Math.sqrt(x3)));
        System.out.println(dF.format(Math.sqrt(x2)));
        System.out.println(dF.format(Math.sqrt(x1)));

    }
}

