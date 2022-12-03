package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int res1 = a % 4;

        if (res1 == 0 && a > 10) {
            System.out.println("Число подходит");
        } else {
            System.out.println("Число не подходит");
        }




    }
}
