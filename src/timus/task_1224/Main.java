package timus.task_1224;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        System.out.println(spiral(n, m));

    }
    public static long spiral(long n, long m) {

        if (n <= m) {
            return  4*(n/2) - 2*((n + 1) % 2);
        }

        return 4*(m/2) - 2*((m + 1) % 2) + 1;

    }
}
