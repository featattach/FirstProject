package lr3;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Размер массива ");
        int size = in.nextInt();
        char a = 'a';
        char[] mass = new char[size];
        for (char i = 0; i < mass.length; i++) {
            mass[i] = a++;
            a++;
            System.out.println(mass[i]);
        }
    }
}

// Напишите программу, в которой создается одномерный символьный массив из 10 элементов.
// Массив заполняется буквами «через одну», начиная с буквы ' а ':
// то есть массив заполняется буквами 'а', 'с', ' е', 'д' и так далее.
// Отобразите массив в консольном окне в прямом и обратном порядке. Размер массива задается переменной.