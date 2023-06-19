package lr11.example3.example2;

import java.util.Scanner;

public class Example2 {
    public static void get(int x) {
        if (x != 1) {
            get(x / 2);
        }
        System.out.print(x % 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число, которое хотите перевести из десятичной системы счисления в двоичную: ");
        int value = in.nextInt();
        get(value);
    }
}
/*
2. Создать приложение с использованием рекурсии для перевода целого числа, введенного с клавиатуры,
 в двоичную систему счисления.
 */