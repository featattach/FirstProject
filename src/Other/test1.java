package Other;

import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        Random in = new Random();
        int[] x = new int[10];
        System.out.println("до сортировки");

        for (int i = 0; i<10; i++){
            x[i] = in.nextInt(10);
            System.out.print(x[i]+" ");
        }
        for(int i = x.length-1; i>0;i--){
            for(int j = 0;j<i;j++){
                if (x[j] > x[j+1]) {
                    int tmp = x[j];
                    x[j]=x[j+1];
                    x[j+1] = tmp;
                }
            }
        }
        System.out.println();
        System.out.println("после сортировки");
        for(int i = 0; i<10;i++){
            System.out.print(x[i]+" ");
        }

    }

}
