package lr4;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arrayNums = new int[2][3];
        int[][] arrayFinish = new int[3][2];
        for (int i = 0; i < arrayNums.length; i++) {
            for (int y = 0; y < arrayNums.length; y++) {
                arrayNums[i][y] = random.nextInt(10);
            }
        }
//        for (int i = 0; i < arrayNums.length; i++) {
//            for (int y = 0; y < arrayNums.length; y++) {
//                System.out.println(arrayNums[i][y]);
//            }
//        }
        for (int i = 0; i < arrayNums.length; i++) {
            for (int y = 0; y < arrayNums.length; y++)
                arrayFinish[i][y] = arrayNums[y][i];
        }
        System.out.println("я кончил");
//        for (int i = 0; i < arrayNums.length; i++) {
//            for (int y = 0; y < arrayNums.length; y++) {
//                System.out.println(arrayFinish[i][y]);
//            }
//        }
    }
}


//    Напишите программу, в которой создается двумерный целочисленный
//    массив. Он заполняется случайными числами. Затем в этом массиве строи и
//        столбцы меняются местами: первая строка становится первым столбцом,
//        вторая строка становиться вторым столбцом и так далее. Например, если
//        исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
//        из 5 строк и 3 столбцов.