package lr3;

import javax.swing.*;
import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0;
        int size = in.nextInt();

        while (count < size){
            System.out.println("count < 10, count = " + count);
            count++;
        }

    }
}
