package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();
        int c = a + b;
        int e = a - b;

        System.out.println(a + "+" + b + "=" + c);
        System.out.println(a + "-" + b + "=" + e);
        in.close();
    }
}
