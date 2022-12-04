package timus.Task_1264;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int numberofM = m + 1;
        int result = n * numberofM;
        System.out.println(result);
    }
}
