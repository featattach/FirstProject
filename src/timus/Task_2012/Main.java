package timus.Task_2012;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int numberOfTasks = in.nextInt();
        int diggerence = 12 - numberOfTasks;
        int time = diggerence * 45;
        if(time < 240){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        out.flush();
    }
}
