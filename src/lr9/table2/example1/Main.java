package lr9.table2.example1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Введите длину массива: ");
            int arrLength = in.nextInt();

            int[] arr = new int[arrLength];

            double avg = 0.0;
            int count = 0;

            System.out.println("Введите значения: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
                avg += arr[i];

                if (arr[i] > 0) {
                    count++;
                }
            }
            if (count == 0) {
                throw new ArithmeticException("положительные элементы отсутствуют");
            }
            avg /= arrLength;
            System.out.print("Среднее значение: " + avg + ", список: " + Arrays.toString(arr));
        } catch (NegativeArraySizeException e) {
            System.err.println("ошибка: неверная длина массива");
        } catch (NumberFormatException | InputMismatchException e) {
            System.err.println("ошибка: несоответствие числового типа данных");
        } catch (ArithmeticException e) {
            System.err.println("ошибка: " + e.getMessage());
        }
    }
}
/*
В программе, вычисляющей среднее значение среди положительных элементов одномерного массива (тип элементов int),
 вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
–	ввод строки вместо числа;
–	несоответствие числового типа данных;
–	положительные элементы отсутствуют.
 */