package lr3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько чисел суммровать?");
        int n = in.nextInt();
        int x = 0;
        int[] mass = new int[n];
        for (int i = 0; i<mass.length; i++){
            mass[i] = i;


        }




    }
}

//5. Напишите программу, в которой вычисляется сумма чисел,
//        удовлетворяющих таким критериям: при делении числа на 5 в остатке получа-ется 2,
//        или при делении на 3 в остатке получается 1.
//        Количество чисел в сумме вводится пользователем.
//        Программа отображает числа, которые суммируются, и значение суммы.
//        Предложите версии программы, использующие разные операторы цикла.