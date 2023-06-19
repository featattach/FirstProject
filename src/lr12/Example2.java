package lr12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размерность массива: ");
        int size = in.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        for (int i = 0; i < size; i++) {
            arr1[i] = random.nextInt(100);
            arr2[i] = random.nextInt(100);
        }
        System.out.println("arr1: " + "\n" + Arrays.toString(arr1));
        System.out.println("arr2: " + "\n" + Arrays.toString(arr2));

        int[] arrResult = commonArr(arr1, arr2);
        System.out.println("arrResult: " + "\n" + Arrays.toString(arrResult));
    }
    public static int[] commonArr(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1)
                .filter(x -> Arrays.stream(arr2)
                        .anyMatch(y -> y == x))
                .toArray();
    }
}
/*
2.	Напишите функцию, которая принимает на вход два массива целых чисел и возвращает новый массив, содержащий только
те элементы, которые есть в обоих массивах.
 */