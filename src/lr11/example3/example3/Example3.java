package lr11.example3.example3;

import java.util.Arrays;
import java.util.Scanner;

public class Example3 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите длину массива: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        inputArr(arr, size, 0);

        System.out.println("Элементы массива: ");
        outputArr(arr, size, 0);
    }
    public static void inputArr(int[] arr, int size, int index){
        if (index < size) {
            arr[index] = in.nextInt();
            inputArr(arr, size, index + 1);
        }
    }

    public static void outputArr(int[] arr, int size, int index){
        if (index < size) {
            System.out.print(arr[index] + ", ");
            outputArr(arr, size,  index + 1);
        }
    }
}