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
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(100);
        }

        Arrays.sort(massiv); // сортируем по порядку

//        while (size>=1){
//            System.out.println(massiv[size-1]); //выводит в консоль в обратном порядке, но значения в массиве те же
//        size--;
//
//        }
        for(int i = massiv.length; i >= 0; i--){
            for(int x = 0; x < i-1; x++){
                if (massiv[x] < massiv[x+1]){
                    int tmp = massiv[x];
                    massiv[x] = massiv[x+1];
                    massiv[x+1] = tmp;
                }
            }
        }
        for(int i = 0; i<massiv.length; i++)
            System.out.println(massiv[i]);

    }
}

