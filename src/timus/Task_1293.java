package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task_1293 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        System.out.println(N*A*B*2);
    }
}
