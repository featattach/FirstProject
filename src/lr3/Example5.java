package lr3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько чисел суммровать?");
        int x = in.nextInt();
        int n = 0;
        int count = 0;
        int sum = 0;
        while (count < x) {
            if (n % 5 == 2 || n % 3 == 1) {
                count++;
                sum += n;
                System.out.print(n + "+");
            }
            n++;
        }
        System.out.println("=" + sum);
//
//        int y = 0;
//        int z = 0;
//        for (int i = 0; i < x;) {
//            for(y % 5 == 2 || y % 3 == 1;y++) {
//                i++;
//                z += y;
//                System.out.print(z+"+");
//            }
//            y++;
//        }
//        System.out.println("="+z);

    }
}


//5. Напишите программу, в которой вычисляется сумма чисел,
//        удовлетворяющих таким критериям: при делении числа на 5 в остатке получа-ется 2,
//        или при делении на 3 в остатке получается 1.
//        Количество чисел в сумме вводится пользователем.
//        Программа отображает числа, которые суммируются, и значение суммы.
//        Предложите версии программы, использующие разные операторы цикла.