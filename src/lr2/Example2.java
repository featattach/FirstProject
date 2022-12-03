package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int result1 = x % 5;
        int result2 = x % 7;

        if (result1 == 2) {
            System.out.println("Делится с остатком 2");
        }else {
            System.out.println("Делится на 5 без остатка");
        }
        if (result2 == 1){
            System.out.println("Делится на 7 с остатком 1");
        } else {
            System.out.println("Делится на 7 без остатка");
        }
    }
}
