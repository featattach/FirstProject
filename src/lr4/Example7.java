package lr4;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        int snake[][] = new int[10][10];
        int tail = 0;
        int body = 0;
        int h = 0;
        for (int i = 0 ; h <snake.length ; h++) {
            for (int j = 0 ; j <(snake[i].length - tail); j++) {
                snake[i][j] = body;
                body++;
            }
            i++;
            for (int k = i; k <snake.length; k++) {
                snake[k][snake[i].length-1-tail] = body;
                body++;
            }
            tail++;
        }
        int z = 0;
        for (int i =0; i < snake.length; i++){
            int count = i+1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j <snake[i].length; j++){
                System.out.print(snake[i][j]+" ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;
        }

    }
}


//    Напишите программу, в которой создается двумерный числовой массив
//        и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
//        затем последний столбец (снизу вверх), вторая строка (слева направо) и так
//        далее.