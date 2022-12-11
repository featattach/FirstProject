package lr3;

import kotlin.random.URandomKt;

import java.util.*;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Размер массива");
        int size = in.nextInt();
        int[] massiv = new int[size];
        Random random = new Random();

        for(int i = 0; i<massiv.length; i++){
            massiv[i] = random.nextInt(1000);
        }
        Arrays.sort(massiv);

        while (size>=1){
            System.out.println(massiv[size-1]);
            size--;
        }
    }
}
