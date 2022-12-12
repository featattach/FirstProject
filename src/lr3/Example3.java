package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сколько чисел суммировать");
        int x = in.nextInt();
        int[] fibb = new int[x];
        int o = 2;
        int z = 2;
        fibb[0] = 0;
        fibb[1] = 1;

        while (o < fibb.length) {
            fibb[o] = fibb[o - 1] + fibb[o - 2];
          //  System.out.println("while " + fibb[o]);
            o++;
        }
        while (z-1<fibb.length) {
            System.out.println( "while "+ fibb[z-1]);
            z++;
        }
        for (int i = 2; i < fibb.length; ++i) {
            fibb[i] = fibb[i - 1] + fibb[i - 2];
        }
        for (int e = 1; e < fibb.length; ++e) {
            System.out.println("for " + fibb[e]);
        }
    }
}


//3. Напишите программу, которая выводит последовательность чисел
//        Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//        следующее число равно сумме двух предыдущих (получается по-
//        следовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
//        в последовательности вводится пользователем. Предложите версии
//        программы, использующие разные операторы цикла.