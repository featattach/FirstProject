package timus.task_1753;

import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int h1 = in.nextInt();
        int h2 = in.nextInt();
        int l = in.nextInt();


        double x = sqrt(pow(h1, 4.0 / 3.0) * pow(h2, 2.0 / 3.0) / pow(2, 2.0 / 3.0) - pow(h1, 2.0));
        double result = h2 / 2.0 * 1 / sqrt(1 + pow(h1 / x, 2.0)) - x;
        if (result <= l && result > 0) {
            System.out.format("%.6f", result);
        } else {
            System.out.format("%.6f", 0.0);
        }

    }
}
