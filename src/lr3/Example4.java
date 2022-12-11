package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1-ое число");
        int a = in.nextInt();
        System.out.println("Введите 2-ое число");
        int b = in.nextInt();

        for (int i = a; i<=b; i++){
            System.out.println("for " + i);
        }
        while (a<=b) {
            System.out.println("while " + a);
            a++;
        }



    }
}

//    Напишите программу,
//    которой пользователем вводится два целых числа.
//    Программа выводит все целые числа — начиная с наименьшего (из двух введенных чисел) и заканчивая наибольшим (из двух введенных чисел).
//    Предложите разные версии программы (с использованием разных операторов цикла).