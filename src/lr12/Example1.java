package lr12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размерность массива: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
        }
        System.out.println("arr: " + "\n" + Arrays.toString(arr));

        int[] arrResult = EvenNumbers(arr);
        System.out.println("arrResult: " + "\n" + Arrays.toString(arrResult));
    }

    public static int[] EvenNumbers(int[] arr) {
        return Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
    }
}
/*
1.	Напишите функцию, которая принимает на вход массив целых чисел и возвращает новый массив, содержащий только
 четные числа из исходного массива.
 */