package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int result1 = x % 5;
        int result2 = x % 7;

        if (result1 == 2) {
            System.out.println("Делится на 5 с остатком 2");
        }else if (result1 == 0){
            System.out.println("Делится на 5 без остатка");
        } else {
            System.out.println("Делится на 5 с другим остатком");
        }
        if (result2 == 1){
            System.out.println("Делится на 7 с остатком 1");
        } else if (result2 == 0){
            System.out.println("Делится на 7 без остатка");
        }  else  {
            System.out.println("Делится на 7 с другим остатком");
        }
    }
}
