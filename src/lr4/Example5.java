package lr4;

import java.util.Arrays;
import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = 5;
        int j = 3;
        int[][] array1 = new int[i][j];
        int[][] array2 = new int[j][i];
        for (int x = 0; x < array1.length; x++) {
            for (int y = 0; y < j; y++) {
                array1[x][y] = random.nextInt(10);
            }
        }
        System.out.println("массив до транспонирования");
        for (int x = 0; x < i; x++) {
            for (int y = 0; y < j; y++) {
                System.out.print(array1[x][y] + " ");
            }
            System.out.println();
        }

        for (int x = 0; x < j; x++) {
            for (int y = 0; y < i; y++) {
                array2[x][y] = array1[y][x];
            }
        }

System.out.println("после транспонирования");
        for (int x = 0; x < j; x++) {
            for (int y = 0; y < i; y++) {
                System.out.print(array2[x][y] + " ");
            }
            System.out.println();
        }
    }
}
//   Напишите программу, в которой создается двумерный целочисленный
//    массив. Он заполняется случайными числами. Затем в этом массиве строи и
//        столбцы меняются местами: первая строка становится первым столбцом,
//        вторая строка становиться вторым столбцом и так далее. Например, если
//        исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
//        из 5 строк и 3 столбцов.