package lr9.table2.example2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Введите количество строк матрицы: ");
            int rows = in.nextInt();

            System.out.print("Введите количество столбцов матрицы: ");
            int columns = in.nextInt();

            int[][] matrix = new int[rows][columns];

            System.out.println("Введите значения матрицы: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = in.nextInt();
                }
            }

            System.out.println("Введите номер столбца: ");
            int columnNumber = in.nextInt();


            if (columnNumber < 1 || columnNumber > columns) {
                throw new ArrayIndexOutOfBoundsException("ошибка");
            }

            System.out.println("Стобец: " + columnNumber);
            for (int i = 0; i < rows; i++) {
                System.out.println(matrix[i][columnNumber - 1]);
            }

            System.out.println("Матрица: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        } catch (NegativeArraySizeException e) {
            System.err.println("ошибка: отрицательный размер матрицы");
        } catch (NumberFormatException | InputMismatchException e) {
            System.err.println("ошибка: неверное значение");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage() + ": данного столбца не существует");
        }
    }
}
/*
В программе, где требуется из матрицы вывести столбец с номером, заданным с клавиатуры,
могут возникать ошибки в следующих случаях:
–	ввод строки вместо числа;
–	нет столбца с таким номером.

 */