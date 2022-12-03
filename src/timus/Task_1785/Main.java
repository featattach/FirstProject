package timus.Task_1785;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();

        if (a>= 1 && a <= 4){
            System.out.printf("few");
        } else if (a>= 5 && a <= 9){
            System.out.printf("several");
        } else if (a>= 10 && a <= 19){
            System.out.printf("pack");
        } else if (a>= 20 && a <= 49){
            System.out.printf("lots");
        } else if (a>= 50 && a <= 99){
            System.out.printf("horde");
        } else if (a>= 100 && a <= 249){
            System.out.printf("throng");
        } else if (a>= 250 && a <= 499){
            System.out.printf("swarm");
        }else if (a>= 500 && a <= 999){
            System.out.printf("zounds");
        }else if (a >= 1000){
            System.out.printf("legion");
        }
        out.println();
        out.flush();
    }
}
