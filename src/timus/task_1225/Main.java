package timus.task_1225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        long[] m = new long[46];

        m[1] = 2;
        m[2] = 2;
        for (int i = 3; i <= n; i++) {
            m[i] = m[i - 1] + m[i - 2];
        }

        System.out.println(m[n]);

        in.close();
    }
}
