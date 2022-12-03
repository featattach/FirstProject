package timus.Task_1001;
        /*На тимусе не проходит, знаю почему но решить не могу*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        DecimalFormat dF = new DecimalFormat( "0.0000");
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();
        System.out.println(dF.format(Math.sqrt(x4)));
        System.out.println(dF.format(Math.sqrt(x3)));
        System.out.println(dF.format(Math.sqrt(x2)));
        System.out.println(dF.format(Math.sqrt(x1)));

    }
}

