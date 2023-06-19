package lr9.table2.example3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Введите длину массива: ");
            byte arrLength = in.nextByte();

            byte[] arr = new byte[arrLength];
            int sum = 0;

            System.out.println("Введите значения: ");

            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextByte();
                sum += arr[i];
            }
            System.out.println("Сумма элементов: " + sum + ", список: " + Arrays.toString(arr));
        } catch (NegativeArraySizeException e) {
            System.err.println("ошибка: неверная длина массива");
        } catch (ArithmeticException e) {
            System.err.println("ошибка: выход за границы массива");
        } catch (NumberFormatException | InputMismatchException e) {
            System.err.println("ошибка: ввод строки вместо числа");
        }
    }
}
/*
В программе, вычисляющей сумму элементов типа byte одномерного массива,
 вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
–	ввод строки вместо числа;
–	ввод или вычисление значения за границами диапазона типа.
 */